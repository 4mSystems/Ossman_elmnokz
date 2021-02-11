package apps.app.altcompany.pages.companies;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.databinding.FragmentCompanyProfileBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.auth.login.models.UsersResponse;
import apps.app.altcompany.pages.auth.register.RegisterStep2Fragment;
import apps.app.altcompany.pages.companies.viewModels.CompaniesViewModel;
import apps.app.altcompany.pages.myWorks.MyWorksFragment;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.locations.MapAddress;
import apps.app.altcompany.utils.locations.MapAddressInterface;
import apps.app.altcompany.utils.session.UserHelper;
import apps.app.altcompany.utils.upload.FileOperations;

public class CompanyProfileFragment extends BaseFragment {
    Context context;
    FragmentCompanyProfileBinding binding;
    @Inject
    CompaniesViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_company_profile, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        viewModel.companyProfile();
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (mutable.message) {
                case Constants.COMPANY_PROFILE:
                    viewModel.setCompanyProfile(((UsersResponse) mutable.object).getData());
                    getAddress(Double.parseDouble(viewModel.getCompanyProfile().getWorkersLat()), Double.parseDouble(viewModel.getCompanyProfile().getWorkersLang()), (address, city) -> {
                        binding.txtLocaction.setText(address);
                    });
                    break;
                case Constants.CURRENT_LOCATION:
                    MovementHelper.startMapActivityForResultWithBundle(context, new PassingObject(viewModel.getCompanyProfile().getWorkersLat(), viewModel.getCompanyProfile().getWorkersLang()));
                    break;
                case Constants.MY_WORKS:
                    MovementHelper.startActivity(context, MyWorksFragment.class.getName(), getString(R.string.my_works), null);
                    break;
                case Constants.IMAGE:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
                    break;
                case Constants.IMAGE_COVER:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE_COVER);
                    break;
                case Constants.CATEGORIES:
                    MovementHelper.startActivity(context, RegisterStep2Fragment.class.getName(), getString(R.string.permission_settings), null);
                    break;
                case Constants.UPDATE_PROFILE:
                    toastMessage(((UsersResponse) mutable.object).mMessage);
                    UserHelper.getInstance(context).userLogin(((UsersResponse) mutable.object).getData());
                    finishActivity();
                    break;
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.FILE_TYPE_IMAGE) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObjectList().add(fileObject);
            binding.userImg.setImageURI(Uri.fromFile(new File(fileObject.getFilePath())));
        } else if (requestCode == Constants.RESULT_CODE) {
            viewModel.getRegisterRequest().setWorkers_lat(String.valueOf(data.getDoubleExtra(Constants.LAT, 0.0)));
            viewModel.getRegisterRequest().setWorkers_lang(String.valueOf(data.getDoubleExtra(Constants.LNG, 0.0)));
            viewModel.getRegisterRequest().setWorkers_address(Objects.requireNonNull(data.getStringExtra(Constants.ADDRESS)));
            binding.txtLocaction.setText(viewModel.getRegisterRequest().getWorkers_address());
        } else if (requestCode == Constants.FILE_TYPE_IMAGE_COVER) {
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE_COVER, Constants.FILE_TYPE_IMAGE_COVER);
            viewModel.getFileObjectList().add(fileObject);
            binding.cover.setImageURI(Uri.fromFile(new File(fileObject.getFilePath())));
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void getAddress(final double lat, final double lng, MapAddressInterface mapAddressInterface) {
        MapAddress mapAddress = new MapAddress(getActivity(), lat, lng);
        mapAddress.getAddressFromUrl((address, city) -> {
            if (mapAddressInterface != null)
                mapAddressInterface.fetchFullAddress(address, city);
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
