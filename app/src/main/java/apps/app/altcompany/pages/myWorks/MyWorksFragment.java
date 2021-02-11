package apps.app.altcompany.pages.myWorks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.databinding.FragmentMyWorksBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.auth.login.models.UsersResponse;
import apps.app.altcompany.pages.myWorks.viewModels.MyWorksViewModel;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.upload.FileOperations;
import droidninja.filepicker.FilePickerConst;
import droidninja.filepicker.utils.ContentUriUtils;

import static apps.app.altcompany.utils.Constants.CUSTOM_REQUEST_CODE;

public class MyWorksFragment extends BaseFragment {
    Context context;
    FragmentMyWorksBinding binding;
    @Inject
    MyWorksViewModel viewModel;
    private ArrayList<Uri> photoPaths = new ArrayList<>();

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_works, container, false);
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
            switch (((Mutable) o).message) {
                case Constants.COMPANY_PROFILE:
                    viewModel.getWorksAdapter().update(((UsersResponse) mutable.object).getData().getWorking_imgs());
                    viewModel.notifyChange(BR.worksAdapter);
                    break;
                case Constants.ADD_OFFER:
                    Log.e("setEvent", "setEvent: " );
                    FileOperations.pickImages(context, photoPaths, 5, false);
                    break;
                case Constants.REMOVE_OFFER:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    viewModel.getWorksAdapter().companyWorks.remove(viewModel.getWorksAdapter().lastPosition);
                    viewModel.getWorksAdapter().notifyItemRemoved(viewModel.getWorksAdapter().lastPosition);
                    break;
            }
        });
        viewModel.getWorksAdapter().getOfferIdLiveData().observe((LifecycleOwner) context, integer -> viewModel.removeOffer(integer));
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case CUSTOM_REQUEST_CODE:
                if (resultCode == Activity.RESULT_OK && data != null) {
                    ArrayList<Uri> dataList = data.getParcelableArrayListExtra(FilePickerConst.KEY_SELECTED_MEDIA);
                    if (dataList != null) {
                        photoPaths = new ArrayList<>();
                        photoPaths.addAll(dataList);
                    }
                }
                break;

        }

        addThemToView(photoPaths);
    }

    private void addThemToView(ArrayList<Uri> imagePaths) {
        ArrayList<Uri> filePaths = new ArrayList<>();
        if (imagePaths != null) filePaths.addAll(imagePaths);
        FileObject fileObject;
        for (int i = 0; i < filePaths.size(); i++) {
            try {
                String path = ContentUriUtils.INSTANCE.getFilePath(context, filePaths.get(i));
                fileObject = new FileObject("working_imgs[" + i + "]", path, Constants.FILE_TYPE_IMAGE);
                fileObject.setUri(filePaths.get(i));
                viewModel.getFileObjectArrayList().add(fileObject);
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
        viewModel.addNewWorks();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Constants.DATA_CHANGED) {
            Constants.DATA_CHANGED = false;
            viewModel.companyProfile();
        }
        viewModel.getOrdersRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
