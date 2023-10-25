package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewDishTypeSingleItemBindingImpl extends RecyclerViewDishTypeSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.view.View mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewDishTypeSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RecyclerViewDishTypeSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.cardViewItem.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.view.View) bindings[1];
        this.mboundView1.setTag(null);
        this.textView25.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
            setItem((com.alpharamen.customer.data.models.DishTypeModel) variable);
        }
        else if (BR.isLast == variableId) {
            setIsLast((java.lang.Boolean) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.OnAdapterSelectedListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.DishTypeModel Item) {
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
                return onChangeItem((com.alpharamen.customer.data.models.DishTypeModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem(com.alpharamen.customer.data.models.DishTypeModel Item, int fieldId) {
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
        com.alpharamen.customer.data.models.DishTypeModel item = mItem;
        int isLastViewVISIBLEViewGONE = 0;
        int itemSelectedTextView25AndroidColorColorWhiteTextView25AndroidColorProjectRed = 0;
        boolean itemSelected = false;
        java.lang.Boolean isLast = mIsLast;
        java.lang.String itemDishType = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLast = false;
        com.alpharamen.customer.view.listener.OnAdapterSelectedListener<?> listener = mListener;
        int itemSelectedTextView25AndroidColorProjectRedTextView25AndroidColorColorWhite = 0;

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


                // read item.selected ? @android:color/colorWhite : @android:color/project_red
                itemSelectedTextView25AndroidColorColorWhiteTextView25AndroidColorProjectRed = ((itemSelected) ? (getColorFromResource(textView25, R.color.colorWhite)) : (getColorFromResource(textView25, R.color.project_red)));
                // read item.selected ? @android:color/project_red : @android:color/colorWhite
                itemSelectedTextView25AndroidColorProjectRedTextView25AndroidColorColorWhite = ((itemSelected) ? (getColorFromResource(textView25, R.color.project_red)) : (getColorFromResource(textView25, R.color.colorWhite)));
            if ((dirtyFlags & 0x11L) != 0) {

                    if (item != null) {
                        // read item.dishType
                        itemDishType = item.getDishType();
                    }
            }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast)
                androidxDatabindingViewDataBindingSafeUnboxIsLast = androidx.databinding.ViewDataBinding.safeUnbox(isLast);
            if((dirtyFlags & 0x12L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLast) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
                isLastViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsLast) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cardViewItem.setOnClickListener(mCallback12);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(isLastViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.textView25, androidx.databinding.adapters.Converters.convertColorToDrawable(itemSelectedTextView25AndroidColorProjectRedTextView25AndroidColorColorWhite));
            this.textView25.setTextColor(itemSelectedTextView25AndroidColorColorWhiteTextView25AndroidColorProjectRed);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView25, itemDishType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.alpharamen.customer.data.models.DishTypeModel item = mItem;
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
        flag 1 (0x2L): isLast
        flag 2 (0x3L): listener
        flag 3 (0x4L): item.selected
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isLast) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): item.selected ? @android:color/colorWhite : @android:color/project_red
        flag 8 (0x9L): item.selected ? @android:color/colorWhite : @android:color/project_red
        flag 9 (0xaL): item.selected ? @android:color/project_red : @android:color/colorWhite
        flag 10 (0xbL): item.selected ? @android:color/project_red : @android:color/colorWhite
    flag mapping end*/
    //end
}