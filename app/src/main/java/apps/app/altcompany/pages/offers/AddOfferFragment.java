package apps.app.altcompany.pages.offers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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

import apps.app.altcompany.BR;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.databinding.FragmentAddOfferBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.offers.models.OffersResponse;
import apps.app.altcompany.pages.offers.viewModels.OffersViewModel;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.upload.FileOperations;

public class AddOfferFragment extends BaseFragment {
    Context context;
    FragmentAddOfferBinding binding;
    @Inject
    OffersViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_offer, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.IMAGE)) {
                pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
            } else if (mutable.message.equals(Constants.ADD_OFFER)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                finishActivity();
                Constants.DATA_CHANGED = true;
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.FILE_TYPE_IMAGE) {
            viewModel.getFileObjectArrayList().clear();
            FileObject fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE_OFFER, Constants.FILE_TYPE_IMAGE);
            viewModel.getFileObjectArrayList().add(fileObject);
            binding.offerImage.setImageURI(Uri.fromFile(new File(fileObject.getFilePath())));
            binding.offerSelect.setVisibility(View.GONE);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getOrdersRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
