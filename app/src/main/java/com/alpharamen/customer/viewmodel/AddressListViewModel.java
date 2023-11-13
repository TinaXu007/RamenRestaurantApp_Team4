package com.alpharamen.customer.viewmodel;

import com.alpharamen.customer.base.BaseViewModel;
import com.alpharamen.customer.data.repository.FoodRepository;

import javax.inject.Inject;

public class AddressListViewModel extends BaseViewModel {

    private FoodRepository addressListRepository;

    @Inject
    public AddressListViewModel(FoodRepository addressListRepository) {
        this.addressListRepository = addressListRepository;
    }
}
