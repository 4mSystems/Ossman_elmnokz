package apps.app.altcompany.pages.offers.adapters;

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
import apps.app.altcompany.databinding.ItemOfferBinding;
import apps.app.altcompany.pages.offers.models.OffersData;
import apps.app.altcompany.pages.offers.viewModels.ItemOfferViewModel;
import apps.app.altcompany.utils.helper.MovementHelper;

public class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.ViewHolder> {
    public List<OffersData> offersDataList;
    Context context;
    private MutableLiveData<Integer> offerIdLiveData = new MutableLiveData<>();
    public int lastPosition;

    public OffersAdapter() {
        this.offersDataList = new ArrayList<>();
    }

    public MutableLiveData<Integer> getOfferIdLiveData() {
        return offerIdLiveData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offer,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        OffersData offersData = offersDataList.get(position);
        ItemOfferViewModel itemMenuViewModel = new ItemOfferViewModel(offersData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastPosition= position;
            offerIdLiveData.setValue(offersData.getOffersId());
        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<OffersData> dataList) {
        this.offersDataList.clear();
        offersDataList.addAll(dataList);
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
        return offersDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemOfferBinding binding;

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

        void setViewModel(ItemOfferViewModel itemViewModels) {
            if (binding != null) {
                binding.setItemHomeViewModel(itemViewModels);
            }
        }
    }
}
