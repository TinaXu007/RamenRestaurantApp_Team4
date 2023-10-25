package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySearchBindingImpl extends ActivitySearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view_search_top, 5);
        sViewsWithIds.put(R.id.constraintLayout_search, 6);
        sViewsWithIds.put(R.id.recycler_view_search_items, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivitySearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivitySearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.editText2.setTag(null);
        this.imageViewFilter.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewFoods.setTag(null);
        this.textViewHubs.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.selection == variableId) {
            setSelection((java.lang.Integer) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.search == variableId) {
            setSearch((com.alpharamen.customer.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelection(@Nullable java.lang.Integer Selection) {
        this.mSelection = Selection;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.selection);
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
    public void setSearch(@Nullable com.alpharamen.customer.viewmodel.SearchViewModel Search) {
        this.mSearch = Search;
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
        boolean selectionInt1 = false;
        int selectionInt1TextViewFoodsAndroidColorUnselectedSwitchColorTextViewFoodsAndroidColorSelectedSwitchColor = 0;
        int selectionInt1TextViewFoodsAndroidColorSelectedSwitchColorTextViewFoodsAndroidColorUnselectedSwitchColor = 0;
        int selectionInt0TextViewHubsAndroidColorUnselectedSwitchColorTextViewHubsAndroidColorSelectedSwitchColor = 0;
        java.lang.Integer selection = mSelection;
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;
        int selectionInt0TextViewHubsAndroidColorSelectedSwitchColorTextViewHubsAndroidColorUnselectedSwitchColor = 0;
        boolean selectionInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxSelection = 0;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(selection)
                androidxDatabindingViewDataBindingSafeUnboxSelection = androidx.databinding.ViewDataBinding.safeUnbox(selection);


                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1
                selectionInt1 = (androidxDatabindingViewDataBindingSafeUnboxSelection) == (1);
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0
                selectionInt0 = (androidxDatabindingViewDataBindingSafeUnboxSelection) == (0);
            if((dirtyFlags & 0x9L) != 0) {
                if(selectionInt1) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x9L) != 0) {
                if(selectionInt0) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/unselected_switch_color : @android:color/selected_switch_color
                selectionInt1TextViewFoodsAndroidColorUnselectedSwitchColorTextViewFoodsAndroidColorSelectedSwitchColor = ((selectionInt1) ? (getColorFromResource(textViewFoods, R.color.unselected_switch_color)) : (getColorFromResource(textViewFoods, R.color.selected_switch_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/selected_switch_color : @android:color/unselected_switch_color
                selectionInt1TextViewFoodsAndroidColorSelectedSwitchColorTextViewFoodsAndroidColorUnselectedSwitchColor = ((selectionInt1) ? (getColorFromResource(textViewFoods, R.color.selected_switch_color)) : (getColorFromResource(textViewFoods, R.color.unselected_switch_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/unselected_switch_color : @android:color/selected_switch_color
                selectionInt0TextViewHubsAndroidColorUnselectedSwitchColorTextViewHubsAndroidColorSelectedSwitchColor = ((selectionInt0) ? (getColorFromResource(textViewHubs, R.color.unselected_switch_color)) : (getColorFromResource(textViewHubs, R.color.selected_switch_color)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/selected_switch_color : @android:color/unselected_switch_color
                selectionInt0TextViewHubsAndroidColorSelectedSwitchColorTextViewHubsAndroidColorUnselectedSwitchColor = ((selectionInt0) ? (getColorFromResource(textViewHubs, R.color.selected_switch_color)) : (getColorFromResource(textViewHubs, R.color.unselected_switch_color)));
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.editText2.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.imageViewFilter.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewFoods.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.textViewHubs.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.textViewFoods.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(selectionInt1TextViewFoodsAndroidColorSelectedSwitchColorTextViewFoodsAndroidColorUnselectedSwitchColor));
                this.textViewHubs.setBackgroundTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(selectionInt0TextViewHubsAndroidColorSelectedSwitchColorTextViewHubsAndroidColorUnselectedSwitchColor));
            }
            // api target 1

            this.textViewFoods.setTextColor(selectionInt1TextViewFoodsAndroidColorUnselectedSwitchColorTextViewFoodsAndroidColorSelectedSwitchColor);
            this.textViewHubs.setTextColor(selectionInt0TextViewHubsAndroidColorUnselectedSwitchColorTextViewHubsAndroidColorSelectedSwitchColor);
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
        flag 0 (0x1L): selection
        flag 1 (0x2L): listener
        flag 2 (0x3L): search
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/unselected_switch_color : @android:color/selected_switch_color
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/unselected_switch_color : @android:color/selected_switch_color
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/selected_switch_color : @android:color/unselected_switch_color
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 1 ? @android:color/selected_switch_color : @android:color/unselected_switch_color
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/unselected_switch_color : @android:color/selected_switch_color
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/unselected_switch_color : @android:color/selected_switch_color
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/selected_switch_color : @android:color/unselected_switch_color
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(selection) == 0 ? @android:color/selected_switch_color : @android:color/unselected_switch_color
    flag mapping end*/
    //end
}