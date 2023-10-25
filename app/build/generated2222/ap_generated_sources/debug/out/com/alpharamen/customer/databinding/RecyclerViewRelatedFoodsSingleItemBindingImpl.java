package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewRelatedFoodsSingleItemBindingImpl extends RecyclerViewRelatedFoodsSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_card_view_related_food, 5);
        sViewsWithIds.put(R.id.imageView_rupees, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewRelatedFoodsSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RecyclerViewRelatedFoodsSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[1]
            );
        this.cardViewRelatedFood.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewItemName.setTag(null);
        this.textViewRate.setTag(null);
        this.viewRelatedFood.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setItem((com.alpharamen.customer.data.models.RelatedFoodModel) variable);
        }
        else if (BR.relatedFood == variableId) {
            setRelatedFood((com.alpharamen.customer.data.models.RelatedFoodModel) variable);
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

    public void setItem(@Nullable com.alpharamen.customer.data.models.RelatedFoodModel Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setRelatedFood(@Nullable com.alpharamen.customer.data.models.RelatedFoodModel RelatedFood) {
        this.mRelatedFood = RelatedFood;
    }
    public void setIsLast(@Nullable java.lang.Boolean IsLast) {
        this.mIsLast = IsLast;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isLast);
        super.requestRebind();
    }
    public void setListener(@Nullable com.alpharamen.customer.view.listener.OnAdapterSelectedListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
        com.alpharamen.customer.data.models.RelatedFoodModel item = mItem;
        int isLastViewVISIBLEViewGONE = 0;
        java.lang.String itemRate = null;
        java.lang.Boolean isLast = mIsLast;
        java.lang.String itemName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLast = false;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;

        if ((dirtyFlags & 0x11L) != 0) {



                if (item != null) {
                    // read item.rate
                    itemRate = item.getRate();
                    // read item.name
                    itemName = item.getName();
                }
        }
        if ((dirtyFlags & 0x14L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast)
                androidxDatabindingViewDataBindingSafeUnboxIsLast = androidx.databinding.ViewDataBinding.safeUnbox(isLast);
            if((dirtyFlags & 0x14L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLast) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
                isLastViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsLast) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cardViewRelatedFood.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewItemName, itemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRate, itemRate);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.viewRelatedFood.setVisibility(isLastViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.RelatedFoodModel item = mItem;
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
        flag 1 (0x2L): relatedFood
        flag 2 (0x3L): isLast
        flag 3 (0x4L): listener
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}