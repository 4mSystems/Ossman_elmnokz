package te.app.ossman_elmonkz.pages.gallery;

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

import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentGalleryBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.gallery.models.GalleryResponse;
import te.app.ossman_elmonkz.pages.gallery.viewModels.GalleryViewModel;
import te.app.ossman_elmonkz.utils.Constants;


public class GalleryFragment extends BaseFragment {

    private Context context;
    @Inject
    GalleryViewModel viewModel;
    FragmentGalleryBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            if (viewModel.getPassingObject() == null)
                viewModel.getGallery();
            else
                viewModel.systemImages();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.GALLERY.equals(((Mutable) o).message)) {
                viewModel.getGalleryAdapter().update(((GalleryResponse) mutable.object).getData());
                viewModel.notifyChange(BR.galleryAdapter);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getSettingsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
