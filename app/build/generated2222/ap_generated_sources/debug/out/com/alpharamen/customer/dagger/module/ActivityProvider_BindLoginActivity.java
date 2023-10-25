package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.login.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_BindLoginActivity.LoginActivitySubcomponent.class)
public abstract class ActivityProvider_BindLoginActivity {
  private ActivityProvider_BindLoginActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity> {}
  }
}
