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

import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.base.ParentActivity;
import apps.app.altcompany.databinding.FragmentRegisterStep2Binding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.auth.register.models.RegisterStep1Response;
import apps.app.altcompany.pages.auth.register.models.SubCategoriesResponse;
import apps.app.altcompany.pages.auth.register.models.categories.CategoriesResponse;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.PopUp.PopUpMenuHelper;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.session.UserHelper;

public class RegisterStep2Fragment extends BaseFragment {
    private Context context;
    private FragmentRegisterStep2Binding binding;
    @Inject
    RegisterViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_step2, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setRegisterStep1ViewModel(viewModel);
        viewModel.getCategories();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (mutable.message) {
                case Constants.CATEGORIES:
                    viewModel.setDepartmentsItems(((CategoriesResponse) mutable.object).getAllDepartments().getCategories());
                    break;
                case Constants.SUB_CATEGORIES:
                    viewModel.getCategoriesAdapter().getSelectedCategories().clear();
                    viewModel.getCategoriesAdapter().update(((SubCategoriesResponse) mutable.object).getSubCategoriesItems());
                    break;
                case Constants.UPDATE_CATEGORY:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    finishActivity();
                    break;
                case Constants.DEPARTMENT:
                    showDepartments();
                    break;
                case Constants.TERMS_WARNING:
                    ((ParentActivity) context).toastError(getString(R.string.select_category));
                    break;
                case Constants.REGISTER:
                    toastMessage(((Mutable) o).message);
                    viewModel.goBack(context);
                    UserHelper.getInstance(context).addJwt(((RegisterStep1Response) mutable.object).getRegisterStep1Data().getJwt());
                    UserHelper.getInstance(context).saveStep("2");
                    MovementHelper.startActivity(context, RegisterStep3Fragment.class.getName(), getString(R.string.select_package), null);
                    break;
            }
        });
    }

    private void showDepartments() {
        PopUpMenuHelper.showDepartmentsPopUp(context, binding.departments, viewModel.getDepartmentsItems()).setOnMenuItemClickListener(item -> {
            binding.departments.setText(viewModel.getDepartmentsItems().get(item.getItemId()).getCategoriesName());
            viewModel.getRequest().setCategory_id(String.valueOf(viewModel.getDepartmentsItems().get(item.getItemId()).getCategoriesId()));
            viewModel.getRequest().setCategory(String.valueOf(viewModel.getDepartmentsItems().get(item.getItemId()).getCategoriesId()));
            viewModel.getSubCategories(Integer.parseInt(viewModel.getRequest().getCategory_id()));
            return false;
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
