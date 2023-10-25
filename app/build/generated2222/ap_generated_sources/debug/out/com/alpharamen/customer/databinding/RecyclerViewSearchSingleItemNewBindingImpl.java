package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewSearchSingleItemNewBindingImpl extends RecyclerViewSearchSingleItemNewBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout_item, 4);
        sViewsWithIds.put(R.id.view11, 5);
        sViewsWithIds.put(R.id.image_view_search_item, 6);
        sViewsWithIds.put(R.id.image_view_star1, 7);
        sViewsWithIds.put(R.id.image_view_star2, 8);
        sViewsWithIds.put(R.id.image_view_star3, 9);
        sViewsWithIds.put(R.id.image_view_star4, 10);
        sViewsWithIds.put(R.id.image_view_star5, 11);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewSearchSingleItemNewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private RecyclerViewSearchSingleItemNewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[2]
            , (android.view.View) bindings[5]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[1]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[3]
            );
        this.cardViewSearch.setTag(null);
        this.textViewHotelName.setTag(null);
        this.wacTextViewItemName.setTag(null);
        this.wacTextViewRate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.SearchItemListModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.SearchItemListModel Item) {
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
        com.alpharamen.customer.data.models.SearchItemListModel item = mItem;
        java.lang.String itemHotelName = null;
        java.lang.String itemProductRate = null;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        java.lang.String itemProductTitle = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.hotelName
                    itemHotelName = item.getHotelName();
                    // read item.productRate
                    itemProductRate = item.getProductRate();
                    // read item.productTitle
                    itemProductTitle = item.getProductTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardViewSearch.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHotelName, itemHotelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wacTextViewItemName, itemProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wacTextViewRate, itemProductRate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.SearchItemListModel item = mItem;
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