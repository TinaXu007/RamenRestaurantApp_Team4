// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.viewmodel;

import dagger.internal.Factory;

public final class OnboardViewModel_Factory implements Factory<OnboardViewModel> {
  private static final OnboardViewModel_Factory INSTANCE = new OnboardViewModel_Factory();

  @Override
  public OnboardViewModel get() {
    return provideInstance();
  }

  public static OnboardViewModel provideInstance() {
    return new OnboardViewModel();
  }

  public static OnboardViewModel_Factory create() {
    return INSTANCE;
  }

  public static OnboardViewModel newOnboardViewModel() {
    return new OnboardViewModel();
  }
}