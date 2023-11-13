package com.alpharamen.customer.view.adapter;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.RelatedFoodModel;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class RelatedFoodAdapter extends MyBaseAdapter {
    List<RelatedFoodModel> relatedFoodModelList = new ArrayList<>();
    OnAdapterSelectedListener listener;

    public RelatedFoodAdapter(List<RelatedFoodModel> relatedFoodModelList, OnAdapterSelectedListener listener) {
        this.relatedFoodModelList = relatedFoodModelList;
        this.listener = listener;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return relatedFoodModelList.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.recycler_view_related_foods_single_item;
    }

    @Override
    public OnAdapterSelectedListener getAdapterClickListener() {
        return listener;
    }

    @Override
    public int getItemCount() {
        return relatedFoodModelList.size();
    }
}
