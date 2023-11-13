package com.alpharamen.customer.utils;

import android.content.Context;
import android.widget.Toast;

import com.alpharamen.customer.dagger.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ToastUtils {

    Context context;

    @Inject
    public ToastUtils(@ApplicationContext Context context) {
        this.context = context;
    }

    public void showToast(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
