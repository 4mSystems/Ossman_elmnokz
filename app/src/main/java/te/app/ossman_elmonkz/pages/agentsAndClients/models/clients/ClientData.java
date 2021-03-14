package te.app.ossman_elmonkz.pages.agentsAndClients.models.clients;

import com.google.gson.annotations.SerializedName;

public class ClientData {

	@SerializedName("address")
	private String address;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("gov_id")
	private String govId;

	@SerializedName("id")
	private int id;

	@SerializedName("shop_name")
	private String shopName;

	public String getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public String getName(){
		return name;
	}

	public String getGovId(){
		return govId;
	}

	public int getId(){
		return id;
	}

	public String getShopName(){
		return shopName;
	}
}