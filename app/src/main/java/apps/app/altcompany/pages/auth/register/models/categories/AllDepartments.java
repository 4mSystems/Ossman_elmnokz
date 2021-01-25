package apps.app.altcompany.pages.auth.register.models.categories;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.pages.auth.models.cities.Cities;

public class AllDepartments {

    @SerializedName("cities")
    private List<Cities> cities;

    @SerializedName("categories")
    private List<DepartmentsItem> categories;

    public List<Cities> getCities() {
        return cities;
    }

    public List<DepartmentsItem> getCategories() {
        return categories;
    }
}