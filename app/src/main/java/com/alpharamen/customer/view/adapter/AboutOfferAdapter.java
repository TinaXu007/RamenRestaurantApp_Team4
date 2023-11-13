package com.alpharamen.customer.view.adapter;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.AboutOfferModel;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.List;

public class AboutOfferAdapter extends MyBaseAdapter {
    List<AboutOfferModel> aboutOfferModels;
    OnAdapterSelectedListener listener;

    public AboutOfferAdapter(List<AboutOfferModel> aboutOfferModels, OnAdapterSelectedListener listener) {
        this.aboutOfferModels = aboutOfferModels;
        this.listener = listener;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return aboutOfferModels.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.about_offer_single_item;
    }

    @Override
    public OnAdapterSelectedListener getAdapterClickListener() {
        return listener;
    }

    @Override
    public int getItemCount() {
        return aboutOfferModels.size();
    }
}
