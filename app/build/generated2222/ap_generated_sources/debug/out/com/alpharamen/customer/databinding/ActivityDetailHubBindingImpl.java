package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailHubBindingImpl extends ActivityDetailHubBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(23);
        sIncludes.setIncludes(1, 
            new String[] {"widget_header_view"},
            new int[] {5},
            new int[] {com.alpharamen.customer.R.layout.widget_header_view});
        sIncludes.setIncludes(2, 
            new String[] {"widget_header_view_top"},
            new int[] {4},
            new int[] {com.alpharamen.customer.R.layout.widget_header_view_top});
        sIncludes.setIncludes(3, 
            new String[] {"content_main"},
            new int[] {6},
            new int[] {com.alpharamen.customer.R.layout.content_main});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 7);
        sViewsWithIds.put(R.id.collapsing_toolbar, 8);
        sViewsWithIds.put(R.id.image_detail, 9);
        sViewsWithIds.put(R.id.roundedImageView, 10);
        sViewsWithIds.put(R.id.imageView_location, 11);
        sViewsWithIds.put(R.id.text_view_location, 12);
        sViewsWithIds.put(R.id.image_view_star_white, 13);
        sViewsWithIds.put(R.id.wacTextView_no_of_stars, 14);
        sViewsWithIds.put(R.id.wacTextView_stars, 15);
        sViewsWithIds.put(R.id.image_view_clock, 16);
        sViewsWithIds.put(R.id.wac_text_view_time, 17);
        sViewsWithIds.put(R.id.wac_text_view__delivery_time, 18);
        sViewsWithIds.put(R.id.image_view_loc_to_loc, 19);
        sViewsWithIds.put(R.id.wac_text_view_distance, 20);
        sViewsWithIds.put(R.id.wac_text_view__km, 21);
        sViewsWithIds.put(R.id.recycler_view_dish_types, 22);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final com.alpharamen.customer.databinding.WidgetHeaderViewBinding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailHubBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityDetailHubBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.appbar.AppBarLayout) bindings[7]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[8]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[9]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[13]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[1]
            , (com.alpharamen.customer.databinding.ContentMainBinding) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (com.makeramen.roundedimageview.RoundedImageView) bindings[10]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (com.alpharamen.customer.databinding.WidgetHeaderViewTopBinding) bindings[4]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[18]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[20]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[21]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[14]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[15]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[17]
            );
        this.mainContent.setTag(null);
        setContainedBinding(this.mainContentLayout);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.alpharamen.customer.databinding.WidgetHeaderViewBinding) bindings[5];
        setContainedBinding(this.mboundView1);
        this.scrollView.setTag(null);
        this.toolbar.setTag(null);
        setContainedBinding(this.toolbarHeaderView);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        toolbarHeaderView.invalidateAll();
        mboundView1.invalidateAll();
        mainContentLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (toolbarHeaderView.hasPendingBindings()) {
            return true;
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        if (mainContentLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.alpharamen.customer.data.models.HubsListModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.hubDetail == variableId) {
            setHubDetail((com.alpharamen.customer.viewmodel.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.HubsListModel Item) {
        this.mItem = Item;
    }
    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
        this.mListener = Listener;
    }
    public void setHubDetail(@Nullable com.alpharamen.customer.viewmodel.DetailViewModel HubDetail) {
        this.mHubDetail = HubDetail;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        toolbarHeaderView.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
        mainContentLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((com.alpharamen.customer.data.models.HubsListModel) object, fieldId);
            case 1 :
                return onChangeToolbarHeaderView((com.alpharamen.customer.databinding.WidgetHeaderViewTopBinding) object, fieldId);
            case 2 :
                return onChangeMainContentLayout((com.alpharamen.customer.databinding.ContentMainBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.alpharamen.customer.data.models.HubsListModel Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeToolbarHeaderView(com.alpharamen.customer.databinding.WidgetHeaderViewTopBinding ToolbarHeaderView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainContentLayout(com.alpharamen.customer.databinding.ContentMainBinding MainContentLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        executeBindingsOn(toolbarHeaderView);
        executeBindingsOn(mboundView1);
        executeBindingsOn(mainContentLayout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): toolbarHeaderView
        flag 2 (0x3L): mainContentLayout
        flag 3 (0x4L): listener
        flag 4 (0x5L): hubDetail
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}