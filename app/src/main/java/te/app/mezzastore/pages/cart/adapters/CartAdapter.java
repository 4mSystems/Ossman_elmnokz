package te.app.mezzastore.pages.cart.adapters;

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
import te.app.mezzastore.databinding.ItemCartBinding;
import te.app.mezzastore.databinding.ItemProductsBinding;
import te.app.mezzastore.pages.cart.viewModels.ItemCartViewModel;
import te.app.mezzastore.pages.products.ProductDetailsFragment;
import te.app.mezzastore.pages.products.models.productDetails.Product;
import te.app.mezzastore.pages.products.viewModels.ItemProductsViewModel;
import te.app.mezzastore.utils.Constants;
import te.app.mezzastore.utils.helper.MovementHelper;


public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    List<Product> productList;
    Context context;
    private MutableLiveData<Integer> liveDataAdapter = new MutableLiveData<>();

    public CartAdapter() {
        this.productList = new ArrayList<>();
    }

    public MutableLiveData<Integer> getLiveDataAdapter() {
        return liveDataAdapter;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Product product = productList.get(position);
        ItemCartViewModel itemMenuViewModel = new ItemCartViewModel(product);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            if (o.equals(Constants.PLUS) || o.equals(Constants.MINUS) || o.equals(Constants.REMOVE_FROM_CART)) {
                notifyItemRangeChanged(position, productList.size());
            }
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Product> dataList) {
        this.productList.clear();
        productList.addAll(dataList);
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
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemCartBinding itemMenuBinding;

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

        void setViewModel(ItemCartViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
