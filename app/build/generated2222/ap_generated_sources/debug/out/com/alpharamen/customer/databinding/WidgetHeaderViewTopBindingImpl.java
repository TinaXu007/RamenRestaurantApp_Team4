package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class WidgetHeaderViewTopBindingImpl extends WidgetHeaderViewTopBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.alpharamen.customer.view.customview.HeaderView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public WidgetHeaderViewTopBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private WidgetHeaderViewTopBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.imageViewCart.setTag(null);
        this.imageViewPrevious.setTag(null);
        this.mboundView0 = (com.alpharamen.customer.view.customview.HeaderView) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewNoOfItemsCart.setTag(null);
        this.textViewRestName.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.alpharamen.customer.data.models.HubsListModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
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
    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
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
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;
        java.lang.String itemRestaurentName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.restaurentName
                    itemRestaurentName = item.getRestaurentName();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.imageViewCart.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.imageViewPrevious.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewNoOfItemsCart.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRestName, itemRestaurentName);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private android.view.View.OnClickListener value;
        public OnClickListenerImpl setValue(android.view.View.OnClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}