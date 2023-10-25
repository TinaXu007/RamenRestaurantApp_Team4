package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.hub_detail_page.DetailHubActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_DetailHubActivity.DetailHubActivitySubcomponent.class)
public abstract class ActivityProvider_DetailHubActivity {
  private ActivityProvider_DetailHubActivity() {}

  @Binds
  @IntoMap
  @ClassKey(DetailHubActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetailHubActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface DetailHubActivitySubcomponent extends AndroidInjector<DetailHubActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailHubActivity> {}
  }
}
