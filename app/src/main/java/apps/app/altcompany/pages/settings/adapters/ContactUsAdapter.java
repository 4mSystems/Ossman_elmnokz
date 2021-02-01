package apps.app.altcompany.pages.settings.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import apps.app.altcompany.R;
import apps.app.altcompany.databinding.ItemContactBinding;
import apps.app.altcompany.pages.settings.models.SocialsItem;
import apps.app.altcompany.pages.settings.viewModels.ItemContactViewModel;
import apps.app.altcompany.utils.helper.AppHelper;
import apps.app.altcompany.utils.helper.MovementHelper;

public class ContactUsAdapter extends RecyclerView.Adapter<ContactUsAdapter.ViewHolder> {
    List<SocialsItem> socialsItemList;
    Context context;

    public ContactUsAdapter() {
        this.socialsItemList = new ArrayList<>();
    }

    public List<SocialsItem> getSocialsItemList() {
        return socialsItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        SocialsItem dataModel = socialsItemList.get(position);
        ItemContactViewModel itemMenuViewModel = new ItemContactViewModel(dataModel);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> MovementHelper.startWebPage(context, dataModel.getSocialLink()));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<SocialsItem> dataList) {
        this.socialsItemList.clear();
        socialsItemList.addAll(dataList);
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
        return socialsItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemContactBinding itemMenuBinding;

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

        void setViewModel(ItemContactViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemContactViewModel(itemViewModels);
            }
        }
    }
}
