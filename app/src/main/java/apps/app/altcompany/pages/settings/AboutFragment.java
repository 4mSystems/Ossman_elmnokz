package apps.app.altcompany.pages.settings;

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

import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentAboutBinding;
import apps.app.altcompany.databinding.FragmentPrivacyBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.register.models.PrivacyResponse;
import apps.app.altcompany.pages.settings.viewModels.SettingsViewModel;
import apps.app.altcompany.utils.Constants;

public class AboutFragment extends BaseFragment {
    Context context;
    FragmentAboutBinding binding;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setAboutViewModel(viewModel);
        viewModel.about();
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.ABOUT)) {
                viewModel.setPrivacyData(((PrivacyResponse) mutable.object).getData());
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
