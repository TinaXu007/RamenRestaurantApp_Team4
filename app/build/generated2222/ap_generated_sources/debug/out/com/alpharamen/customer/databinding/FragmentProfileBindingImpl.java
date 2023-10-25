package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView_profile_heading, 8);
        sViewsWithIds.put(R.id.circleImageView, 9);
        sViewsWithIds.put(R.id.textView42, 10);
        sViewsWithIds.put(R.id.imageView_edit, 11);
        sViewsWithIds.put(R.id.text_view_change_location, 12);
        sViewsWithIds.put(R.id.text_view_my_orders, 13);
        sViewsWithIds.put(R.id.textView_edit_profile, 14);
        sViewsWithIds.put(R.id.imageView_notification, 15);
        sViewsWithIds.put(R.id.view1, 16);
        sViewsWithIds.put(R.id.switch1, 17);
        sViewsWithIds.put(R.id.image_view_about, 18);
        sViewsWithIds.put(R.id.view_about, 19);
        sViewsWithIds.put(R.id.image_view_rate_app, 20);
        sViewsWithIds.put(R.id.view_rate_app, 21);
        sViewsWithIds.put(R.id.image_view_share_app, 22);
        sViewsWithIds.put(R.id.view_share_app, 23);
        sViewsWithIds.put(R.id.image_view_logout, 24);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[9]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.Switch) bindings[17]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[23]
            );
        this.imageViewChangeLocation.setTag(null);
        this.imageViewOrders.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewAbout.setTag(null);
        this.textViewLogout.setTag(null);
        this.textViewNotification.setTag(null);
        this.textViewRateApp.setTag(null);
        this.textViewShareApp.setTag(null);
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
        if (BR.profile == variableId) {
            setProfile((com.alpharamen.customer.data.models.ProfileModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfile(@Nullable com.alpharamen.customer.data.models.ProfileModel Profile) {
        this.mProfile = Profile;
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
                return onChangeProfile((com.alpharamen.customer.data.models.ProfileModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProfile(com.alpharamen.customer.data.models.ProfileModel Profile, int fieldId) {
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

            this.imageViewChangeLocation.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.imageViewOrders.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewAbout.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewLogout.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewNotification.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewRateApp.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewShareApp.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
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
        flag 0 (0x1L): profile
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}