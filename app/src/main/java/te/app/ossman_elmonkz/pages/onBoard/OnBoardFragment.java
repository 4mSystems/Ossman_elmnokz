package te.app.ossman_elmonkz.pages.onBoard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentOnboardBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.onBoard.models.BoardResponse;
import te.app.ossman_elmonkz.pages.splash.SplashViewModel;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;
import te.app.ossman_elmonkz.utils.session.UserHelper;

public class OnBoardFragment extends BaseFragment {
    FragmentOnboardBinding fragmentOnboardBinding;
    @Inject
    SplashViewModel viewModel;
    private Context context;

    public OnBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentOnboardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboard, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        fragmentOnboardBinding.setOnBoardViewModels(viewModel);
        viewModel.getSlider();
        liveDataListeners();
        // fill list screen
        fragmentOnboardBinding.imageSlider.setCurrentPageListener(currentPosition -> {
            if (currentPosition == viewModel.getOnBoardAdapter().pagerList.size() - 1) {
                fragmentOnboardBinding.appCompatButtonNext.setText(getResources().getString(R.string.startApp));
            } else {
                fragmentOnboardBinding.appCompatButtonNext.setText(getResources().getString(R.string.next));
            }
        });
        return fragmentOnboardBinding.getRoot();
    }


    private void liveDataListeners() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.NEXT)) {
                if (fragmentOnboardBinding.appCompatButtonNext.getText().toString().equals(getResources().getString(R.string.next)))
                    fragmentOnboardBinding.imageSlider.setCurrentPagePosition(fragmentOnboardBinding.imageSlider.getCurrentPagePosition() + 1);
                else {
                    UserHelper.getInstance(context).addIsFirst(false);
                    MovementHelper.startActivityMain(context);
                }
            } else if (((Mutable) o).message.equals(Constants.BOARD)) {
                viewModel.getOnBoardAdapter().updateData(((BoardResponse) ((Mutable) o).object).getOnBoardList());
                viewModel.notifyChange(BR.onBoardAdapter);
                viewModel.setupSlider(fragmentOnboardBinding.imageSlider);
                if (viewModel.getOnBoardAdapter().pagerList.size() == 1)
                    fragmentOnboardBinding.appCompatButtonNext.setText(getResources().getString(R.string.startApp));
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}