package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBottomsheetLoginBindingImpl extends FragmentBottomsheetLoginBinding implements com.alpharamen.customer.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_bg, 6);
        sViewsWithIds.put(R.id.image_view_otp_head, 7);
        sViewsWithIds.put(R.id.text_view_otp_verification, 8);
        sViewsWithIds.put(R.id.text_view_phone, 9);
        sViewsWithIds.put(R.id.constraintLayout, 10);
        sViewsWithIds.put(R.id.text_view_resend_otp, 11);
        sViewsWithIds.put(R.id.text_view_verify, 12);
    }
    // views
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback23;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback21;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback20;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback22;
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentBottomsheetLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentBottomsheetLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.view.View) bindings[6]
            );
        this.bottomSheet.setTag(null);
        this.editTextFirstDigit.setTag(null);
        this.editTextFourthDigit.setTag(null);
        this.editTextSecondDigit.setTag(null);
        this.editTextThirdDigit.setTag(null);
        this.imageViewEditNumber.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.alpharamen.customer.generated.callback.AfterTextChanged(this, 4);
        mCallback21 = new com.alpharamen.customer.generated.callback.AfterTextChanged(this, 2);
        mCallback20 = new com.alpharamen.customer.generated.callback.AfterTextChanged(this, 1);
        mCallback22 = new com.alpharamen.customer.generated.callback.AfterTextChanged(this, 3);
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
        if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.alpharamen.customer.view.ui.login.BottomFragment.EditTextInterface) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.alpharamen.customer.view.ui.login.BottomFragment.EditTextInterface Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
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
        com.alpharamen.customer.view.ui.login.BottomFragment.EditTextInterface callback = mCallback;

        if ((dirtyFlags & 0x5L) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextFirstDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback20, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextFourthDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback23, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextSecondDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback21, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextThirdDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback22, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.imageViewEditNumber.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
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
    public final void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // callback
                com.alpharamen.customer.view.ui.login.BottomFragment.EditTextInterface callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onTextChanged(editTextFourthDigit, callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // callback
                com.alpharamen.customer.view.ui.login.BottomFragment.EditTextInterface callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onTextChanged(editTextSecondDigit, callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // callback
                com.alpharamen.customer.view.ui.login.BottomFragment.EditTextInterface callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onTextChanged(editTextFirstDigit, callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // callback
                com.alpharamen.customer.view.ui.login.BottomFragment.EditTextInterface callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onTextChanged(editTextThirdDigit, callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listener
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}