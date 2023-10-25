package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTrackItemBindingImpl extends ActivityTrackItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view_address, 4);
        sViewsWithIds.put(R.id.guideline_separator, 5);
        sViewsWithIds.put(R.id.textView_item_name, 6);
        sViewsWithIds.put(R.id.wac_text_view_hotel, 7);
        sViewsWithIds.put(R.id.text_estimated_time, 8);
        sViewsWithIds.put(R.id.text_view_estimated_time, 9);
        sViewsWithIds.put(R.id.textView_my_address, 10);
        sViewsWithIds.put(R.id.textView_address, 11);
        sViewsWithIds.put(R.id.image_view_cart_item, 12);
        sViewsWithIds.put(R.id.guideline_separator_main, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityTrackItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityTrackItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (android.widget.ImageView) bindings[2]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[12]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.view.View) bindings[1]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[7]
            );
        this.imageViewCall.setTag(null);
        this.imageViewRoute.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.viewEstimatedTime.setTag(null);
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
        else if (BR.trackItem == variableId) {
            setTrackItem((com.alpharamen.customer.viewmodel.TrackItemViewModel) variable);
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
    public void setTrackItem(@Nullable com.alpharamen.customer.viewmodel.TrackItemViewModel TrackItem) {
        this.mTrackItem = TrackItem;
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

            this.imageViewCall.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.imageViewRoute.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.viewEstimatedTime.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
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
        flag 1 (0x2L): trackItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}