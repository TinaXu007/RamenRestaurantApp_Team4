package com.alpharamen.customer.view.adapter;

import androidx.databinding.DataBindingUtil;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.AddressListModel;
import com.alpharamen.customer.databinding.RecyclerViewAddressListSingleItemBinding;
import com.alpharamen.customer.view.listener.AddressSelectListener;

import java.util.List;

public class AddressListAdapter extends RecyclerView.Adapter<AddressListAdapter.ViewHolder> {

    List<AddressListModel> addressListModels;
    AddressSelectListener listener;

    public AddressListAdapter(List<AddressListModel> addressListModels, AddressSelectListener listener) {
        this.addressListModels = addressListModels;
        this.listener = listener;
    }


    @NonNull
    @Override
    public AddressListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecyclerViewAddressListSingleItemBinding dataBinding = DataBindingUtil
                .inflate(layoutInflater, R.layout.recycler_view_address_list_single_item, parent, false);

        return new ViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AddressListAdapter.ViewHolder holder, int position) {
        holder.binding.setItem(addressListModels.get(position));
        holder.binding.setListener(listener);
        holder.binding.imageViewEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.binding.imageViewEdit.setClickable(false);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holder.binding.imageViewEdit.setClickable(true);
                    }
                }, 3000);

            }
        });


    }

    @Override
    public int getItemCount() {
        return addressListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerViewAddressListSingleItemBinding binding;

        public ViewHolder(RecyclerViewAddressListSingleItemBinding dataBinding) {
            super(dataBinding.getRoot());
            binding = dataBinding;
        }
    }
}
