package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewOfferSingleItemBindingImpl extends RecyclerViewOfferSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_end, 5);
        sViewsWithIds.put(R.id.view2, 6);
        sViewsWithIds.put(R.id.image_view_percent, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewOfferSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RecyclerViewOfferSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[5]
            );
        this.cardViewItem.setTag(null);
        this.imageViewItem.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewItemName.setTag(null);
        this.textViewOffer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.OfferListModelNew) variable);
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

    public void setItem(@Nullable com.alpharamen.customer.data.models.OfferListModelNew Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setIsLast(@Nullable java.lang.Boolean IsLast) {
        this.mIsLast = IsLast;
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
        com.alpharamen.customer.data.models.OfferListModelNew item = mItem;
        java.lang.String itemDiscountPercent = null;
        java.lang.String itemImage = null;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        java.lang.String itemProductTitle = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.discountPercent
                    itemDiscountPercent = item.getDiscountPercent();
                    // read item.image
                    itemImage = item.getImage();
                    // read item.productTitle
                    itemProductTitle = item.getProductTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cardViewItem.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.alpharamen.customer.view.adapter.BindingAdapters.loadImage(this.imageViewItem, itemImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewItemName, itemProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewOffer, itemDiscountPercent);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.OfferListModelNew item = mItem;
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
    flag mapping end*/
    //end
}