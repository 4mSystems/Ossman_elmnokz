package apps.app.altcompany.pages.home;

import android.content.Context;
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
import apps.app.altcompany.utils.locations.MapAddress;
import apps.app.altcompany.utils.locations.MapAddressInterface;

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
            getAddress(Double.parseDouble(viewModel.getOrdersData().getUser().getUsers_lat()), Double.parseDouble(viewModel.getOrdersData().getUser().getUsers_lang()), (address, city) -> {
                binding.txtLocaction.setText(address);
            });
        }
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.CURRENT_LOCATION)){
                MovementHelper.startMapActivityForResultWithBundle(context, new PassingObject(viewModel.getOrdersData().getUser().getUsers_lat(),viewModel.getOrdersData().getUser().getUsers_lang()));
            }
        });
    }

    private void getAddress(final double lat, final double lng, MapAddressInterface mapAddressInterface) {
        MapAddress mapAddress = new MapAddress(getActivity(), lat, lng);
        mapAddress.getAddressFromUrl((address, city) -> {
            if (mapAddressInterface != null)
                mapAddressInterface.fetchFullAddress(address, city);
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
