package com.alpharamen.customer.view.adapter;

import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.NotificationItemModel;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;

import java.util.List;

public class NotificationItemAdapter extends MyBaseAdapter {
    List<NotificationItemModel> notificationItemModelList;
    OnAdapterSelectedListener listener;

    public NotificationItemAdapter(List<NotificationItemModel> notificationItemModelList, OnAdapterSelectedListener listener) {
        this.notificationItemModelList = notificationItemModelList;
        this.listener = listener;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return notificationItemModelList.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.recycler_view_notification_single_item;
    }

    @Override
    public OnAdapterSelectedListener getAdapterClickListener() {
        return listener;
    }

    @Override
    public int getItemCount() {
        return notificationItemModelList.size();
    }
}
