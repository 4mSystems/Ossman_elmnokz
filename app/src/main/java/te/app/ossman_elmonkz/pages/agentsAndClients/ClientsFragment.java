package te.app.ossman_elmonkz.pages.agentsAndClients;

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

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.ossman_elmonkz.BR;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.base.BaseFragment;
import te.app.ossman_elmonkz.base.IApplicationComponent;
import te.app.ossman_elmonkz.base.MyApplication;
import te.app.ossman_elmonkz.databinding.FragmentClientsBinding;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.model.govs.GovsResponse;
import te.app.ossman_elmonkz.pages.agentsAndClients.models.clients.ClientsResponse;
import te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.AgentsClientsViewModel;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.PopUp.PopUpMenuHelper;

public class ClientsFragment extends BaseFragment {

    private Context context;
    FragmentClientsBinding binding;
    @Inject
    AgentsClientsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_clients, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getGovs();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.GOVS:
                    viewModel.govsDataList = ((GovsResponse) mutable.object).getData();
                    if (viewModel.govsDataList.size() > 0) {
                        viewModel.selectGov = viewModel.govsDataList.get(0).getName();
                        viewModel.getClients(viewModel.govsDataList.get(0).getId());
                    }

                    break;
                case Constants.CLIENTS:
                    viewModel.getClientsAdapter().update(((ClientsResponse) mutable.object).getData());
                    viewModel.notifyChange(BR.clientsAdapter);
                    break;
                case Constants.SHOW_GOVS:
                    showGovs();
                    break;
            }
        });
    }

    private void showGovs() {
        PopUpMenuHelper.showGovsPopUp(context, binding.searchInput, viewModel.govsDataList).setOnMenuItemClickListener(item -> {
            viewModel.selectGov = viewModel.govsDataList.get(item.getItemId()).getName();
            viewModel.getClients(viewModel.govsDataList.get(item.getItemId()).getId());
            return false;
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
