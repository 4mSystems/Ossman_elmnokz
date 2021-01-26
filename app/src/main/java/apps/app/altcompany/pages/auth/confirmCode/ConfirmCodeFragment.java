package apps.app.altcompany.pages.auth.confirmCode;

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

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentConfirmCodeBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordFragment;
import apps.app.altcompany.pages.auth.login.models.UsersResponse;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.session.UserHelper;

public class ConfirmCodeFragment extends BaseFragment {
    private Context context;
    @Inject
    CodeViewModel viewModel;
    FragmentConfirmCodeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirm_code, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setVerificationCodeViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.CONFIRM_CODE)) {
                if (viewModel.getPassingObject().getId() == Constants.CHECK_CONFIRM_NAV_REGISTER) {
                    UserHelper.getInstance(context).userLogin(((UsersResponse) mutable.object).getData());
                    MovementHelper.startActivityMain(context);
                } else {
                    UserHelper.getInstance(context).addJwt(((UsersResponse) ((Mutable) o).object).getData().getJwt());
                    MovementHelper.startActivityWithBundle(context, new PassingObject(viewModel.getPassingObject().getId()), null, ChangePasswordFragment.class.getName(), null);
                }
                viewModel.goBack(context);
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
