package apps.app.altcompany.pages.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentHomeBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.home.models.HomeResponse;
import apps.app.altcompany.pages.home.viewModels.HomeViewModel;
import apps.app.altcompany.utils.Constants;

public class HomeFragment extends BaseFragment {
    Context context;
    FragmentHomeBinding binding;
    @Inject
    HomeViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setHomeViewModel(viewModel);
        viewModel.setupSlider(binding.imageSlider);
        viewModel.home();
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.HOME)) {
                viewModel.setHomeData(((HomeResponse) mutable.object).getData());
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getOrdersRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
