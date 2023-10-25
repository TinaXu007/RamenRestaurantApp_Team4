package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.nearme.HubsListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentProvider_HubsListFragment.HubsListFragmentSubcomponent.class)
public abstract class FragmentProvider_HubsListFragment {
  private FragmentProvider_HubsListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HubsListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HubsListFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface HubsListFragmentSubcomponent extends AndroidInjector<HubsListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HubsListFragment> {}
  }
}
