package apps.app.altcompany.base;

import android.app.Application;

import androidx.databinding.DataBindingUtil;

import apps.app.altcompany.utils.services.RealTimeReceiver;

public class MyApplication extends Application {
    IApplicationComponent applicationComponent;
    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        applicationComponent = DaggerIApplicationComponent.builder().build();
        DataBindingUtil.setDefaultComponent(new ApplicationComponent());
    }
    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
    public void setMessageReceiverListener(RealTimeReceiver.MessageReceiverListener listener) {
        RealTimeReceiver.messageReceiverListene = listener;
    }
    public IApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

}
