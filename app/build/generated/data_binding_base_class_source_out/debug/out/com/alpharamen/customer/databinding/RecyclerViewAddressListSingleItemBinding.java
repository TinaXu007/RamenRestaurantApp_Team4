// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.AddressListModel;
import com.alpharamen.customer.view.customview.WacTextView;
import com.alpharamen.customer.view.listener.AddressSelectListener;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecyclerViewAddressListSingleItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardViewAddress;

  @NonNull
  public final ImageView imageViewEdit;

  @NonNull
  public final WacTextView textViewAddress;

  @NonNull
  public final WacTextView textViewPersonName;

  @NonNull
  public final WacTextView textViewPhoneNumber;

  @NonNull
  public final WacTextView textViewSelect;

  @Bindable
  protected AddressSelectListener mListener;

  @Bindable
  protected AddressListModel mItem;

  protected RecyclerViewAddressListSingleItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CardView cardViewAddress, ImageView imageViewEdit,
      WacTextView textViewAddress, WacTextView textViewPersonName, WacTextView textViewPhoneNumber,
      WacTextView textViewSelect) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewAddress = cardViewAddress;
    this.imageViewEdit = imageViewEdit;
    this.textViewAddress = textViewAddress;
    this.textViewPersonName = textViewPersonName;
    this.textViewPhoneNumber = textViewPhoneNumber;
    this.textViewSelect = textViewSelect;
  }

  public abstract void setListener(@Nullable AddressSelectListener listener);

  @Nullable
  public AddressSelectListener getListener() {
    return mListener;
  }

  public abstract void setItem(@Nullable AddressListModel item);

  @Nullable
  public AddressListModel getItem() {
    return mItem;
  }

  @NonNull
  public static RecyclerViewAddressListSingleItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recycler_view_address_list_single_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerViewAddressListSingleItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecyclerViewAddressListSingleItemBinding>inflateInternal(inflater, R.layout.recycler_view_address_list_single_item, root, attachToRoot, component);
  }

  @NonNull
  public static RecyclerViewAddressListSingleItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recycler_view_address_list_single_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerViewAddressListSingleItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecyclerViewAddressListSingleItemBinding>inflateInternal(inflater, R.layout.recycler_view_address_list_single_item, null, false, component);
  }

  public static RecyclerViewAddressListSingleItemBinding bind(@NonNull View view) {
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
  public static RecyclerViewAddressListSingleItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (RecyclerViewAddressListSingleItemBinding)bind(component, view, R.layout.recycler_view_address_list_single_item);
  }
}
