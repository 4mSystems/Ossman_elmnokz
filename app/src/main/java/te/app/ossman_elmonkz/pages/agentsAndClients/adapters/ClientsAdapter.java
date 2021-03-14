package te.app.ossman_elmonkz.pages.agentsAndClients.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.ossman_elmonkz.R;
import te.app.ossman_elmonkz.databinding.ItemClientsBinding;
import te.app.ossman_elmonkz.pages.agentsAndClients.models.clients.ClientData;
import te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemClientViewModel;


public class ClientsAdapter extends RecyclerView.Adapter<ClientsAdapter.ViewHolder> {
    List<ClientData> clientDataList;
    Context context;

    public ClientsAdapter() {
        this.clientDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_clients,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        ClientData product = clientDataList.get(position);
        ItemClientViewModel itemMenuViewModel = new ItemClientViewModel(product);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ClientData> dataList) {
        this.clientDataList.clear();
        clientDataList.addAll(dataList);
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
        return clientDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemClientsBinding itemMenuBinding;

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

        void setViewModel(ItemClientViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
