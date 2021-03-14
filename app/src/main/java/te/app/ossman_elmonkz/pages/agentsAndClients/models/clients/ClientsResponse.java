package te.app.ossman_elmonkz.pages.agentsAndClients.models.clients;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class ClientsResponse extends StatusMessage {

	@SerializedName("data")
	private List<ClientData> data;

	public List<ClientData> getData(){
		return data;
	}

}