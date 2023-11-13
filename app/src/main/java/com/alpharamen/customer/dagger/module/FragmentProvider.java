package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.cart.CartFragment;
import com.alpharamen.customer.view.ui.login.BottomFragment;
import com.alpharamen.customer.view.ui.nearme.FoodItemListFragment;
import com.alpharamen.customer.view.ui.nearme.HubsListFragment;
import com.alpharamen.customer.view.ui.notification.NotificationFragment;
import com.alpharamen.customer.view.ui.offers.OffersFragment;
import com.alpharamen.customer.view.ui.profile.ProfileFragment;
import com.alpharamen.customer.view.ui.search.SearchItemFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentProvider {

    @PerActivity
    @ContributesAndroidInjector
    abstract FoodItemListFragment foodItemListFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract ProfileFragment bindProfileFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract CartFragment bindForgotPasswordFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract BottomFragment bottomSheetFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract HubsListFragment hubsListFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract OffersFragment offersFragment();

    @PerActivity
    @ContributesAndroidInjector
    abstract NotificationFragment notificationFragment();


    @PerActivity
    @ContributesAndroidInjector
    abstract SearchItemFragment searchItemFragment();

}
