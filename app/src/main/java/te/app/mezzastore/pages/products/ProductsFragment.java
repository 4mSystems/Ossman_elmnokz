package te.app.mezzastore.pages.products;

import android.content.Context;
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

import te.app.mezzastore.BR;
import te.app.mezzastore.PassingObject;
import te.app.mezzastore.R;
import te.app.mezzastore.base.BaseFragment;
import te.app.mezzastore.base.IApplicationComponent;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.databinding.FragmentProductsBinding;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.products.models.ProductResponse;
import te.app.mezzastore.pages.products.viewModels.ProductsViewModel;
import te.app.mezzastore.utils.Constants;


public class ProductsFragment extends BaseFragment {

    private Context context;
    @Inject
    ProductsViewModel viewModel;

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
                viewModel.getProductsAdapter().update(((ProductResponse) mutable.object).getProductList());
                viewModel.notifyChange(BR.productsAdapter);
            }
        });
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
