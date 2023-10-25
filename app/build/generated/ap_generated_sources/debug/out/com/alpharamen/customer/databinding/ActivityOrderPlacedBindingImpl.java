package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOrderPlacedBindingImpl extends ActivityOrderPlacedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout_order_placed, 3);
        sViewsWithIds.put(R.id.textView_order_placed_heading, 4);
        sViewsWithIds.put(R.id.recyclerView, 5);
        sViewsWithIds.put(R.id.textView_order_placed_confirmation, 6);
        sViewsWithIds.put(R.id.imageView_source_loc, 7);
        sViewsWithIds.put(R.id.text_view_rest_name, 8);
        sViewsWithIds.put(R.id.textView_source_address, 9);
        sViewsWithIds.put(R.id.view_dotted_line, 10);
        sViewsWithIds.put(R.id.image_view_destination_loc, 11);
        sViewsWithIds.put(R.id.textView_destination_address, 12);
        sViewsWithIds.put(R.id.lottie_animation_view, 13);
        sViewsWithIds.put(R.id.text_view_payment_processing, 14);
        sViewsWithIds.put(R.id.text_view_success, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityOrderPlacedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityOrderPlacedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (com.airbnb.lottie.LottieAnimationView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[15]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[2]
            , (android.view.View) bindings[10]
            );
        this.imageViewPrevArrow.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewTrackItem.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        else if (BR.payment == variableId) {
            setPayment((com.alpharamen.customer.viewmodel.PaymentViewModel) variable);
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
    public void setPayment(@Nullable com.alpharamen.customer.viewmodel.PaymentViewModel Payment) {
        this.mPayment = Payment;
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

            this.imageViewPrevArrow.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewTrackItem.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
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
        flag 1 (0x2L): payment
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}