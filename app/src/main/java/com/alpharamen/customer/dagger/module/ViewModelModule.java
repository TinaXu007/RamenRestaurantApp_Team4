package com.alpharamen.customer.dagger.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.alpharamen.customer.dagger.ViewModelKey;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.viewmodel.AboutUsViewModel;
import com.alpharamen.customer.viewmodel.AddressListViewModel;
import com.alpharamen.customer.viewmodel.CartViewModel;
import com.alpharamen.customer.viewmodel.ChangeAddressViewModel;
import com.alpharamen.customer.viewmodel.ChangeLocationViewModel;
import com.alpharamen.customer.viewmodel.DetailViewModel;
import com.alpharamen.customer.viewmodel.EditProfileViewModel;
import com.alpharamen.customer.viewmodel.FilterResultViewModel;
import com.alpharamen.customer.viewmodel.FilterViewModel;
import com.alpharamen.customer.viewmodel.FoodDetailViewModel;
import com.alpharamen.customer.viewmodel.FoodItemListViewModel;
import com.alpharamen.customer.viewmodel.HomeViewModel;
import com.alpharamen.customer.viewmodel.HubListViewModel;
import com.alpharamen.customer.viewmodel.LoginViewModel;
import com.alpharamen.customer.viewmodel.MyOrdersViewModel;
import com.alpharamen.customer.viewmodel.NotificationFragmentViewModel;
import com.alpharamen.customer.viewmodel.NotificationViewModel;
import com.alpharamen.customer.viewmodel.OfferDetailViewModel;
import com.alpharamen.customer.viewmodel.OffersViewModel;
import com.alpharamen.customer.viewmodel.OnboardViewModel;
import com.alpharamen.customer.viewmodel.PaymentViewModel;
import com.alpharamen.customer.viewmodel.ProfileViewModel;
import com.alpharamen.customer.viewmodel.SearchViewModel;
import com.alpharamen.customer.viewmodel.SignupViewModel;
import com.alpharamen.customer.viewmodel.SplashViewModel;
import com.alpharamen.customer.viewmodel.TrackItemViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel homeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel.class)
    abstract ViewModel bindSplashViewModel(SplashViewModel splashViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    abstract ViewModel bindProfileViewModel(ProfileViewModel splashViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationViewModel.class)
    abstract ViewModel bindNotificationViewModel(NotificationViewModel splashViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindLoginViewModel(LoginViewModel loginViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SignupViewModel.class)
    abstract ViewModel bindSignupViewModel(SignupViewModel signupViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(CartViewModel.class)
    abstract ViewModel bindForgotPasswordViewModel(CartViewModel cartViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(OnboardViewModel.class)
    abstract ViewModel onBoardViewModel(OnboardViewModel onboardViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FoodItemListViewModel.class)
    abstract ViewModel FoodItemListViewModel(FoodItemListViewModel foodItemListViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(HubListViewModel.class)
    abstract ViewModel HubListViewModel(HubListViewModel hubListViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(OffersViewModel.class)
    abstract ViewModel OffersViewModel(OffersViewModel offersViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(NotificationFragmentViewModel.class)
    abstract ViewModel NotificationFragmentViewModel(NotificationFragmentViewModel notificationFragmentViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(FoodDetailViewModel.class)
    abstract ViewModel FoodDetailViewModel(FoodDetailViewModel foodDetailViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel.class)
    abstract ViewModel DetailViewModel(DetailViewModel detailViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(OfferDetailViewModel.class)
    abstract ViewModel OfferDetailViewModel(OfferDetailViewModel offerDetailViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PaymentViewModel.class)
    abstract ViewModel PaymentViewModel(PaymentViewModel paymentViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(EditProfileViewModel.class)
    abstract ViewModel EditProfileViewModel(EditProfileViewModel editProfileViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ChangeLocationViewModel.class)
    abstract ViewModel ChangeLocationViewModel(ChangeLocationViewModel changeLocationViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(MyOrdersViewModel.class)
    abstract ViewModel MyOrdersViewModel(MyOrdersViewModel myOrdersViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(AboutUsViewModel.class)
    abstract ViewModel AboutUsViewModel(AboutUsViewModel aboutUsViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(ChangeAddressViewModel.class)
    abstract ViewModel ChangeAddressViewModel(ChangeAddressViewModel changeAddressViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(FilterViewModel.class)
    abstract ViewModel FilterViewModel(FilterViewModel changeAddressViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(FilterResultViewModel.class)
    abstract ViewModel FilterResultViewModel(FilterResultViewModel filterResultViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel.class)
    abstract ViewModel SearchViewModel(SearchViewModel searchViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(TrackItemViewModel.class)
    abstract ViewModel TrackItemViewModel(TrackItemViewModel trackItemViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(AddressListViewModel.class)
    abstract ViewModel AddressListViewModel(AddressListViewModel addressListViewModel);


    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory factory);
}