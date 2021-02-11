package apps.app.altcompany.pages.auth.models;

import android.text.TextUtils;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.validation.Validate;

public class RegisterRequest {
    @SerializedName("workers_username")
    private String name;
    @SerializedName("workers_phone_number")
    private String phone;
    @SerializedName("password")
    private String password;
    @SerializedName("FK_cities_id")
    private String FK_cities_id;
    @SerializedName("country_id")
    private String FK_countries_id;
    @SerializedName("workers_address")
    private String workers_address;
    @SerializedName("firebase_token")
    private String firebase_token;
    @SerializedName("email")
    private String email;
    @SerializedName("workers_lat")
    private String workers_lat;
    @SerializedName("workers_lang")
    private String workers_lang;
    private transient String bussinessregister;
    @SerializedName("workers_desc")
    private String workers_desc;
    @SerializedName("step")
    private String step;
    @SerializedName("category_id")
    private String category_id;
    @SerializedName("category")
    private String category;
    @SerializedName("sub_categories")
    private List<Integer> sub_categories;
    @SerializedName("package_id")
    private String package_id;
    @SerializedName("workers_fb")
    private String workers_fb;
    @SerializedName("workers_tw")
    private String workers_tw;
    @SerializedName("payment_success")
    private String payment_success;
    @SerializedName("Employees")
    private String employees;
    @SerializedName("date")
    private String date;
    private transient String cover;

    public transient ObservableField<String> passwordError = new ObservableField<>();
    public transient ObservableField<String> OldPasswordError = new ObservableField<>();
    public transient ObservableField<String> confirmPasswordError = new ObservableField<>();
    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> emailError = new ObservableField<>();
    public transient ObservableField<String> phoneError = new ObservableField<>();
    public transient ObservableField<String> countryError = new ObservableField<>();
    public transient ObservableField<String> cityError = new ObservableField<>();
    public transient ObservableField<String> addressError = new ObservableField<>();
    public transient ObservableField<String> desError = new ObservableField<>();
    public transient ObservableField<String> businessError = new ObservableField<>();
    public transient ObservableField<String> categoryIdError = new ObservableField<>();
    public transient ObservableField<String> empNumError = new ObservableField<>();
    public transient ObservableField<String> registerDateError = new ObservableField<>();


    public boolean isValidStep1() {
        boolean isValid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(password, Constants.FIELD)) {
            passwordError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(FK_countries_id, Constants.FIELD)) {
            countryError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(FK_cities_id, Constants.FIELD)) {
            cityError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(workers_address, Constants.FIELD)) {
            addressError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(workers_desc, Constants.FIELD)) {
            desError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(bussinessregister, Constants.FIELD)) {
            businessError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(employees, Constants.FIELD)) {
            empNumError.set(Validate.error);
            isValid = false;
        } else if (!Validate.isValid(bussinessregister, Constants.FIELD)) {
            registerDateError.set(Validate.error);
            isValid = false;
        }
        return isValid;
    }

    public boolean isValidStep2() {
        boolean isValid = true;
        if (!Validate.isValid(category_id, Constants.NAME_BAR)) {
            categoryIdError.set(Validate.error);
            isValid = false;
        }
        return isValid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getFK_cities_id() {
        return FK_cities_id;
    }

    public void setFK_cities_id(String FK_cities_id) {
        this.FK_cities_id = FK_cities_id;
    }

    public String getWorkers_address() {
        return workers_address;
    }

    public void setWorkers_address(String workers_address) {
        this.workers_address = workers_address;
    }

    public String getFirebase_token() {
        return firebase_token;
    }

    public void setFirebase_token(String firebase_token) {
        this.firebase_token = firebase_token;
    }

    public String getWorkers_lat() {
        return workers_lat;
    }

    public void setWorkers_lat(String workers_lat) {
        this.workers_lat = workers_lat;
    }

    public String getWorkers_lang() {
        return workers_lang;
    }

    public void setWorkers_lang(String workers_lang) {
        this.workers_lang = workers_lang;
    }

    public String getBussinessregister() {
        return bussinessregister;
    }

    public void setBussinessregister(String bussinessregister) {
        this.bussinessregister = bussinessregister;
    }

    public String getWorkers_desc() {
        return workers_desc;
    }

    public void setWorkers_desc(String workers_desc) {
        this.workers_desc = workers_desc;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public List<Integer> getSub_categories() {
        return sub_categories;
    }

    public void setSub_categories(List<Integer> sub_categories) {
        this.sub_categories = sub_categories;
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    public String getWorkers_fb() {
        return workers_fb;
    }

    public void setWorkers_fb(String workers_fb) {
        this.workers_fb = workers_fb;
    }

    public String getWorkers_tw() {
        return workers_tw;
    }

    public void setWorkers_tw(String workers_tw) {
        this.workers_tw = workers_tw;
    }

    public String getPayment_success() {
        return payment_success;
    }

    public void setPayment_success(String payment_success) {
        this.payment_success = payment_success;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFK_countries_id() {
        return FK_countries_id;
    }

    public void setFK_countries_id(String FK_countries_id) {
        this.FK_countries_id = FK_countries_id;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", FK_cities_id='" + FK_cities_id + '\'' +
                ", FK_countries_id='" + FK_countries_id + '\'' +
                ", workers_address='" + workers_address + '\'' +
                ", firebase_token='" + firebase_token + '\'' +
                ", email='" + email + '\'' +
                ", workers_lat='" + workers_lat + '\'' +
                ", workers_lang='" + workers_lang + '\'' +
                ", bussinessregister='" + bussinessregister + '\'' +
                ", workers_desc='" + workers_desc + '\'' +
                ", step='" + step + '\'' +
                ", category_id='" + category_id + '\'' +
                ", category='" + category + '\'' +
                ", sub_categories=" + sub_categories +
                ", package_id='" + package_id + '\'' +
                ", workers_fb='" + workers_fb + '\'' +
                ", workers_tw='" + workers_tw + '\'' +
                ", payment_success='" + payment_success + '\'' +
                ", employees='" + employees + '\'' +
                ", date='" + date + '\'' +
                ", cover='" + cover + '\'' +
                ", passwordError=" + passwordError +
                ", OldPasswordError=" + OldPasswordError +
                ", confirmPasswordError=" + confirmPasswordError +
                ", nameError=" + nameError +
                ", emailError=" + emailError +
                ", phoneError=" + phoneError +
                ", countryError=" + countryError +
                ", cityError=" + cityError +
                ", addressError=" + addressError +
                ", desError=" + desError +
                ", businessError=" + businessError +
                ", categoryIdError=" + categoryIdError +
                ", empNumError=" + empNumError +
                ", registerDateError=" + registerDateError +
                '}';
    }
}
