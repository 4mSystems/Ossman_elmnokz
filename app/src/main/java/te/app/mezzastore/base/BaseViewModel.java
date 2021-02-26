package te.app.mezzastore.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.PropertyChangeRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import te.app.mezzastore.BR;
import te.app.mezzastore.PassingObject;
import te.app.mezzastore.R;
import te.app.mezzastore.utils.images.PhotoFullPopupWindow;
import te.app.mezzastore.utils.resources.ResourceManager;
import te.app.mezzastore.utils.session.LanguagesHelper;
import te.app.mezzastore.utils.session.UserHelper;


public class BaseViewModel extends ViewModel implements Observable {
    private MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
    private ObservableField<String> message = new ObservableField<>();
    private PropertyChangeRegistry mCallBacks;
    private PassingObject passingObject = new PassingObject();
    public String lang = LanguagesHelper.getCurrentLanguage();


    public BaseViewModel() {
        mCallBacks = new PropertyChangeRegistry();
    }

    public MutableLiveData<Object> getLiveData() {
        return mutableLiveData == null ? mutableLiveData = new MutableLiveData<>() : mutableLiveData;
    }

    public String getMessage() {
        return message.get();
    }

    public void setMessage(Object message) {
        this.message.set(message.toString());
    }

    public void setMessageFromRes(int stringRes) {
        this.message.set(getString(stringRes));
    }


    public String getString(int stringRes) {
        return ResourceManager.getString(stringRes);
    }

    public Drawable getDrawable(int drawable) {
        return ResourceManager.getDrawable(drawable);
    }


    public String[] getStringArray(int resArray) {
        return MyApplication.getInstance().getResources().getStringArray(resArray);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.remove(callback);
    }

    public void goBack(Context context) {
        ((Activity) context).finish();
    }

    public void notifyChange() {
        mCallBacks.notifyChange(this, 0);
    }

    public void notifyChange(int propertyId) {
        mCallBacks.notifyChange(this, propertyId);
    }

    @Bindable
    public PassingObject getPassingObject() {
        return passingObject;
    }

    @Bindable
    public void setPassingObject(PassingObject passingObject) {
        notifyChange(BR.passingObject);
        this.passingObject = passingObject;
    }

    public String getStep() {
        return UserHelper.getInstance(MyApplication.getInstance()).getStep();
    }

    public void showImage(String imgUrl, View imageView) {
        new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, imageView, imgUrl, null);
    }
}
