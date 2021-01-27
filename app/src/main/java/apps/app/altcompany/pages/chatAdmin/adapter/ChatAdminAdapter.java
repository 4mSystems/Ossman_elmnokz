package apps.app.altcompany.pages.chatAdmin.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import apps.app.altcompany.R;
import apps.app.altcompany.databinding.ItemChatAdminBinding;
import apps.app.altcompany.pages.chatAdmin.model.ChatAdmin;
import apps.app.altcompany.pages.chatAdmin.viewmodel.ItemChatAdminViewModel;

public class ChatAdminAdapter extends RecyclerView.Adapter<ChatAdminAdapter.ViewHolder> {
    List<ChatAdmin> chatList;
    Context context;

    public ChatAdminAdapter() {
        this.chatList = new ArrayList<>();
    }

    public List<ChatAdmin> getChatList() {
        return chatList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_admin,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        ChatAdmin dataModel = chatList.get(position);
        ItemChatAdminViewModel itemMenuViewModel = new ItemChatAdminViewModel(dataModel);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ChatAdmin> dataList) {
        this.chatList.clear();
        chatList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemChatAdminBinding itemMenuBinding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }

        void bind() {
            if (itemMenuBinding == null) {
                itemMenuBinding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (itemMenuBinding != null) {
                itemMenuBinding.unbind();
            }
        }

        void setViewModel(ItemChatAdminViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemChatViewModel(itemViewModels);
            }
        }
    }
}
