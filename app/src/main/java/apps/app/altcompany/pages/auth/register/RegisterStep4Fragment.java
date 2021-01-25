package apps.app.altcompany.pages.auth.register;

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

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentRegisterStep3Binding;
import apps.app.altcompany.databinding.FragmentRegisterStep4Binding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.confirmCode.ConfirmCodeFragment;
import apps.app.altcompany.pages.auth.models.UsersResponse;
import apps.app.altcompany.pages.auth.register.models.RegisterStep1Response;
import apps.app.altcompany.pages.auth.register.models.packages.PackageResponse;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.session.UserHelper;

public class RegisterStep4Fragment extends BaseFragment {
    private Context context;
    private FragmentRegisterStep4Binding binding;
    @Inject
    RegisterViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_step4, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setRegisterStep1ViewModel(viewModel);
        viewModel.getPackages();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.NOT_VERIFIED.equals(mutable.message)) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, ((UsersResponse) mutable.object).getData().getEmail()), null, ConfirmCodeFragment.class.getName(), null);
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
