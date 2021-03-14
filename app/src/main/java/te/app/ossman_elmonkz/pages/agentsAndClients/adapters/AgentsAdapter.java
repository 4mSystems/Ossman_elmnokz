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
import te.app.ossman_elmonkz.databinding.ItemAgentsBinding;
import te.app.ossman_elmonkz.databinding.ItemGalleryBinding;
import te.app.ossman_elmonkz.pages.agentsAndClients.models.AgentData;
import te.app.ossman_elmonkz.pages.agentsAndClients.viewModels.ItemAgentViewModel;
import te.app.ossman_elmonkz.pages.gallery.models.GalleryData;
import te.app.ossman_elmonkz.pages.gallery.viewModels.ItemGalleryViewModel;


public class AgentsAdapter extends RecyclerView.Adapter<AgentsAdapter.ViewHolder> {
    List<AgentData> agentDataList;
    Context context;

    public AgentsAdapter() {
        this.agentDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_agents,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        AgentData product = agentDataList.get(position);
        ItemAgentViewModel itemMenuViewModel = new ItemAgentViewModel(product);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<AgentData> dataList) {
        this.agentDataList.clear();
        agentDataList.addAll(dataList);
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
        return agentDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemAgentsBinding itemMenuBinding;

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

        void setViewModel(ItemAgentViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
