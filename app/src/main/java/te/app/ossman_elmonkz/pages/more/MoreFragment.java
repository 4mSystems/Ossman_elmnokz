package te.app.ossman_elmonkz.pages.more;

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
import te.app.ossman_elmonkz.databinding.FragmentMoreBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.pages.agentsAndClients.AgentsFragment;
import te.app.ossman_elmonkz.pages.agentsAndClients.ClientsFragment;
import te.app.ossman_elmonkz.pages.more.viewModels.MoreViewModel;
import te.app.ossman_elmonkz.pages.settings.AboutAppFragment;
import te.app.ossman_elmonkz.pages.settings.ContactFragment;
import te.app.ossman_elmonkz.pages.settings.SuggestionsFragment;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.AppHelper;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;

public class MoreFragment extends BaseFragment {

    private Context context;
    @Inject
    MoreViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMoreBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_more, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.ABOUT:
                    MovementHelper.startActivity(context, AboutAppFragment.class.getName(), getResources().getString(R.string.about), null);
                    break;
                case Constants.TERMS:
                    MovementHelper.startActivity(context, SuggestionsFragment.class.getName(), getResources().getString(R.string.suggest), null);
                    break;
                case Constants.CONTACT:
                    MovementHelper.startActivity(context, ContactFragment.class.getName(), getResources().getString(R.string.contact_us), null);
                    break;
                case Constants.AGENTS:
                    MovementHelper.startActivity(context, AgentsFragment.class.getName(), getResources().getString(R.string.agents), null);
                    break;
                case Constants.CLIENTS:
                    MovementHelper.startActivity(context, ClientsFragment.class.getName(), getResources().getString(R.string.members), null);
                    break;
                case Constants.SHARE_BAR:
                    AppHelper.shareApp(getActivityBase());
                    break;
                case Constants.RATE_APP:
                    AppHelper.rateApp(context);
                    break;

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
