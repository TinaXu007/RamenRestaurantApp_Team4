package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.onboarding.OnboardActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_OnboardActivity.OnboardActivitySubcomponent.class)
public abstract class ActivityProvider_OnboardActivity {
  private ActivityProvider_OnboardActivity() {}

  @Binds
  @IntoMap
  @ClassKey(OnboardActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OnboardActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface OnboardActivitySubcomponent extends AndroidInjector<OnboardActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<OnboardActivity> {}
  }
}
