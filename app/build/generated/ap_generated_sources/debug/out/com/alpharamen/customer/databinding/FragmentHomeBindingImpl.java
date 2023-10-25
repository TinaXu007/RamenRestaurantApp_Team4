package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(1, 
            new String[] {"free_delivery_layout"},
            new int[] {5},
            new int[] {com.alpharamen.customer.R.layout.free_delivery_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView10, 6);
        sViewsWithIds.put(R.id.recycler_view_popular, 7);
        sViewsWithIds.put(R.id.recycler_view_offer_list, 8);
        sViewsWithIds.put(R.id.textView16, 9);
        sViewsWithIds.put(R.id.shimmer_layout, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.alpharamen.customer.databinding.FreeDeliveryLayoutBinding) bindings[5]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            );
        this.constraintLayoutFoodItemList.setTag(null);
        setContainedBinding(this.freeDeliveryLayout);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.offersPlaceHolder.setTag(null);
        this.placeHolderFreeDeliveryList.setTag(null);
        this.popularListPlaceHolder.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        freeDeliveryLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (freeDeliveryLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sample == variableId) {
            setSample((com.alpharamen.customer.data.models.SampleModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSample(@Nullable com.alpharamen.customer.data.models.SampleModel Sample) {
        this.mSample = Sample;
    }
    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
        this.mListener = Listener;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        freeDeliveryLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSample((com.alpharamen.customer.data.models.SampleModel) object, fieldId);
            case 1 :
                return onChangeFreeDeliveryLayout((com.alpharamen.customer.databinding.FreeDeliveryLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSample(com.alpharamen.customer.data.models.SampleModel Sample, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFreeDeliveryLayout(com.alpharamen.customer.databinding.FreeDeliveryLayoutBinding FreeDeliveryLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        // batch finished
        executeBindingsOn(freeDeliveryLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sample
        flag 1 (0x2L): freeDeliveryLayout
        flag 2 (0x3L): listener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}