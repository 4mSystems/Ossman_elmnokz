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
import apps.app.altcompany.pages.auth.register.models.categories.RelatedSubCategoriesItem;
import apps.app.altcompany.pages.auth.register.viewModels.ItemCategoriesViewModel;
import apps.app.altcompany.utils.Constants;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {
    public List<RelatedSubCategoriesItem> categoryDataList;
    private Context context;
    private List<Integer> selectedCategories = new ArrayList<>();

    public CategoriesAdapter() {
        this.categoryDataList = new ArrayList<>();
    }

    public List<RelatedSubCategoriesItem> getCategoryDataList() {
        return categoryDataList;
    }

    public List<Integer> getSelectedCategories() {
        return selectedCategories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        RelatedSubCategoriesItem categoryData = categoryDataList.get(position);
        ItemCategoriesViewModel itemMenuViewModel = new ItemCategoriesViewModel(categoryData);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            if (o.equals(Constants.ADD_CAT)) {
                selectedCategories.add(categoryData.getSubCategoriesId());
            } else if (o.equals(Constants.REMOVE_CAT)) {
                int index = isFound(categoryData.getSubCategoriesId());
                if (index != -1)
                    selectedCategories.remove(index);
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }

    private int isFound(int id) {
        for (int i = 0; i < categoryDataList.size(); i++) {
            if (categoryDataList.get(i).getSubCategoriesId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void update(List<RelatedSubCategoriesItem> dataList) {
        this.categoryDataList.clear();
        categoryDataList.addAll(dataList);
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
        return categoryDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemCategoryBinding binding;

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

        void setViewModel(ItemCategoriesViewModel itemViewModels) {
            if (binding != null) {
                binding.setItemViewModel(itemViewModels);
            }
        }
    }
}
