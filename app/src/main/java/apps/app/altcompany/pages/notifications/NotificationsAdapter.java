package apps.app.altcompany.pages.notifications;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import apps.app.altcompany.R;
import apps.app.altcompany.databinding.ItemNotificationBinding;
import apps.app.altcompany.pages.notifications.itemViewModels.NotificationsItemViewModels;
import apps.app.altcompany.pages.notifications.models.NotificationsData;


public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder> {
    public List<NotificationsData> notificationsDataList;
    Context context;

    public NotificationsAdapter() {
        notificationsDataList = new ArrayList<>();
    }


    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification,
                parent, false);
        context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NotificationsData dataModel = notificationsDataList.get(position);
        NotificationsItemViewModels homeItemViewModels = new NotificationsItemViewModels(dataModel);
        holder.setViewModel(homeItemViewModels);
    }

    @Override
    public int getItemCount() {
        return this.notificationsDataList.size();
    }

    //
    @Override
    public void onViewAttachedToWindow(ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    public void updateData(@Nullable List<NotificationsData> data) {
        this.notificationsDataList.clear();

        this.notificationsDataList.addAll(data);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemNotificationBinding itemBinding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (itemBinding == null) {
                itemBinding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (itemBinding != null) {
                itemBinding.unbind();
            }
        }

        void setViewModel(NotificationsItemViewModels itemViewModels) {
            if (itemBinding != null) {
                itemBinding.setItemNotificationViewModel(itemViewModels);
            }
        }
    }
}
