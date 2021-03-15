package te.app.ossman_elmonkz.pages.buying;

import android.content.Context;
import android.content.Intent;
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

import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.base.ParentActivity;
import te.app.ossman_elmonkz.databinding.FragmentBuyingBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.models.BrandModelsPartionResponse;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class BuyingFragment extends BaseFragment {

    private Context context;
    @Inject
    BuyingViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentBuyingBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_buying, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        viewModel.getBrandModel();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.BRAND_MODEL_RESPONSE.equals(((Mutable) o).message)) {
                viewModel.setBrandModelsPartionMain(((BrandModelsPartionResponse) mutable.object).getData());
            } else if (Constants.SELECT_PART.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getBrandModelsPartionMain(), Constants.PART_REQUEST), getResources().getString(R.string.department_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.PART_REQUEST);
            } else if (Constants.SELECT_BRAND.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getBrandModelsPartionMain(), Constants.BRAND_REQUEST), getResources().getString(R.string.brand_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.BRAND_REQUEST);
            } else if (Constants.SELECT_MODELS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getModellsItem(), Constants.MODEL_REQUEST), getResources().getString(R.string.model_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.MODEL_REQUEST);
            } else if (Constants.EMPTY_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.select_brand));
            } else if (Constants.ADD_TO_CART.equals(((Mutable) o).message)) {
                toastMessage(getString(R.string.add_cart_successfully));
                finishActivity();
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (data != null) {
            Bundle bundle = data.getBundleExtra(Constants.BUNDLE);
            if (bundle != null && bundle.containsKey(Constants.BUNDLE)) {
                PassingObject passingObject = (PassingObject) bundle.getSerializable(Constants.BUNDLE);
                BrandsModellsItem brandsModellsItem = new Gson().fromJson(String.valueOf(passingObject.getObjectClass()), BrandsModellsItem.class);
                if (requestCode == Constants.PART_REQUEST) {
                    viewModel.getOrderRequest().setPartName(brandsModellsItem.getName());
                    viewModel.getOrderRequest().setPartId(String.valueOf(brandsModellsItem.getId()));
                } else if (requestCode == Constants.BRAND_REQUEST) {
                    viewModel.getOrderRequest().setBrandName(brandsModellsItem.getName());
                    viewModel.getOrderRequest().setBrandId(String.valueOf(brandsModellsItem.getId()));
                    //reset for update model
                    viewModel.getOrderRequest().setModelName(null);
                    viewModel.getOrderRequest().setModelId(null);
                    viewModel.setModellsItem(brandsModellsItem);
                } else if (requestCode == Constants.MODEL_REQUEST) {
                    viewModel.getOrderRequest().setModelName(brandsModellsItem.getName());
                    viewModel.getOrderRequest().setModelId(String.valueOf(brandsModellsItem.getId()));
                }
            }
            viewModel.notifyChange();
        }
        super.onActivityResult(requestCode, resultCode, data);
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
