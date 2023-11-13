package com.alpharamen.customer.dagger.module;

import com.alpharamen.customer.dagger.PerActivity;
import com.alpharamen.customer.view.ui.about_us.AboutUsActivity;
import com.alpharamen.customer.view.ui.address_list.AddressListActivity;
import com.alpharamen.customer.view.ui.change_address.ChangeAddressActivity;
import com.alpharamen.customer.view.ui.change_location.ChangeLocationActivity;
import com.alpharamen.customer.view.ui.edit_profile.EditProfileActivity;
import com.alpharamen.customer.view.ui.filter.FilterActivity;
import com.alpharamen.customer.view.ui.filter_result.FilterResultActivity;
import com.alpharamen.customer.view.ui.food_item_detail_page.FoodDetailActivity;
import com.alpharamen.customer.view.ui.home_page.HomeActivity;
import com.alpharamen.customer.view.ui.hub_detail_page.DetailHubActivity;
import com.alpharamen.customer.view.ui.login.LoginActivity;
import com.alpharamen.customer.view.ui.myorders.MyOrdersActivity;
import com.alpharamen.customer.view.ui.notification.NotificationActivity;
import com.alpharamen.customer.view.ui.offer_detail.OfferDetailActivity;
import com.alpharamen.customer.view.ui.onboarding.OnboardActivity;
import com.alpharamen.customer.view.ui.order_placed.OrderPlacedActivity;
import com.alpharamen.customer.view.ui.signup.SignupActivity;
import com.alpharamen.customer.view.ui.splash.SplashActivity;
import com.alpharamen.customer.view.ui.track_item.TrackItemActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityProvider {

    @PerActivity
    @ContributesAndroidInjector
    abstract HomeActivity bindHomeActivity();

    @PerActivity
    @ContributesAndroidInjector
    abstract SplashActivity bindSplashActivity();

    @PerActivity
    @ContributesAndroidInjector
    abstract NotificationActivity bindNotificationActivity();

    @PerActivity
    @ContributesAndroidInjector
    abstract LoginActivity bindLoginActivity();

    @PerActivity
    @ContributesAndroidInjector
    abstract SignupActivity bindSignupActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract OnboardActivity onboardActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract FoodDetailActivity foodDetailActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract DetailHubActivity detailHubActivity();

    @PerActivity
    @ContributesAndroidInjector
    abstract OfferDetailActivity offerDetailActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract OrderPlacedActivity paymentActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract EditProfileActivity editProfileActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract ChangeLocationActivity changeLocationActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract MyOrdersActivity myOrdersActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract AboutUsActivity aboutUsActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract ChangeAddressActivity changeAddressActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract FilterActivity filterActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract FilterResultActivity filterResultActivity();


    @PerActivity
    @ContributesAndroidInjector
    abstract TrackItemActivity trackItemActivity();

    @PerActivity
    @ContributesAndroidInjector
    abstract AddressListActivity addressListActivity();


}
