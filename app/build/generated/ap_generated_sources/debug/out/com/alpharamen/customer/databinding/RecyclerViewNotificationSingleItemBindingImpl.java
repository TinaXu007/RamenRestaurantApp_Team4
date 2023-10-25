package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewNotificationSingleItemBindingImpl extends RecyclerViewNotificationSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout_visible, 4);
        sViewsWithIds.put(R.id.view_notification_head, 5);
        sViewsWithIds.put(R.id.circleImageView, 6);
        sViewsWithIds.put(R.id.imageView_source, 7);
        sViewsWithIds.put(R.id.textView_source, 8);
        sViewsWithIds.put(R.id.textView_source_address, 9);
        sViewsWithIds.put(R.id.view_dotted_line, 10);
        sViewsWithIds.put(R.id.image_view_destination_loc, 11);
        sViewsWithIds.put(R.id.textView_destination_address, 12);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewNotificationSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private RecyclerViewNotificationSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[5]
            );
        this.cardViewNotification.setTag(null);
        this.constraintLayoutDetail.setTag(null);
        this.imageViewUpArrow.setTag(null);
        this.textViewNotification.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.NotificationItemModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
        }
        else if (BR.arrrow == variableId) {
            setArrrow((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.NotificationItemModel Item) {
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
    public void setArrrow(@Nullable java.lang.Integer Arrrow) {
        this.mArrrow = Arrrow;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem((com.alpharamen.customer.data.models.NotificationItemModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.alpharamen.customer.data.models.NotificationItemModel Item, int fieldId) {
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
        com.alpharamen.customer.data.models.NotificationItemModel item = mItem;
        int itemIdInt1ViewVISIBLEViewGONE = 0;
        int itemSelectedViewVISIBLEViewGONE = 0;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        boolean itemIdInt1 = false;
        boolean itemSelected = false;
        int itemId = 0;
        java.lang.String itemNotification = null;
        android.graphics.drawable.Drawable itemSelectedImageViewUpArrowAndroidDrawableIcUpArrowImageViewUpArrowAndroidDrawableIcKeyboardDownArrow = null;

        if ((dirtyFlags & 0x19L) != 0) {



                if (item != null) {
                    // read item.selected
                    itemSelected = item.isSelected();
                }
            if((dirtyFlags & 0x19L) != 0) {
                if(itemSelected) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
            }


                // read item.selected ? View.VISIBLE : View.GONE
                itemSelectedViewVISIBLEViewGONE = ((itemSelected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read item.selected ? @android:drawable/ic_up_arrow : @android:drawable/ic_keyboard_down_arrow
                itemSelectedImageViewUpArrowAndroidDrawableIcUpArrowImageViewUpArrowAndroidDrawableIcKeyboardDownArrow = ((itemSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imageViewUpArrow.getContext(), R.drawable.ic_up_arrow)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imageViewUpArrow.getContext(), R.drawable.ic_keyboard_down_arrow)));
            if ((dirtyFlags & 0x11L) != 0) {

                    if (item != null) {
                        // read item.id
                        itemId = item.getId();
                        // read item.notification
                        itemNotification = item.getNotification();
                    }


                    // read item.id == 1
                    itemIdInt1 = (itemId) == (1);
                if((dirtyFlags & 0x11L) != 0) {
                    if(itemIdInt1) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read item.id == 1 ? View.VISIBLE : View.GONE
                    itemIdInt1ViewVISIBLEViewGONE = ((itemIdInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cardViewNotification.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.constraintLayoutDetail.setVisibility(itemSelectedViewVISIBLEViewGONE);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imageViewUpArrow, itemSelectedImageViewUpArrowAndroidDrawableIcUpArrowImageViewUpArrowAndroidDrawableIcKeyboardDownArrow);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.imageViewUpArrow.setVisibility(itemIdInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewNotification, itemNotification);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.NotificationItemModel item = mItem;
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
        flag 2 (0x3L): arrrow
        flag 3 (0x4L): item.selected
        flag 4 (0x5L): null
        flag 5 (0x6L): item.id == 1 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): item.id == 1 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): item.selected ? View.VISIBLE : View.GONE
        flag 8 (0x9L): item.selected ? View.VISIBLE : View.GONE
        flag 9 (0xaL): item.selected ? @android:drawable/ic_up_arrow : @android:drawable/ic_keyboard_down_arrow
        flag 10 (0xbL): item.selected ? @android:drawable/ic_up_arrow : @android:drawable/ic_keyboard_down_arrow
    flag mapping end*/
    //end
}