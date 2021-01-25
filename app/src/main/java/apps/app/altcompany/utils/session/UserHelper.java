package apps.app.altcompany.utils.session;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import apps.app.altcompany.pages.auth.models.UserData;

public class UserHelper {
    private static UserHelper mInstance;
    private Context mCtx;
    private static final String SHARED_PREF_NAME = "myshared";

    private UserHelper(Context context) {
        mCtx = context;
    }

    //
    public static synchronized UserHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new UserHelper(context);
        }
        return mInstance;
    }

    public void userLogin(UserData userData) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(userData);
        editor.putString("userData", json);
        editor.apply();
        editor.commit();

    }


    public String addUserData() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("userData", null);

    }

    public UserData getUserData() {
        Gson gson = new Gson();
        String json = addUserData();
        UserData obj = gson.fromJson(json, UserData.class);
        return obj;
    }


    public String addSettingsData() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("settingsData", null);

    }


    public void addIsFirst(boolean isFirst) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isFirst", isFirst);
        editor.apply();

    }

    public boolean getIsFirst() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("isFirst", false);
    }

    public void addToken(String token) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("token", token);
        editor.apply();

    }

    public String getToken() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("token", null);
    }

    public boolean loggout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;
    }

    public void addCountryId(int CountryId) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("CountryId", CountryId);
        editor.apply();

    }

    public int getCountryId() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt("CountryId", 0);
    }

    public void addJwt(String jwt) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("jwt", jwt);
        editor.apply();

    }

    public void addCountryCodes(String countryCodes) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("countryCodes", countryCodes);
        editor.apply();

    }

    public String getCountryCodes() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("countryCodes", "");
    }

    public String getJwt() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("jwt", null);
    }

    public void saveStep(String step) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("step", step);
        editor.apply();

    }

    public String getStep() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("step", "");
    }

}
