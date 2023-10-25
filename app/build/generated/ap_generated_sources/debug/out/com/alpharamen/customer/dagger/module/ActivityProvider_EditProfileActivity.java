package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.edit_profile.EditProfileActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityProvider_EditProfileActivity.EditProfileActivitySubcomponent.class)
public abstract class ActivityProvider_EditProfileActivity {
  private ActivityProvider_EditProfileActivity() {}

  @Binds
  @IntoMap
  @ClassKey(EditProfileActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditProfileActivitySubcomponent.Builder builder);

  @Subcomponent
  @PerActivity
  public interface EditProfileActivitySubcomponent extends AndroidInjector<EditProfileActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EditProfileActivity> {}
  }
}
