package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.offer_detail.OfferDetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_OfferDetailActivity.OfferDetailActivitySubcomponent.class)
public abstract class ActivityProvider_OfferDetailActivity {
  private ActivityProvider_OfferDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(OfferDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OfferDetailActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface OfferDetailActivitySubcomponent extends AndroidInjector<OfferDetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<OfferDetailActivity> {}
  }
}
