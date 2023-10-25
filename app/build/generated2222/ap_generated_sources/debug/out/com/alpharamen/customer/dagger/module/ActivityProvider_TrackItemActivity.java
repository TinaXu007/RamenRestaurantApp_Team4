package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.track_item.TrackItemActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_TrackItemActivity.TrackItemActivitySubcomponent.class)
public abstract class ActivityProvider_TrackItemActivity {
  private ActivityProvider_TrackItemActivity() {}

  @Binds
  @IntoMap
  @ClassKey(TrackItemActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TrackItemActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface TrackItemActivitySubcomponent extends AndroidInjector<TrackItemActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrackItemActivity> {}
  }
}
