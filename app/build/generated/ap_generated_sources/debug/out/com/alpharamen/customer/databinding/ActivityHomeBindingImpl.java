package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_container, 15);
        sViewsWithIds.put(R.id.card_view_search_top, 16);
        sViewsWithIds.put(R.id.constraintLayout_search, 17);
        sViewsWithIds.put(R.id.no_network_layout, 18);
        sViewsWithIds.put(R.id.textView56, 19);
        sViewsWithIds.put(R.id.textView55, 20);
        sViewsWithIds.put(R.id.imageView17, 21);
        sViewsWithIds.put(R.id.constraintLayout_bottom_bar, 22);
        sViewsWithIds.put(R.id.image_view_profile, 23);
        sViewsWithIds.put(R.id.image_view_notification, 24);
        sViewsWithIds.put(R.id.image_view_cart, 25);
        sViewsWithIds.put(R.id.image_view_offers, 26);
        sViewsWithIds.put(R.id.view3, 27);
        sViewsWithIds.put(R.id.image_view_near_me, 28);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (android.widget.EditText) bindings[1]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[27]
            );
        this.editTextSearch.setTag(null);
        this.linearLayoutCart.setTag(null);
        this.linearLayoutNearMe.setTag(null);
        this.linearLayoutNotification.setTag(null);
        this.linearLayoutOffers.setTag(null);
        this.linearLayoutProfile.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewCart.setTag(null);
        this.textViewFoods.setTag(null);
        this.textViewHubs.setTag(null);
        this.textViewNearMe.setTag(null);
        this.textViewNotification.setTag(null);
        this.textViewOffers.setTag(null);
        this.textViewProfile.setTag(null);
        this.textViewRetry.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.bottomSelection == variableId) {
            setBottomSelection((java.lang.Integer) variable);
        }
        else if (BR.home == variableId) {
            setHome((com.alpharamen.customer.viewmodel.HomeViewModel) variable);
        }
        else if (BR.selection == variableId) {
            setSelection((java.lang.Integer) variable);
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
    public void setBottomSelection(@Nullable java.lang.Integer BottomSelection) {
        this.mBottomSelection = BottomSelection;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.bottomSelection);
        super.requestRebind();
    }
    public void setHome(@Nullable com.alpharamen.customer.viewmodel.HomeViewModel Home) {
        this.mHome = Home;
    }
    public void setSelection(@Nullable java.lang.Integer Selection) {
        this.mSelection = Selection;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.selection);
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
        int bottomSelectionInt3TextViewNotificationAndroidColorColorAccentTextViewNotificationAndroidColorUnselectedBottomNavColor = 0;
        boolean bottomSelectionInt1 = false;
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;
        int bottomSelectionInt4TextViewProfileAndroidColorColorAccentTextViewProfileAndroidColorUnselectedBottomNavColor = 0;
        int bottomSelectionInt0TextViewNearMeAndroidColorColorAccentTextViewNearMeAndroidColorUnselectedBottomNavColor = 0;
        int selectionInt1TextViewFoodsAndroidColorSelectedSwitchColorTextViewFoodsAndroidColorColorWhite = 0;
        int bottomSelectionInt2TextViewCartAndroidColorColorAccentTextViewCartAndroidColorUnselectedBottomNavColor = 0;
        int selectionInt1TextViewFoodsAndroidColorColorWhiteTextViewFoodsAndroidColorSelectedSwitchColor = 0;
        int androidxDatabindingViewDataBindingSafeUnboxBottomSelection = 0;
        int androidxDatabindingViewDataBindingSafeUnboxSelection = 0;
        boolean bottomSelectionInt2 = false;
        java.lang.Integer bottomSelection = mBottomSelection;
        boolean selectionInt1 = false;
        int selectionInt0TextViewHubsAndroidColorColorAccentTextViewHubsAndroidColorColorWhite = 0;
        boolean bottomSelectionInt3 = false;
        java.lang.Integer selection = mSelection;
        int selectionInt0TextViewHubsAndroidColorColorWhiteTextViewHubsAndroidColorColorAccent = 0;
        boolean bottomSelectionInt0 = false;
        boolean selectionInt0 = false;
        boolean bottomSelectionInt4 = false;
        int bottomSelectionInt1TextViewOffersAndroidColorColorAccentTextViewOffersAndroidColorUnselectedBottomNavColor = 0;

        if ((dirtyFlags & 0x11L) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection)
                androidxDatabindingViewDataBindingSafeUnboxBottomSelection = androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection);


                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 1
                bottomSelectionInt1 = (androidxDatabindingViewDataBindingSafeUnboxBottomSelection) == (1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 2
                bottomSelectionInt2 = (androidxDatabindingViewDataBindingSafeUnboxBottomSelection) == (2);
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 3
                bottomSelectionInt3 = (androidxDatabindingViewDataBindingSafeUnboxBottomSelection) == (3);
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 0
                bottomSelectionInt0 = (androidxDatabindingViewDataBindingSafeUnboxBottomSelection) == (0);
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 4
                bottomSelectionInt4 = (androidxDatabindingViewDataBindingSafeUnboxBottomSelection) == (4);
            if((dirtyFlags & 0x12L) != 0) {
                if(bottomSelectionInt1) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
            if((dirtyFlags & 0x12L) != 0) {
                if(bottomSelectionInt2) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x12L) != 0) {
                if(bottomSelectionInt3) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x12L) != 0) {
                if(bottomSelectionInt0) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x12L) != 0) {
                if(bottomSelectionInt4) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 1 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
                bottomSelectionInt1TextViewOffersAndroidColorColorAccentTextViewOffersAndroidColorUnselectedBottomNavColor = ((bottomSelectionInt1) ? (getColorFromResource(textViewOffers, R.color.colorAccent)) : (getColorFromResource(textViewOffers, R.color.unselected_bottom_nav_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 2 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
                bottomSelectionInt2TextViewCartAndroidColorColorAccentTextViewCartAndroidColorUnselectedBottomNavColor = ((bottomSelectionInt2) ? (getColorFromResource(textViewCart, R.color.colorAccent)) : (getColorFromResource(textViewCart, R.color.unselected_bottom_nav_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 3 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
                bottomSelectionInt3TextViewNotificationAndroidColorColorAccentTextViewNotificationAndroidColorUnselectedBottomNavColor = ((bottomSelectionInt3) ? (getColorFromResource(textViewNotification, R.color.colorAccent)) : (getColorFromResource(textViewNotification, R.color.unselected_bottom_nav_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 0 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
                bottomSelectionInt0TextViewNearMeAndroidColorColorAccentTextViewNearMeAndroidColorUnselectedBottomNavColor = ((bottomSelectionInt0) ? (getColorFromResource(textViewNearMe, R.color.colorAccent)) : (getColorFromResource(textViewNearMe, R.color.unselected_bottom_nav_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 4 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
                bottomSelectionInt4TextViewProfileAndroidColorColorAccentTextViewProfileAndroidColorUnselectedBottomNavColor = ((bottomSelectionInt4) ? (getColorFromResource(textViewProfile, R.color.colorAccent)) : (getColorFromResource(textViewProfile, R.color.unselected_bottom_nav_color)));
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(selection)
                androidxDatabindingViewDataBindingSafeUnboxSelection = androidx.databinding.ViewDataBinding.safeUnbox(selection);


                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1
                selectionInt1 = (androidxDatabindingViewDataBindingSafeUnboxSelection) == (1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0
                selectionInt0 = (androidxDatabindingViewDataBindingSafeUnboxSelection) == (0);
            if((dirtyFlags & 0x18L) != 0) {
                if(selectionInt1) {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x18L) != 0) {
                if(selectionInt0) {
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x80000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/selected_switch_color : @android:color/colorWhite
                selectionInt1TextViewFoodsAndroidColorSelectedSwitchColorTextViewFoodsAndroidColorColorWhite = ((selectionInt1) ? (getColorFromResource(textViewFoods, R.color.selected_switch_color)) : (getColorFromResource(textViewFoods, R.color.colorWhite)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/colorWhite : @android:color/selected_switch_color
                selectionInt1TextViewFoodsAndroidColorColorWhiteTextViewFoodsAndroidColorSelectedSwitchColor = ((selectionInt1) ? (getColorFromResource(textViewFoods, R.color.colorWhite)) : (getColorFromResource(textViewFoods, R.color.selected_switch_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/colorAccent : @android:color/colorWhite
                selectionInt0TextViewHubsAndroidColorColorAccentTextViewHubsAndroidColorColorWhite = ((selectionInt0) ? (getColorFromResource(textViewHubs, R.color.colorAccent)) : (getColorFromResource(textViewHubs, R.color.colorWhite)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/colorWhite : @android:color/colorAccent
                selectionInt0TextViewHubsAndroidColorColorWhiteTextViewHubsAndroidColorColorAccent = ((selectionInt0) ? (getColorFromResource(textViewHubs, R.color.colorWhite)) : (getColorFromResource(textViewHubs, R.color.colorAccent)));
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.editTextSearch.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.linearLayoutCart.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.linearLayoutNearMe.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.linearLayoutNotification.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.linearLayoutOffers.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.linearLayoutProfile.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewCart.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewFoods.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewHubs.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewOffers.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewRetry.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.textViewCart.setTextColor(bottomSelectionInt2TextViewCartAndroidColorColorAccentTextViewCartAndroidColorUnselectedBottomNavColor);
            this.textViewNearMe.setTextColor(bottomSelectionInt0TextViewNearMeAndroidColorColorAccentTextViewNearMeAndroidColorUnselectedBottomNavColor);
            this.textViewNotification.setTextColor(bottomSelectionInt3TextViewNotificationAndroidColorColorAccentTextViewNotificationAndroidColorUnselectedBottomNavColor);
            this.textViewOffers.setTextColor(bottomSelectionInt1TextViewOffersAndroidColorColorAccentTextViewOffersAndroidColorUnselectedBottomNavColor);
            this.textViewProfile.setTextColor(bottomSelectionInt4TextViewProfileAndroidColorColorAccentTextViewProfileAndroidColorUnselectedBottomNavColor);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.textViewFoods.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(selectionInt1TextViewFoodsAndroidColorSelectedSwitchColorTextViewFoodsAndroidColorColorWhite));
                this.textViewHubs.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(selectionInt0TextViewHubsAndroidColorColorAccentTextViewHubsAndroidColorColorWhite));
            }
            // api target 1

            this.textViewFoods.setTextColor(selectionInt1TextViewFoodsAndroidColorColorWhiteTextViewFoodsAndroidColorSelectedSwitchColor);
            this.textViewHubs.setTextColor(selectionInt0TextViewHubsAndroidColorColorWhiteTextViewHubsAndroidColorColorAccent);
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
        flag 0 (0x1L): listener
        flag 1 (0x2L): bottomSelection
        flag 2 (0x3L): home
        flag 3 (0x4L): selection
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 3 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 3 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 4 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 4 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 0 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 0 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/selected_switch_color : @android:color/colorWhite
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/selected_switch_color : @android:color/colorWhite
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 2 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 2 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/colorWhite : @android:color/selected_switch_color
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/colorWhite : @android:color/selected_switch_color
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/colorAccent : @android:color/colorWhite
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/colorAccent : @android:color/colorWhite
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/colorWhite : @android:color/colorAccent
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/colorWhite : @android:color/colorAccent
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 1 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(bottomSelection) == 1 ? @android:color/colorAccent : @android:color/unselected_bottom_nav_color
    flag mapping end*/
    //end
}