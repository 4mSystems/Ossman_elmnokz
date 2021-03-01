package te.app.mezzastore.pages.home.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.mezzastore.PassingObject;
import te.app.mezzastore.R;
import te.app.mezzastore.databinding.ItemHomeBinding;
import te.app.mezzastore.pages.home.models.CategoriesItem;
import te.app.mezzastore.pages.home.viewModels.ItemCategoryViewModel;
import te.app.mezzastore.pages.products.ProductsFragment;
import te.app.mezzastore.pages.subCategories.SubCategoriesFragment;
import te.app.mezzastore.utils.Constants;
import te.app.mezzastore.utils.helper.MovementHelper;
import te.app.mezzastore.utils.resources.ResourceManager;


public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {
    List<CategoriesItem> categoriesDataList;
    Context context;
    public int pageType;

    public CategoriesAdapter() {
        this.categoriesDataList = new ArrayList<>();
    }

    public List<CategoriesItem> getCategoriesDataList() {
        return categoriesDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        CategoriesItem categoriesData = categoriesDataList.get(position);
        ItemCategoryViewModel itemMenuViewModel = new ItemCategoryViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            if (o.equals(Constants.SUB_CATEGORIES)) {
                if (pageType == 0)
                    MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getId()), categoriesData.getTitle(), SubCategoriesFragment.class.getName(), null);
                else
                    MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getId()), categoriesData.getTitle(), ProductsFragment.class.getName(), null);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<CategoriesItem> dataList) {
        this.categoriesDataList.clear();
        categoriesDataList.addAll(dataList);
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
        return categoriesDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemHomeBinding itemMenuBinding;

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

        void setViewModel(ItemCategoryViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
