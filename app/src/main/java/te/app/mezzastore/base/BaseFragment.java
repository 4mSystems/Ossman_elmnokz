package te.app.mezzastore.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import te.app.mezzastore.R;
import te.app.mezzastore.activity.BaseActivity;
import te.app.mezzastore.model.base.Mutable;
import te.app.mezzastore.utils.Constants;
import te.app.mezzastore.utils.upload.FileOperations;


public class BaseFragment extends Fragment {
    private Context context;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }


    protected void pickImageDialogSelect(int requestCode) {
//        FileOperations.pickImage(context, BaseFragment.this, requestCode);
    }

    protected void pickVideo() {
//        FileOperations.pickVideo(context, BaseFragment.this, Constants.FILE_TYPE_VIDEO);
    }


    public void handleActions(Mutable mutable) {
        ((ParentActivity) context).handleActions(mutable);
    }

    public void showError(String msg) {
        if (context != null) {
            ((ParentActivity) context).showError(msg);
        }
    }

    public ParentActivity getActivityBase() {
        return ((ParentActivity) context);
    }

    public BaseActivity baseActivity() {
        return ((BaseActivity) context);
    }

    public void toastMessage(String message, int icon, int color) {
        ((ParentActivity) context).toastMessage(message, icon, color);
    }

    public void toastMessage(String message) {
        ((ParentActivity) context).toastMessage(message, R.drawable.ic_check_white_24dp, R.color.colorPrimaryDark);
    }


    protected void finishActivity() {
        ((ParentActivity) context).finish();
    }

    protected void finishAllActivities() {
        ((ParentActivity) context).finishAffinity();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private static final String TAG = "BaseFragment";

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
