package te.app.ossman_elmonkz.pages.subCategories;

import android.content.Context;
import android.content.Intent;
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
import te.app.ossman_elmonkz.base.ParentActivity;
import te.app.ossman_elmonkz.databinding.FragmentSubCategorySearchBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.buying.SelectBrandModelPartionFragment;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.pages.subCategories.models.MatchesResponse;
import te.app.ossman_elmonkz.pages.subCategories.models.search.SubCategorySearchResponse;
import te.app.ossman_elmonkz.pages.subCategories.viewModels.SubCategoriesSearchViewModel;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class SubCategorySearchFragment extends BaseFragment {

    private Context context;
    @Inject
    SubCategoriesSearchViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSubCategorySearchBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sub_category_search, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.getBrands();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            Log.e("setEvent", "setEvent: "+mutable.message );
            if (Constants.SEARCH.equals(((Mutable) o).message)) {
                Log.e("setEvent", "setEvent: " );
                if (((SubCategorySearchResponse) mutable.object).getCategorySearchMain() != null) {
                    viewModel.getSearchAdapter().update(((SubCategorySearchResponse) mutable.object).getCategorySearchMain().getSearchData());
                    viewModel.setDesc(((SubCategorySearchResponse) mutable.object).getCategorySearchMain().getDesc());
                }
                viewModel.setSearchProgressVisible(View.GONE);
                viewModel.notifyChange(BR.searchAdapter);
            } else if (Constants.GET_BRANDS.equals(((Mutable) o).message)) {
                viewModel.getBrandModelsPartionMain().setBrandsModells(((MatchesResponse) mutable.object).getBrandsModellsItem());
            }else if (Constants.ERROR.equals(((Mutable) o).message)) {
                viewModel.setSearchProgressVisible(View.GONE);
            } else if (Constants.SELECT_BRAND.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getBrandModelsPartionMain(), Constants.BRAND_REQUEST), getResources().getString(R.string.brand_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.BRAND_REQUEST);
            } else if (Constants.SELECT_MODELS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.dataFromSearchRequest, Constants.MODEL_REQUEST), getResources().getString(R.string.model_name_hint), SelectBrandModelPartionFragment.class.getName(), null, Constants.MODEL_REQUEST);
            } else if (Constants.EMPTY_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.select_brand));
            } else if (Constants.MODEL_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.model_name_hint));
            } else if (Constants.COLOR_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.product_color_warning));
            } else if (Constants.SELECT_PART_WARNING.equals(((Mutable) o).message)) {
                ((ParentActivity) context).toastError(getString(R.string.part_warning_warning));
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
                if (requestCode == Constants.BRAND_REQUEST) {
                    viewModel.getOrderRequest().setBrandName(brandsModellsItem.getName());
                    viewModel.getOrderRequest().setBrandId(String.valueOf(brandsModellsItem.getId()));
                    viewModel.search = null;
                } else if (requestCode == Constants.MODEL_REQUEST) {
                    viewModel.search = brandsModellsItem.getName();
                }
            }
            viewModel.notifyChange();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);

    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
