package com.alpharamen.customer.view.adapter;


import androidx.databinding.DataBindingUtil;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.HubsListModel;
import com.alpharamen.customer.databinding.RecyclerViewHubNewBinding;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.List;

public class HublistAdapterNew extends RecyclerView.Adapter<HublistAdapterNew.ViewHolder> {

    List<HubsListModel> hubsListModels;
    OnAdapterSelectedListener listener;

    public HublistAdapterNew(List<HubsListModel> hubsListModels, OnAdapterSelectedListener listener) {
        this.hubsListModels = hubsListModels;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HublistAdapterNew.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecyclerViewHubNewBinding dataBinding = DataBindingUtil
                .inflate(layoutInflater, R.layout.recycler_view_hub_new, parent, false);

        return new ViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull HublistAdapterNew.ViewHolder holder, int position) {

        double length = hubsListModels.size() - 1;

        if (position == 0|| position == length) {

            hubsListModels.get(position).setHide(true);
        }
        else {
            hubsListModels.get(position).setHide(false);
        }

        holder.binding.setItem(hubsListModels.get(position));
        holder.binding.setListener(listener);
    }

    @Override
    public int getItemCount() {

        return hubsListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerViewHubNewBinding binding;

        public ViewHolder(RecyclerViewHubNewBinding dataBinding) {

            super(dataBinding.getRoot());
            binding = dataBinding;
        }
    }
}
