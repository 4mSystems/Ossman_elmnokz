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
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.auth.login.models.UserData;
import apps.app.altcompany.pages.auth.models.RegisterRequest;
import apps.app.altcompany.pages.chatAdmin.view.ChatAdminFragment;
import apps.app.altcompany.pages.home.models.HomeResponse;
import apps.app.altcompany.pages.home.models.orderDetails.OrderDetailsResponse;
import apps.app.altcompany.pages.home.viewModels.OrderDetailsViewModel;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;

public class OrderDetailsFragment extends BaseFragment {
    Context context;
    FragmentOrderDetailBinding binding;
    @Inject
    OrderDetailsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_order_detail, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            Log.e("onCreateView", "onCreateView: " + viewModel.getPassingObject().getObject());
            viewModel.orderDetails();
        }
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (mutable.message) {
                case Constants.ORDER_DETAILS:
                    viewModel.setOrdersData(((OrderDetailsResponse) mutable.object).getData());
                    break;
                case Constants.SEND_OFFER:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    finishActivity();
                    break;
                case Constants.USER_DETAILS:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(viewModel.getOrdersData()), getString(R.string.user_details), UserDetailsFragment.class.getName(), null);
                    break;
                case Constants.CHAT:
                    MovementHelper.startActivityWithBundle(context, new PassingObject(viewModel.getPassingObject().getId(), Constants.CHAT), getString(R.string.chat), ChatAdminFragment.class.getName(), null);
                    break;
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
