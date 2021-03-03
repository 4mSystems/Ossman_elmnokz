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
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.mezzastore.BR;
import te.app.mezzastore.PassingObject;
import te.app.mezzastore.R;
import te.app.mezzastore.base.BaseFragment;
import te.app.mezzastore.base.IApplicationComponent;
import te.app.mezzastore.base.MyApplication;
import te.app.mezzastore.databinding.FragmentProductDetailsBinding;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.pages.products.models.productDetails.ProductDetailsResponse;
import te.app.mezzastore.pages.products.viewModels.ProductDetailsViewModel;
import te.app.mezzastore.utils.Constants;


public class ProductDetailsFragment extends BaseFragment {

    private Context context;
    @Inject
    ProductDetailsViewModel viewModel;
    FragmentProductDetailsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product_details, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.productDetails();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.Product_DETAILS.equals(((Mutable) o).message)) {
                viewModel.setProductDetails(((ProductDetailsResponse) mutable.object).getData());
                viewModel.setupSlider(binding.imageSlider);
            } else if (Constants.ADD_TO_CART.equals(((Mutable) o).message)) {
                toastMessage(getString(R.string.add_cart_successfully));
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
