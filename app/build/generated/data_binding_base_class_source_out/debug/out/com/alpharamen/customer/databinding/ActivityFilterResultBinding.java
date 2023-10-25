// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alpharamen.customer.R;
import com.alpharamen.customer.viewmodel.FilterResultViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityFilterResultBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardViewSearchTop;

  @NonNull
  public final ConstraintLayout constraintLayoutSearch;

  @NonNull
  public final EditText editText2;

  @NonNull
  public final ImageView imageViewFilter;

  @NonNull
  public final RecyclerView recyclerViewFilterResult;

  @Bindable
  protected View.OnClickListener mListener;

  @Bindable
  protected FilterResultViewModel mFilterResult;

  protected ActivityFilterResultBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardViewSearchTop, ConstraintLayout constraintLayoutSearch, EditText editText2,
      ImageView imageViewFilter, RecyclerView recyclerViewFilterResult) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewSearchTop = cardViewSearchTop;
    this.constraintLayoutSearch = constraintLayoutSearch;
    this.editText2 = editText2;
    this.imageViewFilter = imageViewFilter;
    this.recyclerViewFilterResult = recyclerViewFilterResult;
  }

  public abstract void setListener(@Nullable View.OnClickListener listener);

  @Nullable
  public View.OnClickListener getListener() {
    return mListener;
  }

  public abstract void setFilterResult(@Nullable FilterResultViewModel filterResult);

  @Nullable
  public FilterResultViewModel getFilterResult() {
    return mFilterResult;
  }

  @NonNull
  public static ActivityFilterResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_filter_result, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFilterResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFilterResultBinding>inflateInternal(inflater, R.layout.activity_filter_result, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFilterResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_filter_result, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFilterResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFilterResultBinding>inflateInternal(inflater, R.layout.activity_filter_result, null, false, component);
  }

  public static ActivityFilterResultBinding bind(@NonNull View view) {
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
  public static ActivityFilterResultBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityFilterResultBinding)bind(component, view, R.layout.activity_filter_result);
  }
}
