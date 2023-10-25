package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChangeAddressBindingImpl extends ActivityChangeAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_view_change_address, 3);
        sViewsWithIds.put(R.id.textView_house_name, 4);
        sViewsWithIds.put(R.id.card_view_house_name, 5);
        sViewsWithIds.put(R.id.edit_text_house_name, 6);
        sViewsWithIds.put(R.id.card_view_street_name, 7);
        sViewsWithIds.put(R.id.edit_text_street, 8);
        sViewsWithIds.put(R.id.card_view_city_name, 9);
        sViewsWithIds.put(R.id.edit_text_city, 10);
        sViewsWithIds.put(R.id.card_view_landmark, 11);
        sViewsWithIds.put(R.id.edit_text_landmark, 12);
        sViewsWithIds.put(R.id.card_view_pin_code, 13);
        sViewsWithIds.put(R.id.edit_text_pinCode, 14);
        sViewsWithIds.put(R.id.card_view_phone_number, 15);
        sViewsWithIds.put(R.id.edit_text_phone_number, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityChangeAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityChangeAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[16]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.imageViewNextArrow.setTag(null);
        this.imageViewPrevArrow.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.changeAddress == variableId) {
            setChangeAddress((com.alpharamen.customer.viewmodel.ChangeAddressViewModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChangeAddress(@Nullable com.alpharamen.customer.viewmodel.ChangeAddressViewModel ChangeAddress) {
        this.mChangeAddress = ChangeAddress;
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
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;

        if ((dirtyFlags & 0x6L) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.imageViewNextArrow.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.imageViewPrevArrow.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
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
        flag 0 (0x1L): changeAddress
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}