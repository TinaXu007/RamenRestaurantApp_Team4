// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.view.ui.filter;

import com.alpharamen.customer.base.BaseActivity_MembersInjector;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.utils.ToastUtils;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class FilterActivity_MembersInjector implements MembersInjector<FilterActivity> {
  private final Provider<ToastUtils> toastUtilsProvider;

  private final Provider<ViewModelProviderFactory> viewModelProviderFactoryProvider;

  public FilterActivity_MembersInjector(
      Provider<ToastUtils> toastUtilsProvider,
      Provider<ViewModelProviderFactory> viewModelProviderFactoryProvider) {
    this.toastUtilsProvider = toastUtilsProvider;
    this.viewModelProviderFactoryProvider = viewModelProviderFactoryProvider;
  }

  public static MembersInjector<FilterActivity> create(
      Provider<ToastUtils> toastUtilsProvider,
      Provider<ViewModelProviderFactory> viewModelProviderFactoryProvider) {
    return new FilterActivity_MembersInjector(toastUtilsProvider, viewModelProviderFactoryProvider);
  }

  @Override
  public void injectMembers(FilterActivity instance) {
    BaseActivity_MembersInjector.injectToastUtils(instance, toastUtilsProvider.get());
    injectViewModelProviderFactory(instance, viewModelProviderFactoryProvider.get());
  }

  public static void injectViewModelProviderFactory(
      FilterActivity instance, ViewModelProviderFactory viewModelProviderFactory) {
    instance.viewModelProviderFactory = viewModelProviderFactory;
  }
}