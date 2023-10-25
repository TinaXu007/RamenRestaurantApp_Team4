package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NotificationRowItemBindingImpl extends NotificationRowItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NotificationRowItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private NotificationRowItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.imgSample.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtDesc.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.NotificationModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.NotificationModel Item) {
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
                return onChangeItem((com.alpharamen.customer.data.models.NotificationModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.alpharamen.customer.data.models.NotificationModel Item, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.imageUrl) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.categoryName) {
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
        java.lang.String itemImageUrl = null;
        com.alpharamen.customer.data.models.NotificationModel item = mItem;
        java.lang.String itemCategoryName = null;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;

        if ((dirtyFlags & 0x1dL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (item != null) {
                        // read item.imageUrl
                        itemImageUrl = item.getImageUrl();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (item != null) {
                        // read item.categoryName
                        itemCategoryName = item.getCategoryName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.alpharamen.customer.view.adapter.BindingAdapters.loadImage(this.imgSample, itemImageUrl);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDesc, itemCategoryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, itemCategoryName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {


            if ((txtTitle) != (null)) {


                txtTitle.getText();
                if ((txtTitle.getText()) != (null)) {


                    txtTitle.getText().toString();

                    listener.onAdapterString(txtTitle.getText().toString());
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): listener
        flag 2 (0x3L): item.imageUrl
        flag 3 (0x4L): item.categoryName
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}