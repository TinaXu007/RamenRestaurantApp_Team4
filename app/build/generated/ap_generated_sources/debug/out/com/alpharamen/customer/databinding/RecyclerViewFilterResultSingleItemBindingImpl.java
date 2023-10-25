package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewFilterResultSingleItemBindingImpl extends RecyclerViewFilterResultSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view11, 5);
        sViewsWithIds.put(R.id.image_view_star1, 6);
        sViewsWithIds.put(R.id.image_view_star2, 7);
        sViewsWithIds.put(R.id.image_view_star3, 8);
        sViewsWithIds.put(R.id.image_view_star4, 9);
        sViewsWithIds.put(R.id.image_view_star5, 10);
        sViewsWithIds.put(R.id.image_view_cart_item, 11);
        sViewsWithIds.put(R.id.linear_layout_quantity, 12);
        sViewsWithIds.put(R.id.text_add, 13);
        sViewsWithIds.put(R.id.text_quantity, 14);
        sViewsWithIds.put(R.id.text_subtract, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewFilterResultSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private RecyclerViewFilterResultSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[11]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[5]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[4]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[3]
            );
        this.cardViewAddress.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView29.setTag(null);
        this.wacTextView4.setTag(null);
        this.wacTextViewHotel.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.FilterResultModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.FilterResultModel Item) {
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
        com.alpharamen.customer.data.models.FilterResultModel item = mItem;
        java.lang.String itemRestName = null;
        java.lang.String itemRate = null;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        java.lang.String itemItemName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.restName
                    itemRestName = item.getRestName();
                    // read item.rate
                    itemRate = item.getRate();
                    // read item.itemName
                    itemItemName = item.getItemName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardViewAddress.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView29, itemItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wacTextView4, itemRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wacTextViewHotel, itemRestName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.FilterResultModel item = mItem;
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
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}