package te.app.ossman_elmonkz.pages.products;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FilterDialogBinding;
import te.app.ossman_elmonkz.databinding.FragmentProductsBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.products.models.ProductResponse;
import te.app.ossman_elmonkz.pages.products.viewModels.ProductsViewModel;
import te.app.ossman_elmonkz.utils.Constants;


public class ProductsFragment extends BaseFragment {

    private Context context;
    @Inject
    ProductsViewModel viewModel;
    BottomSheetDialog sheetDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentProductsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_products, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.getProducts();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.PRODUCTS_RESPONSE.equals(((Mutable) o).message)) {
                if (sheetDialog != null)
                    sheetDialog.dismiss();
                viewModel.getProductsAdapter().update(((ProductResponse) mutable.object).getProductList());
                viewModel.notifyChange(BR.productsAdapter);
            }
        });
        baseActivity().backActionBarView.layoutActionBarBackBinding.imgActionBarFilter.setOnClickListener(v -> showFilter());
    }

    private void showFilter() {
        FilterDialogBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.filter_dialog, null, false);
        sheetDialog = new BottomSheetDialog(context);
        sheetDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewmodel(viewModel);
        sheetDialog.show();
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getProductRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
