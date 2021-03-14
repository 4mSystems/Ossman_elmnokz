package te.app.ossman_elmonkz.pages.subCategories.adapters;

import android.content.Context;
import android.util.Log;
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

import te.app.ossman_elmonkz.PassingObject;
import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.databinding.ItemHomeBinding;
import te.app.ossman_elmonkz.pages.buying.BuyingFragment;
import te.app.ossman_elmonkz.pages.gallery.GalleryFragment;
import te.app.ossman_elmonkz.pages.home.models.CategoriesItem;
import te.app.ossman_elmonkz.pages.home.viewModels.ItemCategoryViewModel;
import te.app.ossman_elmonkz.pages.subCategories.SubCategorySearchFragment;
import te.app.ossman_elmonkz.utils.Constants;
import te.app.ossman_elmonkz.utils.helper.MovementHelper;


public class SubCategoriesAdapter extends RecyclerView.Adapter<SubCategoriesAdapter.ViewHolder> {
    List<CategoriesItem> categoriesDataList;
    Context context;
    public int pageType;

    public SubCategoriesAdapter() {
        this.categoriesDataList = new ArrayList<>();
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
            if (categoriesData.getCategory_id() == 1) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getCategory_id(), String.valueOf(categoriesData.getId())), categoriesData.getTitle(), SubCategorySearchFragment.class.getName(), null);
            } else if (categoriesData.getCategory_id() == 2) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getCategory_id(), String.valueOf(categoriesData.getId())), categoriesData.getTitle(), BuyingFragment.class.getName(), null);
            } else if (categoriesData.getId() == Constants.PRESSURE_ID_IMAGE || categoriesData.getId() == Constants.SMOKE_ID_IMAGE) {
                MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getId()), categoriesData.getTitle(), GalleryFragment.class.getName(), null);
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
