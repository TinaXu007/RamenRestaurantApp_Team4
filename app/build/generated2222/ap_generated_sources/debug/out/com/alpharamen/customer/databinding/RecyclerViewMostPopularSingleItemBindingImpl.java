package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewMostPopularSingleItemBindingImpl extends RecyclerViewMostPopularSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout_item, 6);
        sViewsWithIds.put(R.id.card_view_popular_item, 7);
        sViewsWithIds.put(R.id.view_bottom, 8);
        sViewsWithIds.put(R.id.ratingBar, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewMostPopularSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private RecyclerViewMostPopularSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RatingBar) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[1]
            );
        this.imageViewMostPopularItem.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView15.setTag(null);
        this.textViewHubName.setTag(null);
        this.textViewIteName.setTag(null);
        this.viewEnd.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.PopularListModelNew) variable);
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

    public void setItem(@Nullable com.alpharamen.customer.data.models.PopularListModelNew Item) {
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
        com.alpharamen.customer.data.models.PopularListModelNew item = mItem;
        int isLastViewVISIBLEViewGONE = 0;
        java.lang.String itemHotelName = null;
        java.lang.String itemItemRate = null;
        java.lang.Boolean isLast = mIsLast;
        java.lang.String itemImage = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLast = false;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        java.lang.String itemProductTitle = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.hotelName
                    itemHotelName = item.getHotelName();
                    // read item.itemRate
                    itemItemRate = item.getItemRate();
                    // read item.image
                    itemImage = item.getImage();
                    // read item.productTitle
                    itemProductTitle = item.getProductTitle();
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
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.alpharamen.customer.view.adapter.BindingAdapters.loadImage(this.imageViewMostPopularItem, itemImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView15, itemItemRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHubName, itemHotelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewIteName, itemProductTitle);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.viewEnd.setVisibility(isLastViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.PopularListModelNew item = mItem;
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