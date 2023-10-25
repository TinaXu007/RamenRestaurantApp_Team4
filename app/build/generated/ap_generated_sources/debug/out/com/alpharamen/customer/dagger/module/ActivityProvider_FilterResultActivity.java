package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.filter_result.FilterResultActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityProvider_FilterResultActivity.FilterResultActivitySubcomponent.class
)
public abstract class ActivityProvider_FilterResultActivity {
  private ActivityProvider_FilterResultActivity() {}

  @Binds
  @IntoMap
  @ClassKey(FilterResultActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FilterResultActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface FilterResultActivitySubcomponent extends AndroidInjector<FilterResultActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FilterResultActivity> {}
  }
}
