package com.alpharamen.customer.data.remote;

import com.alpharamen.customer.data.models.FreeDeliveryResponseModel;
import com.alpharamen.customer.data.models.ItemResponseModel;
import com.alpharamen.customer.data.models.SearchResponseModel;
import com.alpharamen.customer.data.remote.bean.ForgotPasswordBean;
import com.alpharamen.customer.data.remote.bean.ForgotPasswordRequest;
import com.alpharamen.customer.data.remote.bean.HomePageBean;
import com.alpharamen.customer.data.remote.bean.LoginBean;
import com.alpharamen.customer.data.remote.bean.LoginRequest;
import com.alpharamen.customer.data.remote.bean.NotificationBean;
import com.alpharamen.customer.data.remote.bean.SignupBean;
import com.alpharamen.customer.data.remote.bean.SignupRequest;
import com.alpharamen.customer.data.remote.bean.SplashBean;
import com.alpharamen.customer.data.remote.bean.UserProfileBean;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET(ServiceNames.GET_HOME)
    Observable<HomePageBean> loadHomePage(@Query("language") String language);

    @GET(ServiceNames.GET_CONFIG)
    Observable<SplashBean> loadConfig(@Query("language") String language);

    @GET(ServiceNames.GET_CONFIG)
    Observable<UserProfileBean> loadUserProfile(@Query("language") String language);

    @GET(ServiceNames.GET_CONFIG)
    Observable<NotificationBean> loadNotifications(@Query("language") String language);

    @POST(ServiceNames.GET_CONFIG)
    Observable<LoginBean> login(@Body LoginRequest loginRequest);

    @POST(ServiceNames.GET_CONFIG)
    Observable<SignupBean> signup(@Body SignupRequest signupRequest);

    @POST(ServiceNames.GET_CONFIG)
    Observable<ForgotPasswordBean> forgotPassword(@Body ForgotPasswordRequest forgotPasswordRequest);

    @GET(ServiceNames.SEARCH_END_POINT + "/{key}")
    Observable<SearchResponseModel> getItemList(@Path("key") String key);

    @GET(ServiceNames.FOOD_LIST_END_POINT)
    Observable<ItemResponseModel> getFoodItemsList();

    @GET(ServiceNames.FREE_DELIVERY_LIST_END_POINT)
    Observable<FreeDeliveryResponseModel> getFreeDeliveryList();

}
