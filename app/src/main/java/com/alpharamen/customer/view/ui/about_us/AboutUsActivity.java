package com.alpharamen.customer.view.ui.about_us;

import androidx.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseActivity;
import com.alpharamen.customer.databinding.ActivityAboutUsBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.viewmodel.AboutUsViewModel;

import javax.inject.Inject;

public class AboutUsActivity extends BaseActivity<ActivityAboutUsBinding, AboutUsViewModel> implements View.OnClickListener {
    ActivityAboutUsBinding dataBinding;
    AboutUsViewModel aboutUsViewModel;
    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    @Override
    public int getBindingVariable() {
        return BR.aboutUs;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_about_us;
    }

    @Override
    public AboutUsViewModel getBindingObject() {
        return aboutUsViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        aboutUsViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(AboutUsViewModel.class);
        dataBinding = getViewDataBinding();
        dataBinding.setListener(this::onClick);

    }

    @Override
    public void onClick(View v) {
        if (v == dataBinding.imageViewPrevArrow) {
            onBackPressed();
        }

    }

    public static Intent newIntent(Context context) {
        return new Intent(context, AboutUsActivity.class);
    }
}
