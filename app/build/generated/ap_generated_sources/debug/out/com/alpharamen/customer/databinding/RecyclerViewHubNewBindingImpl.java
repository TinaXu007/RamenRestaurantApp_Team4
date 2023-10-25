package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewHubNewBindingImpl extends RecyclerViewHubNewBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_new, 4);
        sViewsWithIds.put(R.id.card_view_hub, 5);
        sViewsWithIds.put(R.id.image_view_hub, 6);
        sViewsWithIds.put(R.id.view_end, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewHubNewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RecyclerViewHubNewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[1]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewRateAndDistance.setTag(null);
        this.textViewRestName.setTag(null);
        this.viewBottom.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.HubsListModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.HubsListModel Item) {
        updateRegistration(0, Item);
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
            case 0 :
                return onChangeItem((com.alpharamen.customer.data.models.HubsListModel) object, fieldId);
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
        else if (fieldId == BR.selected) {
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
        com.alpharamen.customer.data.models.HubsListModel item = mItem;
        java.lang.String itemRateAndDistance = null;
        boolean itemHide = false;
        int itemSelectedViewBottomAndroidColorSelectedViewColorViewBottomAndroidColorUnselectedViewColor = 0;
        boolean itemSelected = false;
        int itemHideViewGONEViewVISIBLE = 0;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        java.lang.String itemRestaurentName = null;

        if ((dirtyFlags & 0xdL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (item != null) {
                        // read item.rateAndDistance
                        itemRateAndDistance = item.getRateAndDistance();
                        // read item.hide
                        itemHide = item.isHide();
                        // read item.restaurentName
                        itemRestaurentName = item.getRestaurentName();
                    }
                if((dirtyFlags & 0x9L) != 0) {
                    if(itemHide) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read item.hide ? View.GONE : View.VISIBLE
                    itemHideViewGONEViewVISIBLE = ((itemHide) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }

                if (item != null) {
                    // read item.selected
                    itemSelected = item.isSelected();
                }
            if((dirtyFlags & 0xdL) != 0) {
                if(itemSelected) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read item.selected ? @android:color/selected_view_color : @android:color/unselected_view_color
                itemSelectedViewBottomAndroidColorSelectedViewColorViewBottomAndroidColorUnselectedViewColor = ((itemSelected) ? (getColorFromResource(viewBottom, R.color.selected_view_color)) : (getColorFromResource(viewBottom, R.color.unselected_view_color)));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(itemHideViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRateAndDistance, itemRateAndDistance);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRestName, itemRestaurentName);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.viewBottom, androidx.databinding.adapters.Converters.convertColorToDrawable(itemSelectedViewBottomAndroidColorSelectedViewColorViewBottomAndroidColorUnselectedViewColor));
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.HubsListModel item = mItem;
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
        flag 2 (0x3L): item.selected
        flag 3 (0x4L): null
        flag 4 (0x5L): item.selected ? @android:color/selected_view_color : @android:color/unselected_view_color
        flag 5 (0x6L): item.selected ? @android:color/selected_view_color : @android:color/unselected_view_color
        flag 6 (0x7L): item.hide ? View.GONE : View.VISIBLE
        flag 7 (0x8L): item.hide ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}