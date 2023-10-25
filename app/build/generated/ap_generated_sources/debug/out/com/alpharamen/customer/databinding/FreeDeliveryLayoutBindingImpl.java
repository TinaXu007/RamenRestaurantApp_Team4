package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FreeDeliveryLayoutBindingImpl extends FreeDeliveryLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline3, 21);
        sViewsWithIds.put(R.id.guideline4, 22);
        sViewsWithIds.put(R.id.view2, 23);
        sViewsWithIds.put(R.id.text_view_rupees, 24);
        sViewsWithIds.put(R.id.text_view_coma_first, 25);
        sViewsWithIds.put(R.id.text_view_stars_first, 26);
        sViewsWithIds.put(R.id.view5, 27);
        sViewsWithIds.put(R.id.text_view_rupees2, 28);
        sViewsWithIds.put(R.id.text_view_coma_second, 29);
        sViewsWithIds.put(R.id.text_view_stars_second, 30);
        sViewsWithIds.put(R.id.view7, 31);
        sViewsWithIds.put(R.id.text_view_rupees3, 32);
        sViewsWithIds.put(R.id.text_view_coma_third, 33);
        sViewsWithIds.put(R.id.text_view_stars_third, 34);
        sViewsWithIds.put(R.id.view8, 35);
        sViewsWithIds.put(R.id.text_view_rupees4, 36);
        sViewsWithIds.put(R.id.text_view_coma_fourth, 37);
        sViewsWithIds.put(R.id.text_view_stars_fourth, 38);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FreeDeliveryLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 39, sIncludes, sViewsWithIds));
    }
    private FreeDeliveryLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[21]
            , (androidx.constraintlayout.widget.Guideline) bindings[22]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[38]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[34]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[35]
            );
        this.cardViewFirst.setTag(null);
        this.cardViewFourth.setTag(null);
        this.cardViewSecond.setTag(null);
        this.cardViewThird.setTag(null);
        this.imageView10.setTag(null);
        this.imageView13.setTag(null);
        this.imageView15.setTag(null);
        this.imageView8.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewFirst.setTag(null);
        this.textViewItemNameFourth.setTag(null);
        this.textViewItemNameSecond.setTag(null);
        this.textViewItemNameThird.setTag(null);
        this.textViewRateFirst.setTag(null);
        this.textViewRateFourth.setTag(null);
        this.textViewRateSecond.setTag(null);
        this.textViewRateThird.setTag(null);
        this.textViewRating.setTag(null);
        this.textViewRatingFourth.setTag(null);
        this.textViewRatingSecond.setTag(null);
        this.textViewRatingThird.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.itemFourth == variableId) {
            setItemFourth((com.alpharamen.customer.data.models.FreeDeliveryListItemsModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.itemThird == variableId) {
            setItemThird((com.alpharamen.customer.data.models.FreeDeliveryListItemsModel) variable);
        }
        else if (BR.itemFirst == variableId) {
            setItemFirst((com.alpharamen.customer.data.models.FreeDeliveryListItemsModel) variable);
        }
        else if (BR.itemSecond == variableId) {
            setItemSecond((com.alpharamen.customer.data.models.FreeDeliveryListItemsModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemFourth(@Nullable com.alpharamen.customer.data.models.FreeDeliveryListItemsModel ItemFourth) {
        this.mItemFourth = ItemFourth;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemFourth);
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
    public void setItemThird(@Nullable com.alpharamen.customer.data.models.FreeDeliveryListItemsModel ItemThird) {
        this.mItemThird = ItemThird;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.itemThird);
        super.requestRebind();
    }
    public void setItemFirst(@Nullable com.alpharamen.customer.data.models.FreeDeliveryListItemsModel ItemFirst) {
        this.mItemFirst = ItemFirst;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.itemFirst);
        super.requestRebind();
    }
    public void setItemSecond(@Nullable com.alpharamen.customer.data.models.FreeDeliveryListItemsModel ItemSecond) {
        this.mItemSecond = ItemSecond;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.itemSecond);
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
        java.lang.String itemFourthImage = null;
        java.lang.String itemSecondRating = null;
        java.lang.String itemFourthProductTitle = null;
        com.alpharamen.customer.data.models.FreeDeliveryListItemsModel itemFourth = mItemFourth;
        android.view.View.OnClickListener listenerOnClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener listener = mListener;
        com.alpharamen.customer.data.models.FreeDeliveryListItemsModel itemThird = mItemThird;
        java.lang.String itemFirstRating = null;
        java.lang.String itemThirdProductTitle = null;
        java.lang.String itemThirdRating = null;
        java.lang.String itemSecondProductTitle = null;
        java.lang.String itemFirstRate = null;
        java.lang.String itemFirstProductTitle = null;
        com.alpharamen.customer.data.models.FreeDeliveryListItemsModel itemFirst = mItemFirst;
        java.lang.String itemThirdImage = null;
        java.lang.String itemThirdRate = null;
        java.lang.String itemFourthRate = null;
        java.lang.String itemFirstImage = null;
        com.alpharamen.customer.data.models.FreeDeliveryListItemsModel itemSecond = mItemSecond;
        java.lang.String itemSecondImage = null;
        java.lang.String itemFourthRating = null;
        java.lang.String itemSecondRate = null;

        if ((dirtyFlags & 0x21L) != 0) {



                if (itemFourth != null) {
                    // read itemFourth.image
                    itemFourthImage = itemFourth.getImage();
                    // read itemFourth.productTitle
                    itemFourthProductTitle = itemFourth.getProductTitle();
                    // read itemFourth.rate
                    itemFourthRate = itemFourth.getRate();
                    // read itemFourth.rating
                    itemFourthRating = itemFourth.getRating();
                }
        }
        if ((dirtyFlags & 0x22L) != 0) {



                if (listener != null) {
                    // read listener::onClick
                    listenerOnClickAndroidViewViewOnClickListener = (((mListenerOnClickAndroidViewViewOnClickListener == null) ? (mListenerOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        if ((dirtyFlags & 0x24L) != 0) {



                if (itemThird != null) {
                    // read itemThird.productTitle
                    itemThirdProductTitle = itemThird.getProductTitle();
                    // read itemThird.rating
                    itemThirdRating = itemThird.getRating();
                    // read itemThird.image
                    itemThirdImage = itemThird.getImage();
                    // read itemThird.rate
                    itemThirdRate = itemThird.getRate();
                }
        }
        if ((dirtyFlags & 0x28L) != 0) {



                if (itemFirst != null) {
                    // read itemFirst.rating
                    itemFirstRating = itemFirst.getRating();
                    // read itemFirst.rate
                    itemFirstRate = itemFirst.getRate();
                    // read itemFirst.productTitle
                    itemFirstProductTitle = itemFirst.getProductTitle();
                    // read itemFirst.image
                    itemFirstImage = itemFirst.getImage();
                }
        }
        if ((dirtyFlags & 0x30L) != 0) {



                if (itemSecond != null) {
                    // read itemSecond.rating
                    itemSecondRating = itemSecond.getRating();
                    // read itemSecond.productTitle
                    itemSecondProductTitle = itemSecond.getProductTitle();
                    // read itemSecond.image
                    itemSecondImage = itemSecond.getImage();
                    // read itemSecond.rate
                    itemSecondRate = itemSecond.getRate();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            this.cardViewFirst.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.cardViewFourth.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.cardViewSecond.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
            this.cardViewThird.setOnClickListener(listenerOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            com.alpharamen.customer.view.adapter.BindingAdapters.loadImage(this.imageView10, itemSecondImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewItemNameSecond, itemSecondProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRateSecond, itemSecondRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRatingSecond, itemSecondRating);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            com.alpharamen.customer.view.adapter.BindingAdapters.loadImage(this.imageView13, itemThirdImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewItemNameThird, itemThirdProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRateThird, itemThirdRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRatingThird, itemThirdRating);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            com.alpharamen.customer.view.adapter.BindingAdapters.loadImage(this.imageView15, itemFourthImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewItemNameFourth, itemFourthProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRateFourth, itemFourthRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRatingFourth, itemFourthRating);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            com.alpharamen.customer.view.adapter.BindingAdapters.loadImage(this.imageView8, itemFirstImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewFirst, itemFirstProductTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRateFirst, itemFirstRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRating, itemFirstRating);
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
        flag 0 (0x1L): itemFourth
        flag 1 (0x2L): listener
        flag 2 (0x3L): itemThird
        flag 3 (0x4L): itemFirst
        flag 4 (0x5L): itemSecond
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}