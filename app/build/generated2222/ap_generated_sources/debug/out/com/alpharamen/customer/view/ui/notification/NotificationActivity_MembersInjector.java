// Generated by Dagger (https://google.github.io/dagger).
package com.alpharamen.customer.view.ui.notification;

import com.alpharamen.customer.base.BaseActivity_MembersInjector;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.utils.ToastUtils;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class NotificationActivity_MembersInjector
    implements MembersInjector<NotificationActivity> {
  private final Provider<ToastUtils> toastUtilsProvider;

  private final Provider<ViewModelProviderFactory> mViewModelFactoryProvider;

  public NotificationActivity_MembersInjector(
      Provider<ToastUtils> toastUtilsProvider,
      Provider<ViewModelProviderFactory> mViewModelFactoryProvider) {
    this.toastUtilsProvider = toastUtilsProvider;
    this.mViewModelFactoryProvider = mViewModelFactoryProvider;
  }

  public static MembersInjector<NotificationActivity> create(
      Provider<ToastUtils> toastUtilsProvider,
      Provider<ViewModelProviderFactory> mViewModelFactoryProvider) {
    return new NotificationActivity_MembersInjector(toastUtilsProvider, mViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(NotificationActivity instance) {
    BaseActivity_MembersInjector.injectToastUtils(instance, toastUtilsProvider.get());
    injectMViewModelFactory(instance, mViewModelFactoryProvider.get());
  }

  public static void injectMViewModelFactory(
      NotificationActivity instance, ViewModelProviderFactory mViewModelFactory) {
    instance.mViewModelFactory = mViewModelFactory;
  }
}