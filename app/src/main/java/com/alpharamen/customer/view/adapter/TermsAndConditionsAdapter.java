package com.alpharamen.customer.view.adapter;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.TermsAndConditionsModel;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.List;

public class TermsAndConditionsAdapter extends MyBaseAdapter {
    List<TermsAndConditionsModel> termsAndConditionsModels;
    OnAdapterSelectedListener listener;

    public TermsAndConditionsAdapter(List<TermsAndConditionsModel> termsAndConditionsModels, OnAdapterSelectedListener listener) {
        this.termsAndConditionsModels = termsAndConditionsModels;
        this.listener = listener;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return termsAndConditionsModels.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.terms_and_conditions_single_item;
    }

    @Override
    public OnAdapterSelectedListener getAdapterClickListener() {
        return listener;
    }

    @Override
    public int getItemCount() {
        return termsAndConditionsModels.size();
    }
}
