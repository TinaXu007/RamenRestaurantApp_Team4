// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alpharamen.customer.R;
import com.alpharamen.customer.viewmodel.MyOrdersViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMyOrdersBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageViewPrevArrow;

  @NonNull
  public final RecyclerView recyclerViewOrders;

  @NonNull
  public final TextView textViewMyOrders;

  @Bindable
  protected View.OnClickListener mListener;

  @Bindable
  protected MyOrdersViewModel mMyorders;

  protected ActivityMyOrdersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageViewPrevArrow, RecyclerView recyclerViewOrders, TextView textViewMyOrders) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageViewPrevArrow = imageViewPrevArrow;
    this.recyclerViewOrders = recyclerViewOrders;
    this.textViewMyOrders = textViewMyOrders;
  }

  public abstract void setListener(@Nullable View.OnClickListener listener);

  @Nullable
  public View.OnClickListener getListener() {
    return mListener;
  }

  public abstract void setMyorders(@Nullable MyOrdersViewModel myorders);

  @Nullable
  public MyOrdersViewModel getMyorders() {
    return mMyorders;
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_orders, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMyOrdersBinding>inflateInternal(inflater, R.layout.activity_my_orders, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_orders, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMyOrdersBinding>inflateInternal(inflater, R.layout.activity_my_orders, null, false, component);
  }

  public static ActivityMyOrdersBinding bind(@NonNull View view) {
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
  public static ActivityMyOrdersBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMyOrdersBinding)bind(component, view, R.layout.activity_my_orders);
  }
}
