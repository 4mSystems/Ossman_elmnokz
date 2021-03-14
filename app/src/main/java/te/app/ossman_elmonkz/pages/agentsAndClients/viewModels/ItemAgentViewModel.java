package te.app.ossman_elmonkz.pages.agentsAndClients.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.agentsAndClients.models.AgentData;

public class ItemAgentViewModel extends BaseViewModel {
    public AgentData agentData;

    public ItemAgentViewModel(AgentData menuModel) {
        this.agentData = menuModel;
    }

    @Bindable
    public AgentData getAgentData() {
        return agentData;
    }

}
