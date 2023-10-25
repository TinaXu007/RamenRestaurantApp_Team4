package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.search.SearchItemFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentProvider_SearchItemFragment.SearchItemFragmentSubcomponent.class)
public abstract class FragmentProvider_SearchItemFragment {
  private FragmentProvider_SearchItemFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SearchItemFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchItemFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface SearchItemFragmentSubcomponent extends AndroidInjector<SearchItemFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchItemFragment> {}
  }
}
