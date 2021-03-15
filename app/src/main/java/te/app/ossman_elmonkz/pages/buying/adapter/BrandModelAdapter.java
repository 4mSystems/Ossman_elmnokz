package te.app.ossman_elmonkz.pages.buying.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.databinding.ItemBrandBinding;
import te.app.ossman_elmonkz.pages.buying.models.BrandsModellsItem;
import te.app.ossman_elmonkz.pages.buying.viewModels.ItemBrandModelViewModel;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class BrandModelAdapter extends RecyclerView.Adapter<BrandModelAdapter.ViewHolder> implements Filterable {
    List<BrandsModellsItem> brandsModellsItemList;
    List<BrandsModellsItem> brandsModellsItemListFilter;
    Context context;
    public MutableLiveData<BrandsModellsItem> selectedIdLiveData = new MutableLiveData<>();

    public BrandModelAdapter() {
        this.brandsModellsItemList = new ArrayList<>();
        this.brandsModellsItemListFilter = brandsModellsItemList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brand,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        BrandsModellsItem categoriesData = brandsModellsItemListFilter.get(position);
        ItemBrandModelViewModel itemMenuViewModel = new ItemBrandModelViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> selectedIdLiveData.setValue(categoriesData));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<BrandsModellsItem> dataList) {
        this.brandsModellsItemListFilter.clear();
        brandsModellsItemListFilter.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    brandsModellsItemListFilter = brandsModellsItemList;
                } else {
                    List<BrandsModellsItem> filteredList = new ArrayList<>();
                    for (BrandsModellsItem row : brandsModellsItemList) {
                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getName().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }

                    brandsModellsItemListFilter = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = brandsModellsItemListFilter;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                brandsModellsItemListFilter = (ArrayList<BrandsModellsItem>) filterResults.values;
                notifyDataSetChanged();
            }
        };
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
        return brandsModellsItemListFilter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemBrandBinding itemMenuBinding;

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

        void setViewModel(ItemBrandModelViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
