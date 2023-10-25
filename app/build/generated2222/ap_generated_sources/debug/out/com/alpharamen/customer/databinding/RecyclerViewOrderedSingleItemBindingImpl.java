package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewOrderedSingleItemBindingImpl extends RecyclerViewOrderedSingleItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView4, 2);
        sViewsWithIds.put(R.id.image_view_ordered, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewOrderedSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RecyclerViewOrderedSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.view.View) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.view4.setTag(null);
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
        if (BR.isLast == variableId) {
            setIsLast((java.lang.Boolean) variable);
        }
        else if (BR.item == variableId) {
            setItem((com.alpharamen.customer.data.models.OrderdItemsModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsLast(@Nullable java.lang.Boolean IsLast) {
        this.mIsLast = IsLast;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isLast);
        super.requestRebind();
    }
    public void setItem(@Nullable com.alpharamen.customer.data.models.OrderdItemsModel Item) {
        this.mItem = Item;
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
        java.lang.Boolean isLast = mIsLast;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLast = false;
        int isLastViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast)
                androidxDatabindingViewDataBindingSafeUnboxIsLast = androidx.databinding.ViewDataBinding.safeUnbox(isLast);
            if((dirtyFlags & 0x5L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLast) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
                isLastViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsLast) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.view4.setVisibility(isLastViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isLast
        flag 1 (0x2L): item
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}