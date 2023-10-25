package com.alpharamen.customer.databinding;
import com.alpharamen.customer.R;
import com.alpharamen.customer.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerViewAddressListSingleItemBindingImpl extends RecyclerViewAddressListSingleItemBinding implements com.alpharamen.customer.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view_address, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerViewAddressListSingleItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RecyclerViewAddressListSingleItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[2]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[1]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[3]
            , (com.alpharamen.customer.view.customview.WacTextView) bindings[4]
            );
        this.imageViewEdit.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewAddress.setTag(null);
        this.textViewPersonName.setTag(null);
        this.textViewPhoneNumber.setTag(null);
        this.textViewSelect.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.alpharamen.customer.generated.callback.OnClickListener(this, 1);
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
        if (BR.item == variableId) {
            setItem((com.alpharamen.customer.data.models.AddressListModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.alpharamen.customer.view.listener.AddressSelectListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.alpharamen.customer.data.models.AddressListModel Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setListener(@Nullable com.alpharamen.customer.view.listener.AddressSelectListener Listener) {
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
        java.lang.String itemHouseNameJavaLangString = null;
        com.alpharamen.customer.data.models.AddressListModel item = mItem;
        java.lang.String itemPhone = null;
        java.lang.String itemHouseNameJavaLangStringItemStreetJavaLangString = null;
        java.lang.String itemLandmark = null;
        com.alpharamen.customer.view.listener.AddressSelectListener listener = mListener;
        java.lang.String itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangString = null;
        java.lang.String itemHouseName = null;
        java.lang.String itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCity = null;
        java.lang.String itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmark = null;
        java.lang.String itemCity = null;
        java.lang.String itemHouseNameJavaLangStringItemStreet = null;
        java.lang.String itemName = null;
        java.lang.String itemStreet = null;
        java.lang.String itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCityJavaLangStringItemPincode = null;
        java.lang.String itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCityJavaLangString = null;
        java.lang.String itemPincode = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.phone
                    itemPhone = item.getPhone();
                    // read item.landmark
                    itemLandmark = item.getLandmark();
                    // read item.houseName
                    itemHouseName = item.getHouseName();
                    // read item.city
                    itemCity = item.getCity();
                    // read item.name
                    itemName = item.getName();
                    // read item.street
                    itemStreet = item.getStreet();
                    // read item.pincode
                    itemPincode = item.getPincode();
                }


                // read (item.houseName) + (",")
                itemHouseNameJavaLangString = (itemHouseName) + (",");


                // read ((item.houseName) + (",")) + (item.street)
                itemHouseNameJavaLangStringItemStreet = (itemHouseNameJavaLangString) + (itemStreet);


                // read (((item.houseName) + (",")) + (item.street)) + (",")
                itemHouseNameJavaLangStringItemStreetJavaLangString = (itemHouseNameJavaLangStringItemStreet) + (",");


                // read ((((item.houseName) + (",")) + (item.street)) + (",")) + (item.landmark)
                itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmark = (itemHouseNameJavaLangStringItemStreetJavaLangString) + (itemLandmark);


                // read (((((item.houseName) + (",")) + (item.street)) + (",")) + (item.landmark)) + (",")
                itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangString = (itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmark) + (",");


                // read ((((((item.houseName) + (",")) + (item.street)) + (",")) + (item.landmark)) + (",")) + (item.city)
                itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCity = (itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangString) + (itemCity);


                // read (((((((item.houseName) + (",")) + (item.street)) + (",")) + (item.landmark)) + (",")) + (item.city)) + (",")
                itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCityJavaLangString = (itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCity) + (",");


                // read ((((((((item.houseName) + (",")) + (item.street)) + (",")) + (item.landmark)) + (",")) + (item.city)) + (",")) + (item.pincode)
                itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCityJavaLangStringItemPincode = (itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCityJavaLangString) + (itemPincode);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.imageViewEdit.setOnClickListener(mCallback2);
            this.textViewSelect.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewAddress, itemHouseNameJavaLangStringItemStreetJavaLangStringItemLandmarkJavaLangStringItemCityJavaLangStringItemPincode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewPersonName, itemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewPhoneNumber, itemPhone);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // item
                com.alpharamen.customer.data.models.AddressListModel item = mItem;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // listener
                com.alpharamen.customer.view.listener.AddressSelectListener listener = mListener;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {




                    listener.AddressEdit(item, "edit");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // item
                com.alpharamen.customer.data.models.AddressListModel item = mItem;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // listener
                com.alpharamen.customer.view.listener.AddressSelectListener listener = mListener;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {




                    listener.AddressSelect(item, "select");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}