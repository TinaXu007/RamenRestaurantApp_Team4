// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.viewmodel;

import dagger.internal.Factory;

public final class FoodItemListViewModel_Factory implements Factory<FoodItemListViewModel> {
  private static final FoodItemListViewModel_Factory INSTANCE = new FoodItemListViewModel_Factory();

  @Override
  public FoodItemListViewModel get() {
    return provideInstance();
  }

  public static FoodItemListViewModel provideInstance() {
    return new FoodItemListViewModel();
  }

  public static FoodItemListViewModel_Factory create() {
    return INSTANCE;
  }

  public static FoodItemListViewModel newFoodItemListViewModel() {
    return new FoodItemListViewModel();
  }
}