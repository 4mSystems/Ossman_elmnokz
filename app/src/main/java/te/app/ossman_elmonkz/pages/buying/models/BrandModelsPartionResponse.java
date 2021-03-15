package te.app.ossman_elmonkz.pages.buying.models;

import com.google.gson.annotations.SerializedName;

import te.app.ossman_elmonkz.model.base.StatusMessage;

public class BrandModelsPartionResponse extends StatusMessage {

	@SerializedName("data")
	private BrandModelsPartionMain data;

	public BrandModelsPartionMain getData(){
		return data;
	}


}