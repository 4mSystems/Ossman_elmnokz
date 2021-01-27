package apps.app.altcompany.pages.offers;

import android.content.Context;
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

import apps.app.altcompany.BR;
import apps.app.altcompany.R;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentOffersBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.offers.models.OffersResponse;
import apps.app.altcompany.pages.offers.viewModels.OffersViewModel;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.helper.MovementHelper;

public class OffersFragment extends BaseFragment {
    Context context;
    FragmentOffersBinding binding;
    @Inject
    OffersViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_offers, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        viewModel.offers();
        setEvent();
        return binding.getRoot();

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (mutable.message) {
                case Constants.OFFERS:
                    viewModel.getOffersAdapter().update(((OffersResponse) mutable.object).getData());
                    viewModel.notifyChange(BR.offersAdapter);
                    break;
                case Constants.ADD_OFFER:
                    MovementHelper.startActivity(context, AddOfferFragment.class.getName(), getString(R.string.add_offer), null);
                    break;
                case Constants.REMOVE_OFFER:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    viewModel.getOffersAdapter().offersDataList.remove(viewModel.getOffersAdapter().lastPosition);
                    viewModel.getOffersAdapter().notifyItemRemoved(viewModel.getOffersAdapter().lastPosition);
                    break;
            }
        });
        viewModel.getOffersAdapter().getOfferIdLiveData().observe((LifecycleOwner) context, integer -> viewModel.removeOffer(integer));
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Constants.DATA_CHANGED) {
            Constants.DATA_CHANGED = false;
            viewModel.offers();
        }
        viewModel.getOrdersRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
