// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.viewmodel;

import dagger.internal.Factory;

public final class OffersViewModel_Factory implements Factory<OffersViewModel> {
  private static final OffersViewModel_Factory INSTANCE = new OffersViewModel_Factory();

  @Override
  public OffersViewModel get() {
    return provideInstance();
  }

  public static OffersViewModel provideInstance() {
    return new OffersViewModel();
  }

  public static OffersViewModel_Factory create() {
    return INSTANCE;
  }

  public static OffersViewModel newOffersViewModel() {
    return new OffersViewModel();
  }
}
