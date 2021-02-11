package apps.app.altcompany.pages.myWorks.models;

import com.google.gson.annotations.SerializedName;

public class OffersData {

	@SerializedName("offers_id")
	private int offersId;

	@SerializedName("offers_img")
	private String offersImg;

	public int getOffersId(){
		return offersId;
	}

	public String getOffersImg(){
		return offersImg;
	}
}