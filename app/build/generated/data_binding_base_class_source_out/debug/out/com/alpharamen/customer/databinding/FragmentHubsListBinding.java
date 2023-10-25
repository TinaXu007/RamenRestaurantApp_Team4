// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alpharamen.customer.R;
import com.alpharamen.customer.viewmodel.HubListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHubsListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerViewHubsList;

  @Bindable
  protected HubListViewModel mHubs;

  protected FragmentHubsListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerViewHubsList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerViewHubsList = recyclerViewHubsList;
  }

  public abstract void setHubs(@Nullable HubListViewModel hubs);

  @Nullable
  public HubListViewModel getHubs() {
    return mHubs;
  }

  @NonNull
  public static FragmentHubsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_hubs_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHubsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHubsListBinding>inflateInternal(inflater, R.layout.fragment_hubs_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHubsListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_hubs_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHubsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHubsListBinding>inflateInternal(inflater, R.layout.fragment_hubs_list, null, false, component);
  }

  public static FragmentHubsListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentHubsListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHubsListBinding)bind(component, view, R.layout.fragment_hubs_list);
  }
}
