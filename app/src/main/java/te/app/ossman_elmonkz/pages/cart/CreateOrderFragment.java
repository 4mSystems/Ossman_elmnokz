package te.app.ossman_elmonkz.pages.cart;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentCreateOrderBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.cart.models.CreateOrder;
import te.app.ossman_elmonkz.pages.cart.viewModels.CreateOrderViewModel;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class CreateOrderFragment extends BaseFragment {

    private Context context;
    @Inject
    CreateOrderViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCreateOrderBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_create_order, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setCreateOrder(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), CreateOrder.class));
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.SEND_ORDER.equals(((Mutable) o).message)) {
                toastMessage(getString(R.string.send_successfully));
                MovementHelper.finishWithResult(new PassingObject(), context);
                finishActivity();
            }
        });
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        return;
                    }
                    viewModel.getCreateOrder().setDevice_id(task.getResult());
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
