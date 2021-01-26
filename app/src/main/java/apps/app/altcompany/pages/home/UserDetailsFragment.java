package apps.app.altcompany.pages.home;

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

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentOrderDetailBinding;
import apps.app.altcompany.databinding.FragmentUserDetailsBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.auth.models.RegisterRequest;
import apps.app.altcompany.pages.home.models.OrdersData;
import apps.app.altcompany.pages.home.models.orderDetails.OrderDetailsResponse;
import apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;

public class UserDetailsFragment extends BaseFragment {
    Context context;
    FragmentUserDetailsBinding binding;
    @Inject
    OrderDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_details, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setOrdersData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), OrdersData.class));
        }
        return binding.getRoot();

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
