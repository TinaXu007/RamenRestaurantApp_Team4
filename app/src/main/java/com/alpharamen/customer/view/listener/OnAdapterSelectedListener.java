package com.alpharamen.customer.view.listener;

public interface OnAdapterSelectedListener<T> {

    void onAdapterSelected(T model);

    void onAdapterString(String text);
}
