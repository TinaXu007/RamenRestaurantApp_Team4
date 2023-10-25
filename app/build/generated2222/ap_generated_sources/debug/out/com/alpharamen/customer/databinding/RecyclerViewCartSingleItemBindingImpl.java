package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewCartSingleItemBindingImpl extends RecyclerViewCartSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout_item, 7);
        sViewsWithIds.put(R.id.view_cart_single_item, 8);
        sViewsWithIds.put(R.id.image_view_cart_item, 9);
        sViewsWithIds.put(R.id.wacTextView_rupees, 10);
        sViewsWithIds.put(R.id.view_quantity, 11);
        sViewsWithIds.put(R.id.text_add, 12);
        sViewsWithIds.put(R.id.text_subtract, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewCartSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private RecyclerViewCartSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.view.View) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[3]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[2]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[4]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[10]
            );
        this.cardViewCartSingleItem.setTag(null);
        this.imageViewDelete.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textQuantity.setTag(null);
        this.wacTextView.setTag(null);
        this.wacTextViewHotel.setTag(null);
        this.wacTextViewRate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
        mCallback15 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 2);
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
        if (BR.item == variableId) {
            setItem((com.alpharamen.customer.data.models.CartItemModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.CartItemModel Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setListener(@Nullable com.alpharamen.customer.view.listener.OnAdapterSelectedListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        com.alpharamen.customer.data.models.CartItemModel item = mItem;
        java.lang.String itemRestName = null;
        int itemNo = 0;
        java.lang.String itemRate = null;
        java.lang.String itemItenName = null;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        java.lang.String stringValueOfItemNo = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.restName
                    itemRestName = item.getRestName();
                    // read item.no
                    itemNo = item.getNo();
                    // read item.rate
                    itemRate = item.getRate();
                    // read item.itenName
                    itemItenName = item.getItenName();
                }


                // read String.valueOf(item.no)
                stringValueOfItemNo = java.lang.String.valueOf(itemNo);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardViewCartSingleItem.setOnClickListener(mCallback14);
            this.imageViewDelete.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textQuantity, stringValueOfItemNo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wacTextView, itemRestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wacTextViewHotel, itemItenName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wacTextViewRate, itemRate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // item
                com.alpharamen.customer.data.models.CartItemModel item = mItem;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // listener
                com.alpharamen.customer.view.listener.OnAdapterSelectedListener listener = mListener;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    listener.onAdapterSelected(item);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // String.valueOf(item.id)
                java.lang.String stringValueOfItemId = null;
                // item.id
                int itemId = 0;
                // item
                com.alpharamen.customer.data.models.CartItemModel item = mItem;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // listener
                com.alpharamen.customer.view.listener.OnAdapterSelectedListener listener = mListener;
                // item != null
                boolean itemJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    itemJavaLangObjectNull = (item) != (null);
                    if (itemJavaLangObjectNull) {


                        itemId = item.getId();

                        stringValueOfItemId = java.lang.String.valueOf(itemId);

                        listener.onAdapterString(stringValueOfItemId);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}