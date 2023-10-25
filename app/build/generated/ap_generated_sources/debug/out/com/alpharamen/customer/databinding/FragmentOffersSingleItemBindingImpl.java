package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOffersSingleItemBindingImpl extends FragmentOffersSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view_offer_item, 4);
        sViewsWithIds.put(R.id.constraintLayout_offer_item, 5);
        sViewsWithIds.put(R.id.imageView_offer_item, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.view.View mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOffersSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentOffersSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.view.View) bindings[1];
        this.mboundView1.setTag(null);
        this.textViewOffer.setTag(null);
        this.textViewOfferName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
        else if (BR.isLast == variableId) {
            setIsLast((java.lang.Boolean) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
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
    public void setIsLast(@Nullable java.lang.Boolean IsLast) {
        this.mIsLast = IsLast;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isLast);
        super.requestRebind();
    }
    public void setListener(@Nullable com.alpharamen.customer.view.listener.OnAdapterSelectedListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
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
        int isLastViewVISIBLEViewGONE = 0;
        java.lang.String itemValidity = null;
        java.lang.Boolean isLast = mIsLast;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLast = false;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.offer
                    itemOffer = item.getOffer();
                    // read item.validity
                    itemValidity = item.getValidity();
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast)
                androidxDatabindingViewDataBindingSafeUnboxIsLast = androidx.databinding.ViewDataBinding.safeUnbox(isLast);
            if((dirtyFlags & 0xaL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLast) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
                isLastViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsLast) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(isLastViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewOffer, itemValidity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewOfferName, itemOffer);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.OffersModel item = mItem;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listener.onAdapterSelected(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): isLast
        flag 2 (0x3L): listener
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}