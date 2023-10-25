package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlaceholderFoodDetailBindingImpl extends PlaceholderFoodDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_detail, 2);
        sViewsWithIds.put(R.id.image_view_star1, 3);
        sViewsWithIds.put(R.id.text_view_food_name, 4);
        sViewsWithIds.put(R.id.text_view_hotel_name, 5);
        sViewsWithIds.put(R.id.text_view_rupees, 6);
        sViewsWithIds.put(R.id.textView28, 7);
        sViewsWithIds.put(R.id.view9, 8);
        sViewsWithIds.put(R.id.text_view_about_item, 9);
        sViewsWithIds.put(R.id.textViewOne, 10);
        sViewsWithIds.put(R.id.textViewTwo, 11);
        sViewsWithIds.put(R.id.textViewThree, 12);
        sViewsWithIds.put(R.id.textViewFour, 13);
        sViewsWithIds.put(R.id.textView31, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlaceholderFoodDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private PlaceholderFoodDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[2]
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.foodDetail == variableId) {
            setFoodDetail((com.alpharamen.customer.viewmodel.FoodDetailViewModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodDetail(@Nullable com.alpharamen.customer.viewmodel.FoodDetailViewModel FoodDetail) {
        this.mFoodDetail = FoodDetail;
    }
    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
        this.mListener = Listener;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): foodDetail
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}