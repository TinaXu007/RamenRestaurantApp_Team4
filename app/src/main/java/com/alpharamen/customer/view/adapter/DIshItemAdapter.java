package com.alpharamen.customer.view.adapter;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.DishItemModel;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.List;


public class DIshItemAdapter extends MyBaseAdapter {
    List<DishItemModel> dishItemModels;
    OnAdapterSelectedListener listener;

    public DIshItemAdapter(List<DishItemModel> dishItemModels, OnAdapterSelectedListener listener) {
        this.dishItemModels = dishItemModels;
        this.listener = listener;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return dishItemModels.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.recycler_view_dishes_single_item;
    }

    @Override
    public OnAdapterSelectedListener getAdapterClickListener() {
        return listener;
    }

    @Override
    public int getItemCount() {
        return dishItemModels.size();
    }
}
