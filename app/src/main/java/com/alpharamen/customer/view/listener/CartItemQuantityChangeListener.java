package com.alpharamen.customer.view.listener;

import com.alpharamen.customer.data.models.CartItemModel;

public interface CartItemQuantityChangeListener {

    void increaseQuantity(CartItemModel cartItemModel);

    void decreaseQuantity(CartItemModel cartItemModel);

}
