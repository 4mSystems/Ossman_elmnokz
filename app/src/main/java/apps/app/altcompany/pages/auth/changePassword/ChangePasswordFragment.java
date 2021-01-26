package apps.app.altcompany.pages.auth.changePassword;

import android.content.Context;
import android.os.Bundle;
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
import apps.app.altcompany.databinding.FragmentChangePasswordBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.login.models.UsersResponse;
import apps.app.altcompany.utils.Constants;

public class ChangePasswordFragment extends BaseFragment {
    private Context context;
    @Inject
    ChangePasswordViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChangePasswordBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setChangePasswordViewModel(viewModel);
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
            if (mutable.message.equals(Constants.CHANGE_PASSWORD)) {
                toastMessage(((UsersResponse) mutable.object).mMessage);
                viewModel.goBack(context);
            } else if (mutable.message.equals(Constants.NOT_MATCH_PASSWORD)) {
                showError(getResources().getString(R.string.password_not_match));
            }
        });
    }


    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
