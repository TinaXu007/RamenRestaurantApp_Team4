// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alpharamen.customer.R;
import com.alpharamen.customer.view.customview.WacTextView;
import com.alpharamen.customer.viewmodel.FoodDetailViewModel;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityFoodDetailBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayoutFoodDetail;

  @NonNull
  public final RoundedImageView imageDetail;

  @NonNull
  public final ImageView imageViewCartDetail;

  @NonNull
  public final ImageView imageViewPrevArrow;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final RecyclerView recyclerViewRelatedFoods;

  @NonNull
  public final FrameLayout rlImageDetail;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final ShimmerFrameLayout shimmerLayout;

  @NonNull
  public final TextView textAdd;

  @NonNull
  public final TextView textQuantity;

  @NonNull
  public final TextView textSubtract;

  @NonNull
  public final TextView textViewAboutDetails;

  @NonNull
  public final TextView textViewAboutItem;

  @NonNull
  public final TextView textViewActualPrice;

  @NonNull
  public final TextView textViewAddToCart;

  @NonNull
  public final TextView textViewDiscountPrice;

  @NonNull
  public final TextView textViewFoodName;

  @NonNull
  public final TextView textViewHotelName;

  @NonNull
  public final TextView textViewNoOfItemsCart;

  @NonNull
  public final TextView textViewOfferPercent;

  @NonNull
  public final WacTextView textViewOrderNow;

  @NonNull
  public final TextView textViewPercentSymbol;

  @NonNull
  public final TextView textViewQuantity;

  @NonNull
  public final TextView textViewRelatedFood;

  @NonNull
  public final TextView textViewRupees;

  @NonNull
  public final View view10;

  @NonNull
  public final RelativeLayout view9;

  @Bindable
  protected FoodDetailViewModel mFoodDetail;

  @Bindable
  protected View.OnClickListener mListener;

  protected ActivityFoodDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayoutFoodDetail, RoundedImageView imageDetail,
      ImageView imageViewCartDetail, ImageView imageViewPrevArrow, RatingBar ratingBar,
      RecyclerView recyclerViewRelatedFoods, FrameLayout rlImageDetail, NestedScrollView scrollView,
      ShimmerFrameLayout shimmerLayout, TextView textAdd, TextView textQuantity,
      TextView textSubtract, TextView textViewAboutDetails, TextView textViewAboutItem,
      TextView textViewActualPrice, TextView textViewAddToCart, TextView textViewDiscountPrice,
      TextView textViewFoodName, TextView textViewHotelName, TextView textViewNoOfItemsCart,
      TextView textViewOfferPercent, WacTextView textViewOrderNow, TextView textViewPercentSymbol,
      TextView textViewQuantity, TextView textViewRelatedFood, TextView textViewRupees, View view10,
      RelativeLayout view9) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayoutFoodDetail = constraintLayoutFoodDetail;
    this.imageDetail = imageDetail;
    this.imageViewCartDetail = imageViewCartDetail;
    this.imageViewPrevArrow = imageViewPrevArrow;
    this.ratingBar = ratingBar;
    this.recyclerViewRelatedFoods = recyclerViewRelatedFoods;
    this.rlImageDetail = rlImageDetail;
    this.scrollView = scrollView;
    this.shimmerLayout = shimmerLayout;
    this.textAdd = textAdd;
    this.textQuantity = textQuantity;
    this.textSubtract = textSubtract;
    this.textViewAboutDetails = textViewAboutDetails;
    this.textViewAboutItem = textViewAboutItem;
    this.textViewActualPrice = textViewActualPrice;
    this.textViewAddToCart = textViewAddToCart;
    this.textViewDiscountPrice = textViewDiscountPrice;
    this.textViewFoodName = textViewFoodName;
    this.textViewHotelName = textViewHotelName;
    this.textViewNoOfItemsCart = textViewNoOfItemsCart;
    this.textViewOfferPercent = textViewOfferPercent;
    this.textViewOrderNow = textViewOrderNow;
    this.textViewPercentSymbol = textViewPercentSymbol;
    this.textViewQuantity = textViewQuantity;
    this.textViewRelatedFood = textViewRelatedFood;
    this.textViewRupees = textViewRupees;
    this.view10 = view10;
    this.view9 = view9;
  }

  public abstract void setFoodDetail(@Nullable FoodDetailViewModel foodDetail);

  @Nullable
  public FoodDetailViewModel getFoodDetail() {
    return mFoodDetail;
  }

  public abstract void setListener(@Nullable View.OnClickListener listener);

  @Nullable
  public View.OnClickListener getListener() {
    return mListener;
  }

  @NonNull
  public static ActivityFoodDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_food_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFoodDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFoodDetailBinding>inflateInternal(inflater, R.layout.activity_food_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFoodDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_food_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFoodDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFoodDetailBinding>inflateInternal(inflater, R.layout.activity_food_detail, null, false, component);
  }

  public static ActivityFoodDetailBinding bind(@NonNull View view) {
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
  public static ActivityFoodDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityFoodDetailBinding)bind(component, view, R.layout.activity_food_detail);
  }
}
