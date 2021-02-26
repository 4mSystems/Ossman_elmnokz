package te.app.mezzastore.pages.splash;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;


import javax.inject.Inject;

import te.app.mezzastore.base.BaseFragment;
import te.app.mezzastore.base.IApplicationComponent;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.R;
import te.app.mezzastore.databinding.FragmentSplashBinding;
import te.app.mezzastore.pages.home.HomeFragment;
import te.app.mezzastore.utils.Constants;
import te.app.mezzastore.utils.helper.MovementHelper;

public class SplashFragment extends BaseFragment {
    private Context context;
    @Inject
    SplashViewModel viewModel;
    FragmentSplashBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.splashStart();
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.HOME)) {
                MovementHelper.startActivityBase(context, HomeFragment.class.getName(), null, null);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
