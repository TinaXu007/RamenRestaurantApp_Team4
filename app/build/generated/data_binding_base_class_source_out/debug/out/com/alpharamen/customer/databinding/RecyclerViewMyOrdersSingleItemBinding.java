// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.MyordersItemModel;
import com.alpharamen.customer.view.customview.WacTextView;
import com.alpharamen.customer.view.listener.MyOrdersListItemClickListener;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecyclerViewMyOrdersSingleItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardViewMyOrders;

  @NonNull
  public final CircleImageView circleImageView;

  @NonNull
  public final ConstraintLayout constraintLayoutDetail;

  @NonNull
  public final ConstraintLayout constraintLayoutVisible;

  @NonNull
  public final ImageView imageViewDestinationLoc;

  @NonNull
  public final ImageView imageViewSourceLoc;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView textViewDestinationAddress;

  @NonNull
  public final WacTextView textViewHubName;

  @NonNull
  public final WacTextView textViewItemName;

  @NonNull
  public final WacTextView textViewRate;

  @NonNull
  public final WacTextView textViewReorder;

  @NonNull
  public final TextView textViewRestName;

  @NonNull
  public final TextView textViewSourceAddress;

  @NonNull
  public final WacTextView textViewStatus;

  @NonNull
  public final View viewBottom;

  @NonNull
  public final View viewDottedLine;

  @NonNull
  public final View viewVisible;

  @Bindable
  protected Boolean mIsLast;

  @Bindable
  protected MyOrdersListItemClickListener mListener;

  @Bindable
  protected MyordersItemModel mItem;

  protected RecyclerViewMyOrdersSingleItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CardView cardViewMyOrders, CircleImageView circleImageView,
      ConstraintLayout constraintLayoutDetail, ConstraintLayout constraintLayoutVisible,
      ImageView imageViewDestinationLoc, ImageView imageViewSourceLoc, RatingBar ratingBar,
      TextView textViewDestinationAddress, WacTextView textViewHubName,
      WacTextView textViewItemName, WacTextView textViewRate, WacTextView textViewReorder,
      TextView textViewRestName, TextView textViewSourceAddress, WacTextView textViewStatus,
      View viewBottom, View viewDottedLine, View viewVisible) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewMyOrders = cardViewMyOrders;
    this.circleImageView = circleImageView;
    this.constraintLayoutDetail = constraintLayoutDetail;
    this.constraintLayoutVisible = constraintLayoutVisible;
    this.imageViewDestinationLoc = imageViewDestinationLoc;
    this.imageViewSourceLoc = imageViewSourceLoc;
    this.ratingBar = ratingBar;
    this.textViewDestinationAddress = textViewDestinationAddress;
    this.textViewHubName = textViewHubName;
    this.textViewItemName = textViewItemName;
    this.textViewRate = textViewRate;
    this.textViewReorder = textViewReorder;
    this.textViewRestName = textViewRestName;
    this.textViewSourceAddress = textViewSourceAddress;
    this.textViewStatus = textViewStatus;
    this.viewBottom = viewBottom;
    this.viewDottedLine = viewDottedLine;
    this.viewVisible = viewVisible;
  }

  public abstract void setIsLast(@Nullable Boolean isLast);

  @Nullable
  public Boolean getIsLast() {
    return mIsLast;
  }

  public abstract void setListener(@Nullable MyOrdersListItemClickListener listener);

  @Nullable
  public MyOrdersListItemClickListener getListener() {
    return mListener;
  }

  public abstract void setItem(@Nullable MyordersItemModel item);

  @Nullable
  public MyordersItemModel getItem() {
    return mItem;
  }

  @NonNull
  public static RecyclerViewMyOrdersSingleItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recycler_view_my_orders_single_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerViewMyOrdersSingleItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecyclerViewMyOrdersSingleItemBinding>inflateInternal(inflater, R.layout.recycler_view_my_orders_single_item, root, attachToRoot, component);
  }

  @NonNull
  public static RecyclerViewMyOrdersSingleItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recycler_view_my_orders_single_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecyclerViewMyOrdersSingleItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecyclerViewMyOrdersSingleItemBinding>inflateInternal(inflater, R.layout.recycler_view_my_orders_single_item, null, false, component);
  }

  public static RecyclerViewMyOrdersSingleItemBinding bind(@NonNull View view) {
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
  public static RecyclerViewMyOrdersSingleItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (RecyclerViewMyOrdersSingleItemBinding)bind(component, view, R.layout.recycler_view_my_orders_single_item);
  }
}