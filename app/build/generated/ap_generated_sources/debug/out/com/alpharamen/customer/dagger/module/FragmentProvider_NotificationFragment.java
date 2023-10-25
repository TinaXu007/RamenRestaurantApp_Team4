package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.notification.NotificationFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentProvider_NotificationFragment.NotificationFragmentSubcomponent.class
)
public abstract class FragmentProvider_NotificationFragment {
  private FragmentProvider_NotificationFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NotificationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NotificationFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface NotificationFragmentSubcomponent extends AndroidInjector<NotificationFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NotificationFragment> {}
  }
}
