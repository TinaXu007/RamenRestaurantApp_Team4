package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.about_us.AboutUsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_AboutUsActivity.AboutUsActivitySubcomponent.class)
public abstract class ActivityProvider_AboutUsActivity {
  private ActivityProvider_AboutUsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AboutUsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AboutUsActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface AboutUsActivitySubcomponent extends AndroidInjector<AboutUsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AboutUsActivity> {}
  }
}
