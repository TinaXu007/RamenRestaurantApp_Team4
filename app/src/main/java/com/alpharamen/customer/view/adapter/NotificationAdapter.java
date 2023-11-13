package com.alpharamen.customer.view.adapter;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.NotificationModel;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.ArrayList;

public class NotificationAdapter extends MyBaseAdapter {

    private ArrayList<NotificationModel> data;
    private OnAdapterSelectedListener listener;

    public NotificationAdapter(ArrayList<NotificationModel> data, OnAdapterSelectedListener listener) {
        this.data = data;
        this.listener = listener;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.notification_row_item;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public OnAdapterSelectedListener getAdapterClickListener() {
        return listener;
    }
}
