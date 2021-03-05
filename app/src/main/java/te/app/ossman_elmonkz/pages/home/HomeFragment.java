package te.app.ossman_elmonkz.pages.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentHomeBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.cart.CartFragment;
import te.app.ossman_elmonkz.pages.home.models.HomeResponse;
import te.app.ossman_elmonkz.pages.home.viewModels.HomeViewModel;
import te.app.ossman_elmonkz.pages.settings.SuggestionsFragment;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class HomeFragment extends BaseFragment {

    private Context context;
    @Inject
    HomeViewModel viewModel;
    FragmentHomeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        binding.imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        viewModel.homeData();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(((LifecycleOwner) context), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.HOME.equals(((Mutable) o).message)) {
                viewModel.setHomeData(((HomeResponse) mutable.object).getHomeData());
                viewModel.setupSlider(binding.imageSlider);
            } else if (Constants.CART.equals(((Mutable) o).message)) {
                MovementHelper.startActivity(context, CartFragment.class.getName(), getString(R.string.cart), null);
            } else if (Constants.CONTACT.equals(((Mutable) o).message)) {
                MovementHelper.startActivity(context, SuggestionsFragment.class.getName(), getString(R.string.contact_us), null);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
