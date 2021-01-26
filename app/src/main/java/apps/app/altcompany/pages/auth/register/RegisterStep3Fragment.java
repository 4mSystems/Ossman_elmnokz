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
import apps.app.altcompany.base.ParentActivity;
import apps.app.altcompany.databinding.FragmentRegisterStep2Binding;
import apps.app.altcompany.databinding.FragmentRegisterStep3Binding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.confirmCode.ConfirmCodeFragment;
import apps.app.altcompany.pages.auth.register.models.RegisterStep1Response;
import apps.app.altcompany.pages.auth.register.models.categories.CategoriesResponse;
import apps.app.altcompany.pages.auth.register.models.packages.PackageResponse;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.PopUp.PopUpMenuHelper;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.session.UserHelper;

public class RegisterStep3Fragment extends BaseFragment {
    private Context context;
    private FragmentRegisterStep3Binding binding;
    @Inject
    RegisterViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_step3, container, false);
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
            switch (mutable.message) {
                case Constants.PACKAGES:
                    viewModel.getPackagesAdapter().update(((PackageResponse) mutable.object).getData());
                    break;
                case Constants.REGISTER:
                    toastMessage(((Mutable) o).message);
                    viewModel.goBack(context);
                    UserHelper.getInstance(context).saveStep("3");
                    MovementHelper.startActivity(context, RegisterStep4Fragment.class.getName(), getString(R.string.payment), null);
                    break;
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
