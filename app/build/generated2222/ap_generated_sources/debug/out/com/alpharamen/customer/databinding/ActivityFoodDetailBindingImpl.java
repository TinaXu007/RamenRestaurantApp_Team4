package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFoodDetailBindingImpl extends ActivityFoodDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(30);
        sIncludes.setIncludes(1, 
            new String[] {"placeholder_food_detail"},
            new int[] {9},
            new int[] {com.alpharamen.customer.R.layout.placeholder_food_detail});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout_food_detail, 10);
        sViewsWithIds.put(R.id.scrollView, 11);
        sViewsWithIds.put(R.id.rl_image_detail, 12);
        sViewsWithIds.put(R.id.image_detail, 13);
        sViewsWithIds.put(R.id.ratingBar, 14);
        sViewsWithIds.put(R.id.text_view_food_name, 15);
        sViewsWithIds.put(R.id.text_view_hotel_name, 16);
        sViewsWithIds.put(R.id.text_view_rupees, 17);
        sViewsWithIds.put(R.id.text_view_discount_price, 18);
        sViewsWithIds.put(R.id.text_view_actual_price, 19);
        sViewsWithIds.put(R.id.text_view_offer_percent, 20);
        sViewsWithIds.put(R.id.text_view_percent_symbol, 21);
        sViewsWithIds.put(R.id.text_view_quantity, 22);
        sViewsWithIds.put(R.id.view9, 23);
        sViewsWithIds.put(R.id.text_quantity, 24);
        sViewsWithIds.put(R.id.text_view_about_item, 25);
        sViewsWithIds.put(R.id.text_view_about_details, 26);
        sViewsWithIds.put(R.id.text_view_related_food, 27);
        sViewsWithIds.put(R.id.recycler_view_related_foods, 28);
        sViewsWithIds.put(R.id.view10, 29);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.alpharamen.customer.databinding.PlaceholderFoodDetailBinding mboundView1;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityFoodDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityFoodDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[13]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.RatingBar) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (android.widget.FrameLayout) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[11]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[20]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[5]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[17]
            , (android.view.View) bindings[29]
            , (android.widget.RelativeLayout) bindings[23]
            );
        this.imageViewCartDetail.setTag(null);
        this.imageViewPrevArrow.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.alpharamen.customer.databinding.PlaceholderFoodDetailBinding) bindings[9];
        setContainedBinding(this.mboundView1);
        this.shimmerLayout.setTag(null);
        this.textAdd.setTag(null);
        this.textSubtract.setTag(null);
        this.textViewAddToCart.setTag(null);
        this.textViewNoOfItemsCart.setTag(null);
        this.textViewOrderNow.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        mboundView1.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.foodDetail == variableId) {
            setFoodDetail((com.alpharamen.customer.viewmodel.FoodDetailViewModel) variable);
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
    public void setFoodDetail(@Nullable com.alpharamen.customer.viewmodel.FoodDetailViewModel FoodDetail) {
        this.mFoodDetail = FoodDetail;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
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
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;

        if ((dirtyFlags & 0x5L) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.imageViewCartDetail.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.imageViewPrevArrow.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textAdd.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textSubtract.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewAddToCart.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewNoOfItemsCart.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewOrderNow.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
        }
        executeBindingsOn(mboundView1);
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
        flag 1 (0x2L): foodDetail
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}