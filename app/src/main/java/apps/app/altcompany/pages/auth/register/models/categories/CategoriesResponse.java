package apps.app.altcompany.pages.auth.register.models.categories;

import com.google.gson.annotations.SerializedName;

import apps.app.altcompany.model.base.StatusMessage;

public class CategoriesResponse extends StatusMessage {

    @SerializedName("data")
    private AllDepartments allDepartments;

    public AllDepartments getAllDepartments() {
        return allDepartments;
    }
}