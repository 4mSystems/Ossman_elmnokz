package apps.app.altcompany.pages.notifications.itemViewModels;

import androidx.databinding.Bindable;

import apps.app.altcompany.base.BaseViewModel;
import apps.app.altcompany.pages.notifications.models.NotificationsData;

public class NotificationsItemViewModels extends BaseViewModel {
    private NotificationsData notificationsData;

    public NotificationsItemViewModels(NotificationsData notificationsData) {
        this.notificationsData = notificationsData;
    }

    @Bindable
    public NotificationsData getNotificationsData() {
        return notificationsData;
    }

}
