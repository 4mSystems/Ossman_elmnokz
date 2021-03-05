package te.app.ossman_elmonkz.repository;

import androidx.lifecycle.MutableLiveData;

import te.app.ossman_elmonkz.utils.Constants;


public class BaseRepository {
    private int status = 0;
    private String message = "";
    private MutableLiveData<Object> mMutableLiveData;
    private static final String TAG = "BaseRepository";

//    public BaseRepository(MutableLiveData<Object> mMutableLiveData) {
//        this.mMutableLiveData = mMutableLiveData;
//    }

    public boolean catchErrorResponse(Object response) {
//        Log.d(TAG, "catchErrorResponse: response");
//        if(response instanceof NoConnectivityException) {
//            Log.d(TAG, "NoConnectivityException: ");
//            mMutableLiveData.setValue(Constants.HIDE_PROGRESS);
//            NoConnectivityException throwable = (NoConnectivityException) response;
//            message = throwable.getMessage();
//            Timber.e("NoConnectivityException2:"+message);
//            mMutableLiveData.setValue(Constants.FAILURE_CONNECTION);
//            return true;
//        }else if(response instanceof Throwable){
//            Log.d(TAG, "Throwable: ");
//            mMutableLiveData.setValue(Constants.HIDE_PROGRESS);
//            Throwable throwable = (Throwable) response;
//            message = throwable.getMessage();
//            mMutableLiveData.setValue(Constants.SERVER_ERROR);
//            return true;
//        }
//        Log.d(TAG, "failed: ");
        return false;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }


    public void setMessage(int status, String message) {
        this.status = status;
        this.message = message;
        if (status == Constants.RESPONSE_JWT_EXPIRE) {
            if (mMutableLiveData != null) mMutableLiveData.setValue(Constants.LOGOUT);
        }
    }

    public MutableLiveData<Object> getmMutableLiveData() {
        return mMutableLiveData;
    }
}
