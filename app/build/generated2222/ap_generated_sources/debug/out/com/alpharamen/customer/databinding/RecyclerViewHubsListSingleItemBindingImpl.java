package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewHubsListSingleItemBindingImpl extends RecyclerViewHubsListSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView3, 4);
        sViewsWithIds.put(R.id.imageView8, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewHubsListSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RecyclerViewHubsListSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView17.setTag(null);
        this.textView18.setTag(null);
        this.view2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
        if (BR.hide == variableId) {
            setHide((java.lang.Integer) variable);
        }
        else if (BR.item == variableId) {
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

    public void setHide(@Nullable java.lang.Integer Hide) {
        this.mHide = Hide;
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
            mDirtyFlags |= 0x4L;
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
                    mDirtyFlags |= 0x8L;
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
        int itemSelectedView2AndroidColorSelectedViewColorView2AndroidColorUnselectedViewColor = 0;
        boolean itemSelected = false;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        java.lang.String itemRestaurentName = null;

        if ((dirtyFlags & 0x19L) != 0) {


            if ((dirtyFlags & 0x11L) != 0) {

                    if (item != null) {
                        // read item.rateAndDistance
                        itemRateAndDistance = item.getRateAndDistance();
                        // read item.restaurentName
                        itemRestaurentName = item.getRestaurentName();
                    }
            }

                if (item != null) {
                    // read item.selected
                    itemSelected = item.isSelected();
                }
            if((dirtyFlags & 0x19L) != 0) {
                if(itemSelected) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read item.selected ? @android:color/selected_view_color : @android:color/unselected_view_color
                itemSelectedView2AndroidColorSelectedViewColorView2AndroidColorUnselectedViewColor = ((itemSelected) ? (getColorFromResource(view2, R.color.selected_view_color)) : (getColorFromResource(view2, R.color.unselected_view_color)));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView17, itemRestaurentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView18, itemRateAndDistance);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.view2, androidx.databinding.adapters.Converters.convertColorToDrawable(itemSelectedView2AndroidColorSelectedViewColorView2AndroidColorUnselectedViewColor));
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
        flag 1 (0x2L): hide
        flag 2 (0x3L): listener
        flag 3 (0x4L): item.selected
        flag 4 (0x5L): null
        flag 5 (0x6L): item.selected ? @android:color/selected_view_color : @android:color/unselected_view_color
        flag 6 (0x7L): item.selected ? @android:color/selected_view_color : @android:color/unselected_view_color
    flag mapping end*/
    //end
}