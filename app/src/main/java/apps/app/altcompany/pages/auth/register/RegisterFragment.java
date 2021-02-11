package apps.app.altcompany.pages.auth.register;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Objects;

import javax.inject.Inject;

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.base.ParentActivity;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.databinding.FragmentRegisterStep1Binding;
import apps.app.altcompany.databinding.TermsDialogBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.confirmCode.ConfirmCodeFragment;
import apps.app.altcompany.pages.auth.models.cities.CitiesResponse;
import apps.app.altcompany.pages.auth.models.countries.CountriesResponse;
import apps.app.altcompany.pages.auth.register.models.PrivacyResponse;
import apps.app.altcompany.pages.auth.register.models.RegisterStep1Response;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.PopUp.PopUpMenuHelper;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.session.UserHelper;
import apps.app.altcompany.utils.upload.FileOperations;

public class RegisterFragment extends BaseFragment {
    private Context context;
    private FragmentRegisterStep1Binding binding;
    @Inject
    RegisterViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_step1, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setRegisterStep1ViewModel(viewModel);
        viewModel.getCountries();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {

        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.IMAGE:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
                    break;
                case Constants.IMAGE_BUSINESS:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE_BUSINESS);
                    break;
                case Constants.IMAGE_COVER:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE_COVER);
                    break;
                case Constants.REGISTER:
                    toastMessage(((Mutable) o).message);
                    viewModel.goBack(context);
                    UserHelper.getInstance(context).addJwt(((RegisterStep1Response) mutable.object).getRegisterStep1Data().getJwt());
                    UserHelper.getInstance(context).saveStep("1");
                    MovementHelper.startActivity(context, RegisterStep2Fragment.class.getName(), getString(R.string.select_service), null);
                    break;
                case Constants.CURRENT_LOCATION:
                    MovementHelper.startMapActivityForResultWithBundle(context, new PassingObject());
                    break;
                case Constants.CITIES:
                    viewModel.setCitiesList(((CitiesResponse) mutable.object).getCitiesList());
                    break;
                case Constants.COUNTRIES:
                    viewModel.setCountriesList(((CountriesResponse) mutable.object).getData());
                    break;
                case Constants.SHOW_CITIES:
                    showCities();
                    break;
                case Constants.SHOW_COUNTRIES:
                    showCountries();
                    break;
                case Constants.TERMS:
                    showDialog(((PrivacyResponse) mutable.object).getData().getDetails());
                    break;
                case Constants.TERMS_WARNING:
                    ((ParentActivity) context).toastError(getString(R.string.terms_warning));
                    break;
                case Constants.EMPTY_WARNING:
                    ((ParentActivity) context).toastError(getString(R.string.empty_warning));
                    break;
                case Constants.IMAGE_WARNING:
                    ((ParentActivity) context).toastError(getString(R.string.image_warning));
                    break;

            }
        });
    }

    private void showCountries() {
        PopUpMenuHelper.showCountriesPopUp(context, binding.edtRegisterStep1Country, viewModel.getCountriesList()).setOnMenuItemClickListener(item -> {
            binding.edtRegisterStep1Country.setText(viewModel.getCountriesList().get(item.getItemId()).getName());
            viewModel.getRequest().setFK_countries_id(String.valueOf(viewModel.getCountriesList().get(item.getItemId()).getId()));
            viewModel.getCities( viewModel.getRequest().getFK_countries_id());
            return false;
        });
    }

    private void showCities() {
        PopUpMenuHelper.showCitiesPopUp(context, binding.edtRegisterStep1City, viewModel.getCitiesList()).setOnMenuItemClickListener(item -> {
            binding.edtRegisterStep1City.setText(viewModel.getCitiesList().get(item.getItemId()).getName());
            viewModel.getRequest().setFK_cities_id(String.valueOf(viewModel.getCitiesList().get(item.getItemId()).getId()));
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

    public void showDialog(String term) {
        Dialog termsDialog = new Dialog(context, R.style.PauseDialog);
        termsDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        termsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        TermsDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(termsDialog.getContext()), R.layout.terms_dialog, null, false);
        termsDialog.setContentView(binding.getRoot());
        binding.terms.setText(term);
        binding.okay.setOnClickListener(v -> termsDialog.dismiss());
        termsDialog.show();

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObject().add(fileObject);
            binding.imgRegisterUpdate.setImageURI(Uri.fromFile(new File(fileObject.getFilePath())));
        } else if (requestCode == Constants.FILE_TYPE_IMAGE_BUSINESS) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE_BUSINESS, Constants.FILE_TYPE_IMAGE_BUSINESS);
            viewModel.getFileObject().add(fileObject);
            binding.businessRegister.setText(getString(R.string.image_selected));
            viewModel.getRequest().setBussinessregister("SELECTED"); // for error
        }else if (requestCode == Constants.FILE_TYPE_IMAGE_COVER) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE_COVER, Constants.FILE_TYPE_IMAGE_COVER);
            viewModel.getFileObject().add(fileObject);
            binding.companyRegisterCover.setText(getString(R.string.image_selected));
            viewModel.getRequest().setCover("SELECTED"); // for error
        } else if (requestCode == Constants.RESULT_CODE) {
            viewModel.getRequest().setWorkers_lat(String.valueOf(data.getDoubleExtra(Constants.LAT, 0.0)));
            viewModel.getRequest().setWorkers_lang(String.valueOf(data.getDoubleExtra(Constants.LNG, 0.0)));
            viewModel.getRequest().setWorkers_address(Objects.requireNonNull(data.getStringExtra(Constants.ADDRESS)));
            binding.edAddress.setText(viewModel.getRequest().getWorkers_address());
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}
