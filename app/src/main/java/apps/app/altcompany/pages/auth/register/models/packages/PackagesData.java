package apps.app.altcompany.pages.auth.register.models.packages;

import com.google.gson.annotations.SerializedName;

public class PackagesData {

	@SerializedName("packages_name")
	private String packagesName;

	@SerializedName("packages_price")
	private String packagesPrice;

	@SerializedName("packages_id")
	private int packagesId;

	@SerializedName("packages_desc")
	private String packagesDesc;

	@SerializedName("packages_points")
	private String packagesPoints;

	public String getPackagesName(){
		return packagesName;
	}

	public String getPackagesPrice(){
		return packagesPrice;
	}

	public int getPackagesId(){
		return packagesId;
	}

	public String getPackagesDesc(){
		return packagesDesc;
	}

	public String getPackagesPoints(){
		return packagesPoints;
	}
}