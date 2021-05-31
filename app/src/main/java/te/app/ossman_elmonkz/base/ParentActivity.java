package te.app.ossman_elmonkz.base;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.snackbar.Snackbar;

import org.imaginativeworld.oopsnointernet.NoInternetDialog;

import es.dmoral.toasty.Toasty;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.model.base.Mutable;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.resources.ResourceManager;
import te.app.ossman_elmonkz.utils.session.LanguagesHelper;
import te.app.ossman_elmonkz.utils.session.MyContextWrapper;

public class ParentActivity extends AppCompatActivity implements
        ConnectivityReceiver.ConnectivityReceiverListener {
    public NoInternetDialog noInternetDialog;
    public MutableLiveData<Boolean> ConnectionLiveData;
    ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();
    public MutableLiveData<Boolean> connectionMutableLiveData = new MutableLiveData<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConnectionLiveData = new MutableLiveData<>();
        initializeLanguage();
        initializeProgress();

    }


    protected boolean notification_checked = false;

    protected void initializeLanguage() {
        LanguagesHelper.changeLanguage(this, LanguagesHelper.getCurrentLanguage());
        LanguagesHelper.changeLanguage(MyApplication.getInstance(), LanguagesHelper.getCurrentLanguage());
    }


    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().setConnectivityListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(connectivityReceiver, intentFilter);
    }


    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(connectivityReceiver);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1) {
            super.attachBaseContext(MyContextWrapper.wrap(newBase, LanguagesHelper.getCurrentLanguage()));
        } else {
            super.attachBaseContext(newBase);
        }
    }

    protected Dialog dialogLoader;

    public void initializeProgress() {
        View view = LayoutInflater.from(this).inflate(R.layout.loader_animation, null);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customDialog);
        builder.setView(view);
        dialogLoader = builder.create();
        dialogLoader.setOnCancelListener(dialogInterface -> {
            dialogLoader.dismiss();
        });
    }

    public void showProgress() {
        //show dialog
        if (dialogLoader != null && !this.isFinishing()) {
            dialogLoader.show();
        }
    }

    public void hideProgress() {
        if (dialogLoader != null && dialogLoader.isShowing() && !this.isFinishing())
            dialogLoader.dismiss();
    }


    public void handleActions(Mutable mutable) {
        Log.e("handleActions", "handleActions: " + mutable.message);
        if (mutable.message.equals(Constants.SHOW_PROGRESS)) showProgress();
        else if (mutable.message.equals(Constants.HIDE_PROGRESS)) hideProgress();
        else if (mutable.message.equals(Constants.SERVER_ERROR) && mutable.object == null) {
            hideProgress();
            showError(ResourceManager.getString(R.string.msg_server_error));
        } else if (mutable.message.equals(Constants.ERROR) && mutable.object instanceof String) {
            hideProgress();
            showError((String) mutable.object);
        } else if (mutable.message.equals(Constants.ERROR_NOT_FOUND) && mutable.object instanceof String) {
            hideProgress();
            showError((String) mutable.object);
        } else if (mutable.message.equals(Constants.ERROR_TOAST) && mutable.object instanceof String) {
            toastError((String) mutable.object);
        } else if (mutable.message.equals(Constants.FAILURE_CONNECTION)) {
            hideProgress();
        } else if (mutable.message.equals(Constants.LOGOUT)) {
        }

    }

    public void noConnection() {
//        Resources resources = getResources();
//        // No Internet Dialog
//        NoInternetDialog.Builder builder1 = new NoInternetDialog.Builder(this);
//        // Optional
//        builder1.setConnectionCallback(hasActiveConnection -> {
//            if (hasActiveConnection)
//                noInternetDialog.destroy();
//            connectionMutableLiveData.postValue(hasActiveConnection);
//        });
//        builder1.setCancelable(false); // Optional
//        builder1.setNoInternetConnectionTitle(resources.getString(R.string.connection_invaild_msg)); // Optional
//        builder1.setNoInternetConnectionMessage(resources.getString(R.string.connection_invaild_body)); // Optional
//        builder1.setShowInternetOnButtons(true); // Optional
//        builder1.setPleaseTurnOnText(resources.getString(R.string.connection_On)); // Optional
//        builder1.setWifiOnButtonText(resources.getString(R.string.connection_Wifi)); // Optional
//        builder1.setMobileDataOnButtonText(resources.getString(R.string.connection_Data)); // Optional
//
//        builder1.setOnAirplaneModeTitle(resources.getString(R.string.connection_invaild_msg)); // Optional
//        builder1.setOnAirplaneModeMessage(resources.getString(R.string.connection_AirPlane)); // Optional
//        builder1.setPleaseTurnOffText(resources.getString(R.string.connection_AirPlane_TurnOff)); // Optional
//        builder1.setAirplaneModeOffButtonText(resources.getString(R.string.connection_AirPlane_Mode)); // Optional
//        builder1.setShowAirplaneModeOffButtons(true); // Optional
//        noInternetDialog = builder1.build();
        showError(ResourceManager.getString(R.string.connection_invaild_body));
    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        if (!isConnected) {
            noConnection();
        }
    }

    public void showError(String msg) {
        Snackbar snackBar = Snackbar.make(findViewById(R.id.ll_base_container),
                msg, Snackbar.LENGTH_LONG);
        View view = snackBar.getView();
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        TextView textView = view.findViewById(R.id.snackbar_text);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
        snackBar.show();
    }

    public void toastMessage(String message, int icon, int color) {
        Toasty.custom(this, message, icon, color, Toasty.LENGTH_SHORT, true, true).show();
    }

    public void toastError(String message) {
        Toasty.error(this, message, Toasty.LENGTH_SHORT, true).show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            if (resultCode == RESULT_OK) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_home_container);
                assert fragment != null;
                fragment.onActivityResult(requestCode, resultCode, data);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Toast.makeText(this, ResourceManager.getString(R.string.please_select_another_file), Toast.LENGTH_SHORT).show();
        }
    }


}
