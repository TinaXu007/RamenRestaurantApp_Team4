package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.nearme.FoodItemListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentProvider_FoodItemListFragment.FoodItemListFragmentSubcomponent.class
)
public abstract class FragmentProvider_FoodItemListFragment {
  private FragmentProvider_FoodItemListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FoodItemListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FoodItemListFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface FoodItemListFragmentSubcomponent extends AndroidInjector<FoodItemListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FoodItemListFragment> {}
  }
}
