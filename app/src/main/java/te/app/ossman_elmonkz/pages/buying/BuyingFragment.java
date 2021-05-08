package te.app.ossman_elmonkz.pages.buying;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

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
import te.app.ossman_elmonkz.base.ParentActivity;
import te.app.ossman_elmonkz.databinding.FragmentBuyingBinding;
import te.app.ossman_elmonkz.databinding.SendRequestDialogBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.models.BrandModelsPartionResponse;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.pages.buying.viewModels.BuyingViewModel;
import te.app.ossman_elmonkz.pages.cart.CartFragment;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class BuyingFragment extends BaseFragment {
    private Context context;
    @Inject
    BuyingViewModel viewModel;
    FragmentBuyingBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_buying, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.getBrandModel();
        }

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
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.dataFromSearchRequest, Constants.MODEL_REQUEST), getResources().getString(R.string.model_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.MODEL_REQUEST);
            } else if (Constants.SELECT_PRODUCT.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.dataFromSearchRequest, Constants.PRODUCT_REQUEST), getResources().getString(R.string.product_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.PRODUCT_REQUEST);
            } else if (Constants.SELECT_COLORS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.dataFromSearchRequest, Constants.PRODUCT_REQUEST), getResources().getString(R.string.product_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.PRODUCT_REQUEST);
            } else if (Constants.EMPTY_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.select_brand));
            } else if (Constants.MODEL_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.model_name_hint));
            } else if (Constants.COLOR_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.product_color_warning));
            } else if (Constants.SELECT_PART_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.part_warning_warning));
            } else if (Constants.ADD_TO_CART.equals(((Mutable) o).message)) {
                showSuccessDialog();
            }
        });
        viewModel.getProductColorAdapter().selectedColorLiveData.observe((LifecycleOwner) context, productColors -> {
            viewModel.getOrderRequest().setColorId(String.valueOf(productColors.getColor_id()));
            viewModel.getOrderRequest().setProductColorName(productColors.getColor_name());
            viewModel.colorCode.set(productColors.getColor_color());
            viewModel.colorName.set(productColors.getColor_name());
        });
    }

    private void showSuccessDialog() {
        Dialog successDialog = new Dialog(context);
        successDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        successDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        SendRequestDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(successDialog.getContext()), R.layout.send_request_dialog, null, false);
        successDialog.setContentView(binding.getRoot());
        binding.continueBuy.setOnClickListener(v -> {
            successDialog.dismiss();
            finishActivity();
        });
        binding.done.setOnClickListener(v -> {
            successDialog.dismiss();
            finishActivity();
            MovementHelper.startActivity(context, CartFragment.class.getName(), getString(R.string.cart), null);
        });
        successDialog.show();
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
                    //reset for update Product
                    viewModel.getOrderRequest().setProductName(null);
                    viewModel.getOrderRequest().setProduct_id(null);
                    viewModel.setModellsItem(brandsModellsItem);

                } else if (requestCode == Constants.MODEL_REQUEST) {
                    viewModel.getOrderRequest().setModelName(brandsModellsItem.getName());
                    viewModel.getOrderRequest().setModelId(String.valueOf(brandsModellsItem.getId()));
                    //reset for update Product
                    viewModel.getOrderRequest().setProductName(null);
                    viewModel.getOrderRequest().setProduct_id(null);
                } else if (requestCode == Constants.PRODUCT_REQUEST) {
                    viewModel.getOrderRequest().setProductName(brandsModellsItem.getName());
                    viewModel.getOrderRequest().setProduct_id(String.valueOf(brandsModellsItem.getId()));
                    Log.e("onActivityResult", "onActivityResult: " + viewModel.getOrderRequest().isHasColor());
                    if (brandsModellsItem.getProductColors() != null && brandsModellsItem.getProductColors().size() > 0) {
                        viewModel.getOrderRequest().setHasColor(true);
                        binding.productColor.setVisibility(View.VISIBLE);
                        binding.colorHint.setVisibility(View.VISIBLE);
                        binding.colorName.setVisibility(View.VISIBLE);
                        viewModel.getProductColorAdapter().update(brandsModellsItem.getProductColors());
                        viewModel.notifyChange(BR.productColorAdapter);
                    }
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
