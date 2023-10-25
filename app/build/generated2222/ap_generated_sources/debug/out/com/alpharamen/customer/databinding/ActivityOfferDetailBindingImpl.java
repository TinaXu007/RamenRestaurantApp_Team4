package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOfferDetailBindingImpl extends ActivityOfferDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nestedScrollView_offer_detail, 8);
        sViewsWithIds.put(R.id.recycler_view_terms, 9);
        sViewsWithIds.put(R.id.text_view_terms, 10);
        sViewsWithIds.put(R.id.recycler_view_about, 11);
        sViewsWithIds.put(R.id.text_view_about, 12);
        sViewsWithIds.put(R.id.cardView_offer, 13);
        sViewsWithIds.put(R.id.text_view_Promotion_code, 14);
        sViewsWithIds.put(R.id.image_view_offer_detail, 15);
        sViewsWithIds.put(R.id.textView_valid_on, 16);
        sViewsWithIds.put(R.id.text_view_valid_time, 17);
        sViewsWithIds.put(R.id.textView_support_os, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityOfferDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityOfferDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            );
        this.imageViewPrevious.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView38.setTag(null);
        this.textViewCopy.setTag(null);
        this.textViewCopyCode.setTag(null);
        this.textViewOffer.setTag(null);
        this.textViewOfferName.setTag(null);
        this.textViewOfferNameSubHeading.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.alpharamen.customer.data.models.OffersModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.offerDetail == variableId) {
            setOfferDetail((com.alpharamen.customer.viewmodel.OfferDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.OffersModel Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setOfferDetail(@Nullable com.alpharamen.customer.viewmodel.OfferDetailViewModel OfferDetail) {
        this.mOfferDetail = OfferDetail;
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
        com.alpharamen.customer.data.models.OffersModel item = mItem;
        java.lang.String itemOffer = null;
        java.lang.String itemValidity = null;
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;
        java.lang.String itemOfferCode = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.offer
                    itemOffer = item.getOffer();
                    // read item.validity
                    itemValidity = item.getValidity();
                    // read item.offerCode
                    itemOfferCode = item.getOfferCode();
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.imageViewPrevious.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewCopy.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewCopyCode.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView38, itemValidity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewOffer, itemOfferCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewOfferName, itemOffer);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewOfferNameSubHeading, itemOffer);
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
        flag 0 (0x1L): item
        flag 1 (0x2L): listener
        flag 2 (0x3L): offerDetail
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}