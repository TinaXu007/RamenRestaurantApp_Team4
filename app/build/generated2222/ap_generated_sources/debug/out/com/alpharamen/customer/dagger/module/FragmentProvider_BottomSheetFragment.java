package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.login.BottomFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentProvider_BottomSheetFragment.BottomFragmentSubcomponent.class)
public abstract class FragmentProvider_BottomSheetFragment {
  private FragmentProvider_BottomSheetFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BottomFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BottomFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface BottomFragmentSubcomponent extends AndroidInjector<BottomFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BottomFragment> {}
  }
}
