package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.change_location.ChangeLocationActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityProvider_ChangeLocationActivity.ChangeLocationActivitySubcomponent.class
)
public abstract class ActivityProvider_ChangeLocationActivity {
  private ActivityProvider_ChangeLocationActivity() {}

  @Binds
  @IntoMap
  @ClassKey(ChangeLocationActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChangeLocationActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface ChangeLocationActivitySubcomponent
      extends AndroidInjector<ChangeLocationActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChangeLocationActivity> {}
  }
}
