package te.app.ossman_elmonkz.pages.settings;

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

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentAboutBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.settings.models.AboutResponse;
import te.app.ossman_elmonkz.pages.settings.viewModels.SettingsViewModel;
import te.app.ossman_elmonkz.utils.Constants;


public class AboutAppFragment extends BaseFragment {
    private Context context;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentAboutBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.about();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.ABOUT)) {
                viewModel.setAboutMain(((AboutResponse) ((Mutable) o).object).getData());
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
