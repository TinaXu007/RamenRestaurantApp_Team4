package com.alpharamen.customer.view.adapter;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.OffersModel;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.List;

public class OffersAdapter extends  MyBaseAdapter {
    List<OffersModel>offersModels;
    OnAdapterSelectedListener listener;

    public OffersAdapter(List<OffersModel> offersModels, OnAdapterSelectedListener listener) {
        this.offersModels = offersModels;
        this.listener = listener;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return offersModels.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.fragment_offers_single_item;
    }

    @Override
    public OnAdapterSelectedListener getAdapterClickListener() {
        return listener;
    }

    @Override
    public int getItemCount() {
        return offersModels.size();
    }
}
