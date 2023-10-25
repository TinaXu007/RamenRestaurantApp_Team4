package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.change_address.ChangeAddressActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityProvider_ChangeAddressActivity.ChangeAddressActivitySubcomponent.class
)
public abstract class ActivityProvider_ChangeAddressActivity {
  private ActivityProvider_ChangeAddressActivity() {}

  @Binds
  @IntoMap
  @ClassKey(ChangeAddressActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChangeAddressActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface ChangeAddressActivitySubcomponent
      extends AndroidInjector<ChangeAddressActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChangeAddressActivity> {}
  }
}
