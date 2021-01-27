package apps.app.altcompany.pages.myOrders.adapters;

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

import apps.app.altcompany.PassingObject;
import apps.app.altcompany.R;
import apps.app.altcompany.databinding.ItemOrderBinding;
import apps.app.altcompany.pages.home.OrderDetailsFragment;
import apps.app.altcompany.pages.home.models.OrdersData;
import apps.app.altcompany.pages.home.viewModels.ItemHomeViewModel;
import apps.app.altcompany.utils.helper.MovementHelper;
import apps.app.altcompany.utils.resources.ResourceManager;

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrdersAdapter.ViewHolder> {
    public List<OrdersData> ordersDataList;
    private Context context;
    public int orderType = -1;

    public MyOrdersAdapter() {
        this.ordersDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        OrdersData ordersData = ordersDataList.get(position);
        ItemHomeViewModel itemMenuViewModel = new ItemHomeViewModel(ordersData);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            MovementHelper.startActivityWithBundle(context, new PassingObject(ordersData.getOrdersId(), String.valueOf(orderType)), ResourceManager.getString(R.string.order_details), OrderDetailsFragment.class.getName(), null);
        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<OrdersData> dataList) {
        this.ordersDataList.clear();
        ordersDataList.addAll(dataList);
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
        return ordersDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemOrderBinding binding;

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

        void setViewModel(ItemHomeViewModel itemViewModels) {
            if (binding != null) {
                binding.setItemHomeViewModel(itemViewModels);
            }
        }
    }
}
