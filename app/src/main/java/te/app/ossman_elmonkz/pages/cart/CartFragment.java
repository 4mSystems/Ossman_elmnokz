package te.app.ossman_elmonkz.pages.cart;

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

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentCartBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.cart.models.CreateOrder;
import te.app.ossman_elmonkz.pages.cart.viewModels.CartViewModel;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class CartFragment extends BaseFragment {

    private Context context;
    @Inject
    CartViewModel viewModel;
    FragmentCartBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);

        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.FINISH_ORDER.equals(((Mutable) o).message)) {
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(new CreateOrder(viewModel.getCartAdapter().getProductList())), getResources().getString(R.string.finish_order),CreateOrderFragment.class.getName(),  null);
            }
        });
        viewModel.getCartLiveData().observe(((LifecycleOwner) context), productDetails -> {
            viewModel.getCartAdapter().update(productDetails);
            viewModel.notifyChange(BR.cartAdapter);
        });
        viewModel.getCartTotal().observe(((LifecycleOwner) context), s -> {
            if (s != null) {
                binding.tvTotalValue.setText(s.concat(" ").concat("ج.م"));
            }else
                finishActivity();
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (data!=null) {
            viewModel.getCartRepository().emptyCart();
            finishActivity();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
