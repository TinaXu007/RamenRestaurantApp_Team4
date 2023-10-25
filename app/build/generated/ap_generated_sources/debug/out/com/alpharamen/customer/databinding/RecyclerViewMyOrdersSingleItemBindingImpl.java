package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewMyOrdersSingleItemBindingImpl extends RecyclerViewMyOrdersSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout_visible, 5);
        sViewsWithIds.put(R.id.view_visible, 6);
        sViewsWithIds.put(R.id.circleImageView, 7);
        sViewsWithIds.put(R.id.ratingBar, 8);
        sViewsWithIds.put(R.id.text_view_status, 9);
        sViewsWithIds.put(R.id.constraintLayout_detail, 10);
        sViewsWithIds.put(R.id.imageView_source_loc, 11);
        sViewsWithIds.put(R.id.text_view_rest_name, 12);
        sViewsWithIds.put(R.id.textView_source_address, 13);
        sViewsWithIds.put(R.id.view_dotted_line, 14);
        sViewsWithIds.put(R.id.image_view_destination_loc, 15);
        sViewsWithIds.put(R.id.textView_destination_address, 16);
        sViewsWithIds.put(R.id.text_view_reorder, 17);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewMyOrdersSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private RecyclerViewMyOrdersSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.RatingBar) bindings[8]
            , (android.widget.TextView) bindings[16]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[2]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[1]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[3]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[17]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[9]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[6]
            );
        this.cardViewMyOrders.setTag(null);
        this.textViewHubName.setTag(null);
        this.textViewItemName.setTag(null);
        this.textViewRate.setTag(null);
        this.viewBottom.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.MyordersItemModel) variable);
        }
        else if (BR.isLast == variableId) {
            setIsLast((java.lang.Boolean) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.MyOrdersListItemClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.MyordersItemModel Item) {
        updateRegistration(0, Item);
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
    public void setListener(@Nullable com.alpharamen.customer.view.listener.MyOrdersListItemClickListener Listener) {
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
                return onChangeItem((com.alpharamen.customer.data.models.MyordersItemModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.alpharamen.customer.data.models.MyordersItemModel Item, int fieldId) {
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
        com.alpharamen.customer.data.models.MyordersItemModel item = mItem;
        int isLastViewVISIBLEViewGONE = 0;
        java.lang.String itemRestName = null;
        java.lang.String itemRate = null;
        java.lang.Boolean isLast = mIsLast;
        com.alpharamen.customer.view.listener.MyOrdersListItemClickListener listener = mListener;
        java.lang.String itemItemname = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLast = false;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.restName
                    itemRestName = item.getRestName();
                    // read item.rate
                    itemRate = item.getRate();
                    // read item.itemname
                    itemItemname = item.getItemname();
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
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cardViewMyOrders.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHubName, itemRestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewItemName, itemItemname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRate, itemRate);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.viewBottom.setVisibility(isLastViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.MyordersItemModel item = mItem;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.alpharamen.customer.view.listener.MyOrdersListItemClickListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listener.click(item);
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