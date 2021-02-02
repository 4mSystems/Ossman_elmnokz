package apps.app.altcompany.pages.auth.models.countries;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class CountriesResponse extends StatusMessage {
	@SerializedName("data")
	private List<Countries> data;

	public List<Countries> getData(){
		return data;
	}
}