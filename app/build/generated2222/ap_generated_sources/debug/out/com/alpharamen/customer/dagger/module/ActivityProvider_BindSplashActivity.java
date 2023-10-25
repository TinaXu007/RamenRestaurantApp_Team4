package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.splash.SplashActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_BindSplashActivity.SplashActivitySubcomponent.class)
public abstract class ActivityProvider_BindSplashActivity {
  private ActivityProvider_BindSplashActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SplashActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashActivity> {}
  }
}
