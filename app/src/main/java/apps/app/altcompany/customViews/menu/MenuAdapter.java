package apps.app.altcompany.customViews.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import apps.app.altcompany.R;
import apps.app.altcompany.databinding.ItemMenuBinding;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuView> {
    private List<MenuModel> menuModels;
    public String selectId = "";
    private MutableLiveData<Integer> liveDataAdapter = new MutableLiveData<>();
    private Context context;

    public MenuAdapter() {
        this.menuModels = new ArrayList<>();
    }

    public MutableLiveData<Integer> getLiveDataAdapter() {
        return liveDataAdapter;
    }

    public List<MenuModel> getMenuModels() {
        return menuModels;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        MenuModel menuModel = menuModels.get(position);
        ItemMenuViewModel itemMenuViewModel = new ItemMenuViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> liveDataAdapter.setValue(menuModel.id));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<MenuModel> dataList) {
        this.menuModels.clear();
        menuModels.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(@NotNull MenuView holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull MenuView holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return menuModels.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemMenuBinding itemMenuBinding;

        MenuView(View itemView) {
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

        void setViewModel(ItemMenuViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemMenuViewModel(itemViewModels);
            }
        }
    }
}
