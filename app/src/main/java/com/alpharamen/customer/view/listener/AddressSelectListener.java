package com.alpharamen.customer.view.listener;

import com.alpharamen.customer.data.models.AddressListModel;

public interface AddressSelectListener {

    void AddressSelect(AddressListModel model, String text);

    void AddressEdit(AddressListModel model, String text);

    void AddressSelectModel(AddressListModel model);
}
