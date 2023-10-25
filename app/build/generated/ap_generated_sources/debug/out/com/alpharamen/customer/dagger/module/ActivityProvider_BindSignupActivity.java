package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.signup.SignupActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_BindSignupActivity.SignupActivitySubcomponent.class)
public abstract class ActivityProvider_BindSignupActivity {
  private ActivityProvider_BindSignupActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SignupActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignupActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface SignupActivitySubcomponent extends AndroidInjector<SignupActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignupActivity> {}
  }
}
