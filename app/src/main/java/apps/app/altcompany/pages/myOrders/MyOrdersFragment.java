package apps.app.altcompany.pages.myOrders;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentMyOrdersBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.home.models.OrdersResponse;
import apps.app.altcompany.pages.myOrders.viewModels.MyOrdersViewModel;
import apps.app.altcompany.utils.Constants;

public class MyOrdersFragment extends BaseFragment {
    Context context;
    FragmentMyOrdersBinding binding;
    @Inject
    MyOrdersViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_orders, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        viewModel.myOrders();
        binding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    viewModel.getOrdersAdapter().ordersDataList.clear();
                    viewModel.getOrdersAdapter().orderType = 0;
                    viewModel.myOrders();
                } else if (tab.getPosition() == 1) {
                    viewModel.getOrdersAdapter().ordersDataList.clear();
                    viewModel.getOrdersAdapter().orderType = 1;
                    viewModel.myOrders();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.MY_ORDERS)) {
                viewModel.getOrdersAdapter().orderType = 0;
                viewModel.getOrdersAdapter().update(((OrdersResponse) mutable.object).getData());
                viewModel.notifyChange(BR.ordersAdapter);
            }
        });
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
