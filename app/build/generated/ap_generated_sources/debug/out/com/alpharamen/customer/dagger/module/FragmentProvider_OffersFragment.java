package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.offers.OffersFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentProvider_OffersFragment.OffersFragmentSubcomponent.class)
public abstract class FragmentProvider_OffersFragment {
  private FragmentProvider_OffersFragment() {}

  @Binds
  @IntoMap
  @ClassKey(OffersFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OffersFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface OffersFragmentSubcomponent extends AndroidInjector<OffersFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<OffersFragment> {}
  }
}
