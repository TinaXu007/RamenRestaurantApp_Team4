package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.home_page.HomeActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_BindHomeActivity.HomeActivitySubcomponent.class)
public abstract class ActivityProvider_BindHomeActivity {
  private ActivityProvider_BindHomeActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HomeActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {}
  }
}
