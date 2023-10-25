package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.address_list.AddressListActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_AddressListActivity.AddressListActivitySubcomponent.class)
public abstract class ActivityProvider_AddressListActivity {
  private ActivityProvider_AddressListActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AddressListActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddressListActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface AddressListActivitySubcomponent extends AndroidInjector<AddressListActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AddressListActivity> {}
  }
}
