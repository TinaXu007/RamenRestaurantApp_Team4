package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFilterBindingImpl extends ActivityFilterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_view_filter_heading, 13);
        sViewsWithIds.put(R.id.nestedScrollViewFilter, 14);
        sViewsWithIds.put(R.id.guideline_meal, 15);
        sViewsWithIds.put(R.id.guideline_vertical_initial, 16);
        sViewsWithIds.put(R.id.guideline_vertical_first, 17);
        sViewsWithIds.put(R.id.guideline_vertical_second, 18);
        sViewsWithIds.put(R.id.textView_meal, 19);
        sViewsWithIds.put(R.id.text_view_dishes, 20);
        sViewsWithIds.put(R.id.recycler_view_dish_filter_items, 21);
        sViewsWithIds.put(R.id.text_view_price, 22);
        sViewsWithIds.put(R.id.text_view_max, 23);
        sViewsWithIds.put(R.id.text_view_min, 24);
        sViewsWithIds.put(R.id.guideline_rating, 25);
        sViewsWithIds.put(R.id.text_view_rating, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.CheckBox) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            , (androidx.constraintlayout.widget.Guideline) bindings[25]
            , (androidx.constraintlayout.widget.Guideline) bindings[17]
            , (androidx.constraintlayout.widget.Guideline) bindings[16]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (android.widget.ImageView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[14]
            , (com.appyvet.materialrangebar.RangeBar) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[12]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[26]
            , (android.widget.Button) bindings[11]
            );
        this.checkBoxBreakFast.setTag(null);
        this.checkBoxDinner.setTag(null);
        this.checkBoxLunch.setTag(null);
        this.imageViewPrevArrow.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rangeBarPrice.setTag(null);
        this.textViewApply.setTag(null);
        this.textViewRateFive.setTag(null);
        this.textViewRateFour.setTag(null);
        this.textViewRateOne.setTag(null);
        this.textViewRateThree.setTag(null);
        this.textViewRateTwo.setTag(null);
        this.textViewResetAll.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.ratingSelection == variableId) {
            setRatingSelection((java.lang.Integer) variable);
        }
        else if (BR.filter == variableId) {
            setFilter((com.alpharamen.customer.viewmodel.FilterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setRatingSelection(@Nullable java.lang.Integer RatingSelection) {
        this.mRatingSelection = RatingSelection;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ratingSelection);
        super.requestRebind();
    }
    public void setFilter(@Nullable com.alpharamen.customer.viewmodel.FilterViewModel Filter) {
        this.mFilter = Filter;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int ratingSelectionInt4TextViewRateFiveAndroidColorTextColorWhiteTextViewRateFiveAndroidColorTextColorBlack = 0;
        android.graphics.drawable.Drawable ratingSelectionInt4TextViewRateFiveAndroidDrawableBackGroundRatingTextViewRateFiveAndroidDrawableBackGroundRatingEmpty = null;
        int ratingSelectionInt1TextViewRateOneAndroidColorTextColorWhiteTextViewRateOneAndroidColorTextColorBlack = 0;
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;
        boolean ratingSelectionInt2 = false;
        java.lang.Integer ratingSelection = mRatingSelection;
        int androidxDatabindingViewDataBindingSafeUnboxRatingSelection = 0;
        int ratingSelectionInt3TextViewRateFourAndroidColorTextColorWhiteTextViewRateFourAndroidColorTextColorBlack = 0;
        boolean ratingSelectionInt1 = false;
        android.graphics.drawable.Drawable ratingSelectionInt1TextViewRateOneAndroidDrawableBackGroundRatingTextViewRateOneAndroidDrawableBackGroundRatingEmpty = null;
        android.graphics.drawable.Drawable ratingSelectionInt2TextViewRateThreeAndroidDrawableBackGroundRatingTextViewRateThreeAndroidDrawableBackGroundRatingEmpty = null;
        boolean RatingSelectionInt11 = false;
        int ratingSelectionInt2TextViewRateThreeAndroidColorTextColorWhiteTextViewRateThreeAndroidColorTextColorBlack = 0;
        android.graphics.drawable.Drawable ratingSelectionInt1TextViewRateTwoAndroidDrawableBackGroundRatingTextViewRateTwoAndroidDrawableBackGroundRatingEmpty = null;
        boolean ratingSelectionInt4 = false;
        boolean ratingSelectionInt3 = false;
        android.graphics.drawable.Drawable ratingSelectionInt3TextViewRateFourAndroidDrawableBackGroundRatingTextViewRateFourAndroidDrawableBackGroundRatingEmpty = null;
        int ratingSelectionInt1TextViewRateTwoAndroidColorTextColorWhiteTextViewRateTwoAndroidColorTextColorBlack = 0;

        if ((dirtyFlags & 0x9L) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection)
                androidxDatabindingViewDataBindingSafeUnboxRatingSelection = androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 2
                ratingSelectionInt2 = (androidxDatabindingViewDataBindingSafeUnboxRatingSelection) > (2);
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) >= 1
                ratingSelectionInt1 = (androidxDatabindingViewDataBindingSafeUnboxRatingSelection) >= (1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 1
                RatingSelectionInt11 = (androidxDatabindingViewDataBindingSafeUnboxRatingSelection) > (1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 4
                ratingSelectionInt4 = (androidxDatabindingViewDataBindingSafeUnboxRatingSelection) > (4);
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 3
                ratingSelectionInt3 = (androidxDatabindingViewDataBindingSafeUnboxRatingSelection) > (3);
            if((dirtyFlags & 0xaL) != 0) {
                if(ratingSelectionInt2) {
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0xaL) != 0) {
                if(ratingSelectionInt1) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xaL) != 0) {
                if(RatingSelectionInt11) {
                        dirtyFlags |= 0x80000L;
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x400000L;
                }
            }
            if((dirtyFlags & 0xaL) != 0) {
                if(ratingSelectionInt4) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xaL) != 0) {
                if(ratingSelectionInt3) {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 2 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
                ratingSelectionInt2TextViewRateThreeAndroidDrawableBackGroundRatingTextViewRateThreeAndroidDrawableBackGroundRatingEmpty = ((ratingSelectionInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateThree.getContext(), R.drawable.back_ground_rating)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateThree.getContext(), R.drawable.back_ground_rating_empty)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 2 ? @android:color/textColorWhite : @android:color/textColorBlack
                ratingSelectionInt2TextViewRateThreeAndroidColorTextColorWhiteTextViewRateThreeAndroidColorTextColorBlack = ((ratingSelectionInt2) ? (getColorFromResource(textViewRateThree, R.color.textColorWhite)) : (getColorFromResource(textViewRateThree, R.color.textColorBlack)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) >= 1 ? @android:color/textColorWhite : @android:color/textColorBlack
                ratingSelectionInt1TextViewRateOneAndroidColorTextColorWhiteTextViewRateOneAndroidColorTextColorBlack = ((ratingSelectionInt1) ? (getColorFromResource(textViewRateOne, R.color.textColorWhite)) : (getColorFromResource(textViewRateOne, R.color.textColorBlack)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) >= 1 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
                ratingSelectionInt1TextViewRateOneAndroidDrawableBackGroundRatingTextViewRateOneAndroidDrawableBackGroundRatingEmpty = ((ratingSelectionInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateOne.getContext(), R.drawable.back_ground_rating)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateOne.getContext(), R.drawable.back_ground_rating_empty)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 1 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
                ratingSelectionInt1TextViewRateTwoAndroidDrawableBackGroundRatingTextViewRateTwoAndroidDrawableBackGroundRatingEmpty = ((RatingSelectionInt11) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateTwo.getContext(), R.drawable.back_ground_rating)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateTwo.getContext(), R.drawable.back_ground_rating_empty)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 1 ? @android:color/textColorWhite : @android:color/textColorBlack
                ratingSelectionInt1TextViewRateTwoAndroidColorTextColorWhiteTextViewRateTwoAndroidColorTextColorBlack = ((RatingSelectionInt11) ? (getColorFromResource(textViewRateTwo, R.color.textColorWhite)) : (getColorFromResource(textViewRateTwo, R.color.textColorBlack)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 4 ? @android:color/textColorWhite : @android:color/textColorBlack
                ratingSelectionInt4TextViewRateFiveAndroidColorTextColorWhiteTextViewRateFiveAndroidColorTextColorBlack = ((ratingSelectionInt4) ? (getColorFromResource(textViewRateFive, R.color.textColorWhite)) : (getColorFromResource(textViewRateFive, R.color.textColorBlack)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 4 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
                ratingSelectionInt4TextViewRateFiveAndroidDrawableBackGroundRatingTextViewRateFiveAndroidDrawableBackGroundRatingEmpty = ((ratingSelectionInt4) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateFive.getContext(), R.drawable.back_ground_rating)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateFive.getContext(), R.drawable.back_ground_rating_empty)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 3 ? @android:color/textColorWhite : @android:color/textColorBlack
                ratingSelectionInt3TextViewRateFourAndroidColorTextColorWhiteTextViewRateFourAndroidColorTextColorBlack = ((ratingSelectionInt3) ? (getColorFromResource(textViewRateFour, R.color.textColorWhite)) : (getColorFromResource(textViewRateFour, R.color.textColorBlack)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 3 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
                ratingSelectionInt3TextViewRateFourAndroidDrawableBackGroundRatingTextViewRateFourAndroidDrawableBackGroundRatingEmpty = ((ratingSelectionInt3) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateFour.getContext(), R.drawable.back_ground_rating)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(textViewRateFour.getContext(), R.drawable.back_ground_rating_empty)));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.checkBoxBreakFast.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.checkBoxDinner.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.checkBoxLunch.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.imageViewPrevArrow.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.rangeBarPrice.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewApply.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewRateFive.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewRateFour.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewRateOne.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewRateThree.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewRateTwo.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewResetAll.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.textViewRateFive, ratingSelectionInt4TextViewRateFiveAndroidDrawableBackGroundRatingTextViewRateFiveAndroidDrawableBackGroundRatingEmpty);
            this.textViewRateFive.setTextColor(ratingSelectionInt4TextViewRateFiveAndroidColorTextColorWhiteTextViewRateFiveAndroidColorTextColorBlack);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.textViewRateFour, ratingSelectionInt3TextViewRateFourAndroidDrawableBackGroundRatingTextViewRateFourAndroidDrawableBackGroundRatingEmpty);
            this.textViewRateFour.setTextColor(ratingSelectionInt3TextViewRateFourAndroidColorTextColorWhiteTextViewRateFourAndroidColorTextColorBlack);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.textViewRateOne, ratingSelectionInt1TextViewRateOneAndroidDrawableBackGroundRatingTextViewRateOneAndroidDrawableBackGroundRatingEmpty);
            this.textViewRateOne.setTextColor(ratingSelectionInt1TextViewRateOneAndroidColorTextColorWhiteTextViewRateOneAndroidColorTextColorBlack);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.textViewRateThree, ratingSelectionInt2TextViewRateThreeAndroidDrawableBackGroundRatingTextViewRateThreeAndroidDrawableBackGroundRatingEmpty);
            this.textViewRateThree.setTextColor(ratingSelectionInt2TextViewRateThreeAndroidColorTextColorWhiteTextViewRateThreeAndroidColorTextColorBlack);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.textViewRateTwo, ratingSelectionInt1TextViewRateTwoAndroidDrawableBackGroundRatingTextViewRateTwoAndroidDrawableBackGroundRatingEmpty);
            this.textViewRateTwo.setTextColor(ratingSelectionInt1TextViewRateTwoAndroidColorTextColorWhiteTextViewRateTwoAndroidColorTextColorBlack);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private android.view.View.OnClickListener value;
        public OnClickListenerImpl setValue(android.view.View.OnClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listener
        flag 1 (0x2L): ratingSelection
        flag 2 (0x3L): filter
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 4 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 4 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 4 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 4 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) >= 1 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) >= 1 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 3 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 3 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) >= 1 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) >= 1 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 2 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 2 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 2 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 2 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 1 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 1 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 3 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 3 ? @android:drawable/back_ground_rating : @android:drawable/back_ground_rating_empty
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 1 ? @android:color/textColorWhite : @android:color/textColorBlack
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(ratingSelection) > 1 ? @android:color/textColorWhite : @android:color/textColorBlack
    flag mapping end*/
    //end
}