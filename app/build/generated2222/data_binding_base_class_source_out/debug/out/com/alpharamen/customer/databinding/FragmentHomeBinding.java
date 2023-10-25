// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alpharamen.customer.R;
import com.alpharamen.customer.data.models.SampleModel;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayoutFoodItemList;

  @NonNull
  public final FreeDeliveryLayoutBinding freeDeliveryLayout;

  @NonNull
  public final LinearLayout offersPlaceHolder;

  @NonNull
  public final LinearLayout placeHolderFreeDeliveryList;

  @NonNull
  public final LinearLayout popularListPlaceHolder;

  @NonNull
  public final RecyclerView recyclerViewOfferList;

  @NonNull
  public final RecyclerView recyclerViewPopular;

  @NonNull
  public final ShimmerFrameLayout shimmerLayout;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView16;

  @Bindable
  protected View.OnClickListener mListener;

  @Bindable
  protected SampleModel mSample;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayoutFoodItemList, FreeDeliveryLayoutBinding freeDeliveryLayout,
      LinearLayout offersPlaceHolder, LinearLayout placeHolderFreeDeliveryList,
      LinearLayout popularListPlaceHolder, RecyclerView recyclerViewOfferList,
      RecyclerView recyclerViewPopular, ShimmerFrameLayout shimmerLayout, TextView textView10,
      TextView textView16) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayoutFoodItemList = constraintLayoutFoodItemList;
    this.freeDeliveryLayout = freeDeliveryLayout;
    this.offersPlaceHolder = offersPlaceHolder;
    this.placeHolderFreeDeliveryList = placeHolderFreeDeliveryList;
    this.popularListPlaceHolder = popularListPlaceHolder;
    this.recyclerViewOfferList = recyclerViewOfferList;
    this.recyclerViewPopular = recyclerViewPopular;
    this.shimmerLayout = shimmerLayout;
    this.textView10 = textView10;
    this.textView16 = textView16;
  }

  public abstract void setListener(@Nullable View.OnClickListener listener);

  @Nullable
  public View.OnClickListener getListener() {
    return mListener;
  }

  public abstract void setSample(@Nullable SampleModel sample);

  @Nullable
  public SampleModel getSample() {
    return mSample;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}
