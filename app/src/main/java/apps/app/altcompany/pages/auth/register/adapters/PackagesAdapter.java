package apps.app.altcompany.pages.auth.register.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import apps.app.altcompany.R;
import apps.app.altcompany.databinding.ItemCategoryBinding;
import apps.app.altcompany.databinding.ItemRechargeBinding;
import apps.app.altcompany.pages.auth.register.models.categories.RelatedSubCategoriesItem;
import apps.app.altcompany.pages.auth.register.models.packages.PackagesData;
import apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel;
import apps.app.altcompany.pages.auth.register.viewModels.ItemPackagesViewModel;
import apps.app.altcompany.utils.Constants;

public class PackagesAdapter extends RecyclerView.Adapter<PackagesAdapter.ViewHolder> {
    public List<PackagesData> packagesDataList;
    private Context context;
    public int lastPosition = 0;

    public PackagesAdapter() {
        this.packagesDataList = new ArrayList<>();
    }

    public List<PackagesData> getPackagesDataList() {
        return packagesDataList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recharge,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        PackagesData packagesData = packagesDataList.get(position);
        ItemPackagesViewModel itemMenuViewModel = new ItemPackagesViewModel(packagesData);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            notifyItemChanged(lastPosition);
            lastPosition = position;
            notifyItemChanged(lastPosition);
        });
        if (lastPosition == position)
            holder.binding.radio.setImageResource(R.drawable.ic_radio_fill);
        else
            holder.binding.radio.setImageResource(R.drawable.ic_radio_empty);
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<PackagesData> dataList) {
        this.packagesDataList.clear();
        packagesDataList.addAll(dataList);
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
        return packagesDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemRechargeBinding binding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }

        void bind() {
            if (binding == null) {
                binding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (binding != null) {
                binding.unbind();
            }
        }

        void setViewModel(ItemPackagesViewModel itemViewModels) {
            if (binding != null) {
                binding.setItemMenuViewModel(itemViewModels);
            }
        }
    }
}
