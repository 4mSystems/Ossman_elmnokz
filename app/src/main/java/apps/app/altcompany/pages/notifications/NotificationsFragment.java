package apps.app.altcompany.pages.notifications;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import apps.app.altcompany.BR;
import apps.app.altcompany.R;
import apps.app.altcompany.activity.BaseActivity;
import apps.app.altcompany.base.BaseFragment;
import apps.app.altcompany.base.IApplicationComponent;
import apps.app.altcompany.base.MyApplication;
import apps.app.altcompany.databinding.FragmentNotificationsBinding;
import apps.app.altcompany.model.base.Mutable;
import apps.app.altcompany.pages.notifications.models.NotificationsResponse;
import apps.app.altcompany.pages.notifications.viewModels.NotificationsViewModels;
import apps.app.altcompany.utils.Constants;

public class NotificationsFragment extends BaseFragment {
    FragmentNotificationsBinding notificationsBinding;
    @Inject
    NotificationsViewModels notificationsViewModels;
    private Context context;

    public NotificationsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        notificationsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        notificationsBinding.setViewModel(notificationsViewModels);
        notificationsViewModels.notifications();
        setEvent();
        return notificationsBinding.getRoot();
    }

    private void setEvent() {
        notificationsViewModels.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.NOTIFICATIONS.equals(((Mutable) o).message)) {
                notificationsViewModels.getNotificationsAdapter().updateData(((NotificationsResponse) ((Mutable) o).object).getData());
                notificationsViewModels.notifyChange(BR.notificationsAdapter);
            }
        });
        getActivityBase().connectionMutableLiveData.observe(((LifecycleOwner) context), isConnected -> {
            if (isConnected)
                notificationsViewModels.notifications();
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        notificationsViewModels.getSettingsRepository().setLiveData(notificationsViewModels.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
