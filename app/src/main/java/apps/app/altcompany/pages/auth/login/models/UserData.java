package apps.app.altcompany.pages.auth.login.models;

import com.google.gson.annotations.SerializedName;

public class UserData {

	@SerializedName("workers_id")
	private int workersId;

	@SerializedName("jwt")
	private String jwt;

	@SerializedName("workers_lat")
	private String workersLat;

	@SerializedName("workers_desc")
	private String workersDesc;

	@SerializedName("workers_updated_at")
	private String workersUpdatedAt;

	@SerializedName("workers_status")
	private int workersStatus;

	@SerializedName("workers_phone_number")
	private String workersPhoneNumber;

	@SerializedName("workers_username")
	private String workersUsername;

	@SerializedName("FK_categories_id")
	private Object fKCategoriesId;

	@SerializedName("rate_value")
	private String rateValue;

	@SerializedName("FK_packages_id")
	private Object fKPackagesId;

	@SerializedName("email")
	private String email;

	@SerializedName("workers_fb")
	private Object workersFb;

	@SerializedName("workers_img")
	private String workersImg;

	@SerializedName("expiry_date")
	private Object expiryDate;

	@SerializedName("workers_lang")
	private String workersLang;

	@SerializedName("workers_tw")
	private Object workersTw;

	@SerializedName("deleted_at")
	private Object deletedAt;

	@SerializedName("offers_price")
	private Object offersPrice;

	@SerializedName("step")
	private int step;

	@SerializedName("workers_verified")
	private int workersVerified;

	@SerializedName("FK_cities_id")
	private int fKCitiesId;

	@SerializedName("workers_points")
	private String workersPoints;

	@SerializedName("workers_bussinessregister")
	private String workersBussinessregister;

	@SerializedName("workers_created_at")
	private String workersCreatedAt;
@SerializedName("workers_address")
	private String workers_address;

	public int getWorkersId(){
		return workersId;
	}

	public String getJwt(){
		return jwt;
	}

	public String getWorkersLat(){
		return workersLat;
	}

	public String getWorkersDesc(){
		return workersDesc;
	}

	public String getWorkersUpdatedAt(){
		return workersUpdatedAt;
	}

	public int getWorkersStatus(){
		return workersStatus;
	}

	public String getWorkersPhoneNumber(){
		return workersPhoneNumber;
	}

	public String getWorkersUsername(){
		return workersUsername;
	}

	public Object getFKCategoriesId(){
		return fKCategoriesId;
	}

	public String getRateValue(){
		return rateValue;
	}

	public Object getFKPackagesId(){
		return fKPackagesId;
	}

	public String getEmail(){
		return email;
	}

	public Object getWorkersFb(){
		return workersFb;
	}

	public String getWorkersImg(){
		return workersImg;
	}

	public Object getExpiryDate(){
		return expiryDate;
	}

	public String getWorkersLang(){
		return workersLang;
	}

	public Object getWorkersTw(){
		return workersTw;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public Object getOffersPrice(){
		return offersPrice;
	}

	public int getStep(){
		return step;
	}

	public int getWorkersVerified(){
		return workersVerified;
	}

	public int getFKCitiesId(){
		return fKCitiesId;
	}

	public String getWorkersPoints(){
		return workersPoints;
	}

	public String getWorkersBussinessregister(){
		return workersBussinessregister;
	}

	public String getWorkersCreatedAt(){
		return workersCreatedAt;
	}

	public void setWorkersId(int workersId) {
		this.workersId = workersId;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public void setWorkersLat(String workersLat) {
		this.workersLat = workersLat;
	}

	public void setWorkersDesc(String workersDesc) {
		this.workersDesc = workersDesc;
	}

	public void setWorkersUpdatedAt(String workersUpdatedAt) {
		this.workersUpdatedAt = workersUpdatedAt;
	}

	public void setWorkersStatus(int workersStatus) {
		this.workersStatus = workersStatus;
	}

	public void setWorkersPhoneNumber(String workersPhoneNumber) {
		this.workersPhoneNumber = workersPhoneNumber;
	}

	public void setWorkersUsername(String workersUsername) {
		this.workersUsername = workersUsername;
	}

	public Object getfKCategoriesId() {
		return fKCategoriesId;
	}

	public void setfKCategoriesId(Object fKCategoriesId) {
		this.fKCategoriesId = fKCategoriesId;
	}

	public void setRateValue(String rateValue) {
		this.rateValue = rateValue;
	}

	public Object getfKPackagesId() {
		return fKPackagesId;
	}

	public void setfKPackagesId(Object fKPackagesId) {
		this.fKPackagesId = fKPackagesId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setWorkersFb(Object workersFb) {
		this.workersFb = workersFb;
	}

	public void setWorkersImg(String workersImg) {
		this.workersImg = workersImg;
	}

	public void setExpiryDate(Object expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setWorkersLang(String workersLang) {
		this.workersLang = workersLang;
	}

	public void setWorkersTw(Object workersTw) {
		this.workersTw = workersTw;
	}

	public void setDeletedAt(Object deletedAt) {
		this.deletedAt = deletedAt;
	}

	public void setOffersPrice(Object offersPrice) {
		this.offersPrice = offersPrice;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public void setWorkersVerified(int workersVerified) {
		this.workersVerified = workersVerified;
	}

	public int getfKCitiesId() {
		return fKCitiesId;
	}

	public void setfKCitiesId(int fKCitiesId) {
		this.fKCitiesId = fKCitiesId;
	}

	public void setWorkersPoints(String workersPoints) {
		this.workersPoints = workersPoints;
	}

	public void setWorkersBussinessregister(String workersBussinessregister) {
		this.workersBussinessregister = workersBussinessregister;
	}

	public void setWorkersCreatedAt(String workersCreatedAt) {
		this.workersCreatedAt = workersCreatedAt;
	}

	public String getWorkers_address() {
		return workers_address;
	}

	public void setWorkers_address(String workers_address) {
		this.workers_address = workers_address;
	}
}