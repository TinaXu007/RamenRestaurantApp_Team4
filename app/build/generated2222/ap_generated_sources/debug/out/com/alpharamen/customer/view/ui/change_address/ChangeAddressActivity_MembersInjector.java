// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.view.ui.change_address;

import com.alpharamen.customer.base.BaseActivity_MembersInjector;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.utils.ToastUtils;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ChangeAddressActivity_MembersInjector
    implements MembersInjector<ChangeAddressActivity> {
  private final Provider<ToastUtils> toastUtilsProvider;

  private final Provider<ViewModelProviderFactory> viewModelProviderFactoryProvider;

  public ChangeAddressActivity_MembersInjector(
      Provider<ToastUtils> toastUtilsProvider,
      Provider<ViewModelProviderFactory> viewModelProviderFactoryProvider) {
    this.toastUtilsProvider = toastUtilsProvider;
    this.viewModelProviderFactoryProvider = viewModelProviderFactoryProvider;
  }

  public static MembersInjector<ChangeAddressActivity> create(
      Provider<ToastUtils> toastUtilsProvider,
      Provider<ViewModelProviderFactory> viewModelProviderFactoryProvider) {
    return new ChangeAddressActivity_MembersInjector(
        toastUtilsProvider, viewModelProviderFactoryProvider);
  }

  @Override
  public void injectMembers(ChangeAddressActivity instance) {
    BaseActivity_MembersInjector.injectToastUtils(instance, toastUtilsProvider.get());
    injectViewModelProviderFactory(instance, viewModelProviderFactoryProvider.get());
  }

  public static void injectViewModelProviderFactory(
      ChangeAddressActivity instance, ViewModelProviderFactory viewModelProviderFactory) {
    instance.viewModelProviderFactory = viewModelProviderFactory;
  }
}