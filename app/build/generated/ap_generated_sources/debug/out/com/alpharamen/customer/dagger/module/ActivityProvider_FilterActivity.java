package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.filter.FilterActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_FilterActivity.FilterActivitySubcomponent.class)
public abstract class ActivityProvider_FilterActivity {
  private ActivityProvider_FilterActivity() {}

  @Binds
  @IntoMap
  @ClassKey(FilterActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FilterActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface FilterActivitySubcomponent extends AndroidInjector<FilterActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FilterActivity> {}
  }
}
