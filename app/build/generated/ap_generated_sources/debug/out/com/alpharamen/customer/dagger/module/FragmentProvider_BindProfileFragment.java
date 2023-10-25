package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.profile.ProfileFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentProvider_BindProfileFragment.ProfileFragmentSubcomponent.class)
public abstract class FragmentProvider_BindProfileFragment {
  private FragmentProvider_BindProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileFragment> {}
  }
}
