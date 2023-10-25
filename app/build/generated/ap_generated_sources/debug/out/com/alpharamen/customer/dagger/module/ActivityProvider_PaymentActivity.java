package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.order_placed.OrderPlacedActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_PaymentActivity.OrderPlacedActivitySubcomponent.class)
public abstract class ActivityProvider_PaymentActivity {
  private ActivityProvider_PaymentActivity() {}

  @Binds
  @IntoMap
  @ClassKey(OrderPlacedActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OrderPlacedActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface OrderPlacedActivitySubcomponent extends AndroidInjector<OrderPlacedActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<OrderPlacedActivity> {}
  }
}
