package apps.app.altcompany.pages.myWorks.adapters;

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

import apps.app.altcompany.R;
import apps.app.altcompany.databinding.ItemMyWorksBinding;
import apps.app.altcompany.pages.companies.CompanyWork;
import apps.app.altcompany.pages.myWorks.viewModels.ItemMyWorksViewModel;
import apps.app.altcompany.utils.helper.MovementHelper;

public class MyWorksAdapter extends RecyclerView.Adapter<MyWorksAdapter.ViewHolder> {
    public List<CompanyWork> companyWorks;
    Context context;
     MutableLiveData<Integer> offerIdLiveData = new MutableLiveData<>();
    public int lastPosition;

    public MyWorksAdapter() {
        this.companyWorks = new ArrayList<>();
    }

    public MutableLiveData<Integer> getOfferIdLiveData() {
        return offerIdLiveData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_works,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        CompanyWork offersData = companyWorks.get(position);
        ItemMyWorksViewModel itemMenuViewModel = new ItemMyWorksViewModel(offersData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastPosition= position;
            offerIdLiveData.setValue(offersData.getId());
        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<CompanyWork> dataList) {
        this.companyWorks.clear();
        companyWorks.addAll(dataList);
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
        return companyWorks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemMyWorksBinding binding;

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

        void setViewModel(ItemMyWorksViewModel itemViewModels) {
            if (binding != null) {
                binding.setItemHomeViewModel(itemViewModels);
            }
        }
    }
}
