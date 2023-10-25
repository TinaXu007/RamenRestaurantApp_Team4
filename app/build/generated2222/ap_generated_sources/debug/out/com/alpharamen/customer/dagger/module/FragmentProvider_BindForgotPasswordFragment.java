package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.cart.CartFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentProvider_BindForgotPasswordFragment.CartFragmentSubcomponent.class)
public abstract class FragmentProvider_BindForgotPasswordFragment {
  private FragmentProvider_BindForgotPasswordFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CartFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CartFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface CartFragmentSubcomponent extends AndroidInjector<CartFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CartFragment> {}
  }
}
