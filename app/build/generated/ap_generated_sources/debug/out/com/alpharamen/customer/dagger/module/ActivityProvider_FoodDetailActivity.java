package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.food_item_detail_page.FoodDetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_FoodDetailActivity.FoodDetailActivitySubcomponent.class)
public abstract class ActivityProvider_FoodDetailActivity {
  private ActivityProvider_FoodDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(FoodDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FoodDetailActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface FoodDetailActivitySubcomponent extends AndroidInjector<FoodDetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FoodDetailActivity> {}
  }
}
