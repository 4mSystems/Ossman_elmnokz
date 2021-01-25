package apps.app.altcompany.pages.splash;

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

import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.R;
import apps.app.altcompany.databinding.FragmentSplashBinding;
import apps.app.altcompany.pages.auth.login.LoginFragment;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;

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
        binding.setSplashViewModel(viewModel);
        viewModel.splashStart();
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.LOGIN)) {
                MovementHelper.startActivityBase(context, LoginFragment.class.getName(), null, null);
            } else if (mutable.message.equals(Constants.HOME)) {
                MovementHelper.startActivityMain(context);
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
