package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.myorders.MyOrdersActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_MyOrdersActivity.MyOrdersActivitySubcomponent.class)
public abstract class ActivityProvider_MyOrdersActivity {
  private ActivityProvider_MyOrdersActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MyOrdersActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MyOrdersActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface MyOrdersActivitySubcomponent extends AndroidInjector<MyOrdersActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MyOrdersActivity> {}
  }
}
