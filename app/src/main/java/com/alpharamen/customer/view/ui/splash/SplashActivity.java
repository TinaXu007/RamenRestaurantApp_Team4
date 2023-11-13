package com.alpharamen.customer.view.ui.splash;

import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.os.Handler;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseActivity;
import com.alpharamen.customer.databinding.ActivitySplashBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.ui.onboarding.OnboardActivity;
import com.alpharamen.customer.viewmodel.SplashViewModel;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> {

    ActivitySplashBinding splashBinding;
    SplashViewModel splashViewModel;

    @Inject
    ViewModelProviderFactory mViewModelFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashViewModel = ViewModelProviders.of(this, mViewModelFactory).get(SplashViewModel.class);
        splashBinding = (ActivitySplashBinding) getViewDataBinding();
        splashViewModel.getConfig().observe( this,
                splashBean -> {

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(OnboardActivity.newIntent(getApplicationContext()));
                            finish();
                            overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
                        }
                    },2000);

                });
    }

    @Override
    public int getBindingVariable() {
        return BR.splash;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashViewModel getBindingObject() {
        return splashViewModel;
    }
}
