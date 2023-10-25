package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.notification.NotificationActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityProvider_BindNotificationActivity.NotificationActivitySubcomponent.class
)
public abstract class ActivityProvider_BindNotificationActivity {
  private ActivityProvider_BindNotificationActivity() {}

  @Binds
  @IntoMap
  @ClassKey(NotificationActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NotificationActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface NotificationActivitySubcomponent extends AndroidInjector<NotificationActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NotificationActivity> {}
  }
}
