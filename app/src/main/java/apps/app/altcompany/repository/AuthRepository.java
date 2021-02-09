package apps.app.altcompany.repository;


import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import apps.app.altcompany.connection.ConnectionHelper;
import apps.app.altcompany.connection.FileObject;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.model.base.StatusMessage;
import apps.app.altcompany.pages.auth.changePassword.ChangePasswordRequest;
import apps.app.altcompany.pages.auth.login.models.UsersResponse;
import apps.app.altcompany.pages.auth.models.ConfirmCodeRequest;
import apps.app.altcompany.pages.auth.models.ForgetPasswordRequest;
import apps.app.altcompany.pages.auth.models.LoginRequest;
import apps.app.altcompany.pages.auth.models.RegisterRequest;
import apps.app.altcompany.pages.auth.models.SocialRequest;
import apps.app.altcompany.pages.auth.models.cities.CitiesResponse;
import apps.app.altcompany.pages.auth.models.countries.CountriesResponse;
import apps.app.altcompany.pages.auth.register.models.PrivacyResponse;
import apps.app.altcompany.pages.auth.register.models.RegisterStep1Response;
import apps.app.altcompany.pages.auth.register.models.SubCategoriesResponse;
import apps.app.altcompany.pages.auth.register.models.categories.CategoriesResponse;
import apps.app.altcompany.pages.auth.register.models.packages.PackageResponse;
import apps.app.altcompany.utils.Constants;
import apps.app.altcompany.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class AuthRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public AuthRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getCities(String countryId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CITIES + countryId, new Object(), CitiesResponse.class,
                Constants.CITIES, true);
    }

    public Disposable getCountries() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COUNTRIES, new Object(), CountriesResponse.class,
                Constants.COUNTRIES, true);
    }

    public Disposable login(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_PHONE, request, UsersResponse.class,
                Constants.LOGIN, true);
    }

    public Disposable loginSocial(SocialRequest socialRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_SOCIAL, socialRequest, UsersResponse.class,
                Constants.LOGIN, true);
    }

    public Disposable register(RegisterRequest request, List<FileObject> fileObjects) {
        if (fileObjects != null && fileObjects.size() > 0)
            return connectionHelper.requestApi(URLS.REGISTER, request, fileObjects, RegisterStep1Response.class,
                    Constants.REGISTER, true);
        else
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REGISTER, request, RegisterStep1Response.class,
                    Constants.REGISTER, true);
    }

    public Disposable registerStep4(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REGISTER, request, UsersResponse.class,
                Constants.REGISTER, true);
    }

    public Disposable updateCategories(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_CATEGORY, request, StatusMessage.class,
                Constants.UPDATE_CATEGORY, true);
    }

    public Disposable registerStep3(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REGISTER, request, StatusMessage.class,
                Constants.REGISTER, true);
    }

    public Disposable confirmCode(ConfirmCodeRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONFIRM_CODE, request, UsersResponse.class,
                Constants.CONFIRM_CODE, true);
    }


    public Disposable updateProfile(RegisterRequest request, ArrayList<FileObject> fileObjects) {
        if (fileObjects == null) {
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_PROFILE, request, UsersResponse.class,
                    Constants.UPDATE_PROFILE, true);
        } else {
            return connectionHelper.requestApi(URLS.UPDATE_PROFILE, request, fileObjects, UsersResponse.class,
                    Constants.UPDATE_PROFILE, true);
        }

    }

    public Disposable forgetPassword(ForgetPasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.FORGET_PASSWORD, request, StatusMessage.class,
                Constants.FORGET_PASSWORD, true);
    }

    public Disposable changePassword(ChangePasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_PASSWORD, request, UsersResponse.class,
                Constants.CHANGE_PASSWORD, true);
    }

    public Disposable terms() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.TERMS, new Object(), PrivacyResponse.class,
                Constants.TERMS, true);
    }

    public Disposable categories() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CATEGORIES, new Object(), CategoriesResponse.class,
                Constants.CATEGORIES, true);
    }

    public Disposable subCategories(int catId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.SUB_CATEGORIES + catId, new Object(), SubCategoriesResponse.class,
                Constants.SUB_CATEGORIES, true);
    }

    public Disposable packages() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PACKAGES, new Object(), PackageResponse.class,
                Constants.PACKAGES, true);
    }

    public Disposable companyProfile() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COMPANY_PROFILE, new Object(), UsersResponse.class,
                Constants.COMPANY_PROFILE, true);
    }

}