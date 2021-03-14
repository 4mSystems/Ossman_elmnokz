package te.app.ossman_elmonkz.pages.agentsAndClients.viewModels;

import androidx.databinding.Bindable;

import te.app.ossman_elmonkz.base.BaseViewModel;
import te.app.ossman_elmonkz.pages.agentsAndClients.models.clients.ClientData;

public class ItemClientViewModel extends BaseViewModel {
    public ClientData clientData;

    public ItemClientViewModel(ClientData menuModel) {
        this.clientData = menuModel;
    }

    @Bindable
    public ClientData getClientData() {
        return clientData;
    }

}
