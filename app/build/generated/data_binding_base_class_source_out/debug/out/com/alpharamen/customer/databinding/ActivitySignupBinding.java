// Generated by data binding compiler. Do not edit!
package com.alpharamen.customer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.alpharamen.customer.R;
import com.alpharamen.customer.viewmodel.SignupViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySignupBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayoutLocation;

  @NonNull
  public final EditText editTextCity;

  @NonNull
  public final EditText editTextEmail;

  @NonNull
  public final EditText editTextHouseName;

  @NonNull
  public final TextView editTextLocation;

  @NonNull
  public final EditText editTextPhone;

  @NonNull
  public final EditText editTextPinCode;

  @NonNull
  public final EditText editTextUserName;

  @NonNull
  public final ImageView imageViewLocate;

  @NonNull
  public final ImageView imageViewNextArrow;

  @NonNull
  public final ImageView imageViewSignUpBackground;

  @NonNull
  public final ImageView imageViewSignUpHead;

  @NonNull
  public final LottieAnimationView lottieAnimationViewLoadPlace;

  @NonNull
  public final View viewSignUpBackGround;

  @Bindable
  protected SignupViewModel mSignUp;

  @Bindable
  protected View.OnClickListener mListener;

  protected ActivitySignupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayoutLocation, EditText editTextCity, EditText editTextEmail,
      EditText editTextHouseName, TextView editTextLocation, EditText editTextPhone,
      EditText editTextPinCode, EditText editTextUserName, ImageView imageViewLocate,
      ImageView imageViewNextArrow, ImageView imageViewSignUpBackground,
      ImageView imageViewSignUpHead, LottieAnimationView lottieAnimationViewLoadPlace,
      View viewSignUpBackGround) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayoutLocation = constraintLayoutLocation;
    this.editTextCity = editTextCity;
    this.editTextEmail = editTextEmail;
    this.editTextHouseName = editTextHouseName;
    this.editTextLocation = editTextLocation;
    this.editTextPhone = editTextPhone;
    this.editTextPinCode = editTextPinCode;
    this.editTextUserName = editTextUserName;
    this.imageViewLocate = imageViewLocate;
    this.imageViewNextArrow = imageViewNextArrow;
    this.imageViewSignUpBackground = imageViewSignUpBackground;
    this.imageViewSignUpHead = imageViewSignUpHead;
    this.lottieAnimationViewLoadPlace = lottieAnimationViewLoadPlace;
    this.viewSignUpBackGround = viewSignUpBackGround;
  }

  public abstract void setSignUp(@Nullable SignupViewModel signUp);

  @Nullable
  public SignupViewModel getSignUp() {
    return mSignUp;
  }

  public abstract void setListener(@Nullable View.OnClickListener listener);

  @Nullable
  public View.OnClickListener getListener() {
    return mListener;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, null, false, component);
  }

  public static ActivitySignupBinding bind(@NonNull View view) {
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
  public static ActivitySignupBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySignupBinding)bind(component, view, R.layout.activity_signup);
  }
}
