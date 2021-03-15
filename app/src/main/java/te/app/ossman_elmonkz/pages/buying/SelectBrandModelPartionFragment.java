package te.app.ossman_elmonkz.pages.buying;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentBrandModelsPartionBinding;
import te.app.ossman_elmonkz.pages.buying.models.BrandModelsPartionMain;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.pages.buying.viewModels.BrandModelViewModel;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class SelectBrandModelPartionFragment extends BaseFragment {

    private Context context;
    @Inject
    BrandModelViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentBrandModelsPartionBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_brand_models_partion, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            if (viewModel.getPassingObject().getId() == Constants.MODEL_REQUEST)
                viewModel.setModellsItem(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), BrandsModellsItem.class));
            else
                viewModel.setBrandModelsPartionMain(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), BrandModelsPartionMain.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.getBrandModelAdapter().selectedIdLiveData.observe((LifecycleOwner) context, brandsModellsItem -> MovementHelper.finishWithResult(new PassingObject(brandsModellsItem), context));
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getBuyingRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
