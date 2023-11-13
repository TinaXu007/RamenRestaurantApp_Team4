// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.dagger.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideContextFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideInstance(module);
  }

  public static Context provideInstance(ApplicationModule module) {
    return proxyProvideContext(module);
  }

  public static ApplicationModule_ProvideContextFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideContextFactory(module);
  }

  public static Context proxyProvideContext(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}