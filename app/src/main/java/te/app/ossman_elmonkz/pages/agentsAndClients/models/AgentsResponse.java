package te.app.ossman_elmonkz.pages.agentsAndClients.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class AgentsResponse extends StatusMessage {

    @SerializedName("data")
    private List<AgentData> data;

    public List<AgentData> getData() {
        return data;
    }
}