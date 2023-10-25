package com.alpharamen.customer;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alpharamen.customer.databinding.AboutOfferSingleItemBindingImpl;
import com.alpharamen.customer.databinding.ActivityAboutUsBindingImpl;
import com.alpharamen.customer.databinding.ActivityAddressListBindingImpl;
import com.alpharamen.customer.databinding.ActivityChangeAddressBindingImpl;
import com.alpharamen.customer.databinding.ActivityChangeLocationBindingImpl;
import com.alpharamen.customer.databinding.ActivityDetailHubBindingImpl;
import com.alpharamen.customer.databinding.ActivityEditProfileBindingImpl;
import com.alpharamen.customer.databinding.ActivityFilterBindingImpl;
import com.alpharamen.customer.databinding.ActivityFilterResultBindingImpl;
import com.alpharamen.customer.databinding.ActivityFoodDetailBindingImpl;
import com.alpharamen.customer.databinding.ActivityHomeBindingImpl;
import com.alpharamen.customer.databinding.ActivityLoginBindingImpl;
import com.alpharamen.customer.databinding.ActivityMyOrdersBindingImpl;
import com.alpharamen.customer.databinding.ActivityNotificationBindingImpl;
import com.alpharamen.customer.databinding.ActivityOfferDetailBindingImpl;
import com.alpharamen.customer.databinding.ActivityOnboardBindingImpl;
import com.alpharamen.customer.databinding.ActivityOrderPlacedBindingImpl;
import com.alpharamen.customer.databinding.ActivitySearchBindingImpl;
import com.alpharamen.customer.databinding.ActivitySignupBindingImpl;
import com.alpharamen.customer.databinding.ActivitySplashBindingImpl;
import com.alpharamen.customer.databinding.ActivityTrackItemBindingImpl;
import com.alpharamen.customer.databinding.ContentMainBindingImpl;
import com.alpharamen.customer.databinding.CustomRowItemBindingImpl;
import com.alpharamen.customer.databinding.FragmentBottomsheetLoginBindingImpl;
import com.alpharamen.customer.databinding.FragmentCartBindingImpl;
import com.alpharamen.customer.databinding.FragmentHomeBindingImpl;
import com.alpharamen.customer.databinding.FragmentHubsListBindingImpl;
import com.alpharamen.customer.databinding.FragmentNotificationBindingImpl;
import com.alpharamen.customer.databinding.FragmentOffersBindingImpl;
import com.alpharamen.customer.databinding.FragmentOffersSingleItemBindingImpl;
import com.alpharamen.customer.databinding.FragmentProfileBindingImpl;
import com.alpharamen.customer.databinding.FragmentSearchItemBindingImpl;
import com.alpharamen.customer.databinding.FreeDeliveryLayoutBindingImpl;
import com.alpharamen.customer.databinding.NotificationRowItemBindingImpl;
import com.alpharamen.customer.databinding.PlaceholderFoodDetailBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewAddressListSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewCartSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewDishFilterSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewDishTypeSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewDishesSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewFilterResultSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewHubNewBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewHubsListSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewMostPopularSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewMyOrdersSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewNotificationSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewOfferSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewOrderedSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewRecentItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewRelatedFoodsSingleItemBindingImpl;
import com.alpharamen.customer.databinding.RecyclerViewSearchSingleItemNewBindingImpl;
import com.alpharamen.customer.databinding.SampleRowItemBindingImpl;
import com.alpharamen.customer.databinding.TermsAndConditionsSingleItemBindingImpl;
import com.alpharamen.customer.databinding.WidgetHeaderViewBindingImpl;
import com.alpharamen.customer.databinding.WidgetHeaderViewTopBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ABOUTOFFERSINGLEITEM = 1;

  private static final int LAYOUT_ACTIVITYABOUTUS = 2;

  private static final int LAYOUT_ACTIVITYADDRESSLIST = 3;

  private static final int LAYOUT_ACTIVITYCHANGEADDRESS = 4;

  private static final int LAYOUT_ACTIVITYCHANGELOCATION = 5;

  private static final int LAYOUT_ACTIVITYDETAILHUB = 6;

  private static final int LAYOUT_ACTIVITYEDITPROFILE = 7;

  private static final int LAYOUT_ACTIVITYFILTER = 8;

  private static final int LAYOUT_ACTIVITYFILTERRESULT = 9;

  private static final int LAYOUT_ACTIVITYFOODDETAIL = 10;

  private static final int LAYOUT_ACTIVITYHOME = 11;

  private static final int LAYOUT_ACTIVITYLOGIN = 12;

  private static final int LAYOUT_ACTIVITYMYORDERS = 13;

  private static final int LAYOUT_ACTIVITYNOTIFICATION = 14;

  private static final int LAYOUT_ACTIVITYOFFERDETAIL = 15;

  private static final int LAYOUT_ACTIVITYONBOARD = 16;

  private static final int LAYOUT_ACTIVITYORDERPLACED = 17;

  private static final int LAYOUT_ACTIVITYSEARCH = 18;

  private static final int LAYOUT_ACTIVITYSIGNUP = 19;

  private static final int LAYOUT_ACTIVITYSPLASH = 20;

  private static final int LAYOUT_ACTIVITYTRACKITEM = 21;

  private static final int LAYOUT_CONTENTMAIN = 22;

  private static final int LAYOUT_CUSTOMROWITEM = 23;

  private static final int LAYOUT_FRAGMENTBOTTOMSHEETLOGIN = 24;

  private static final int LAYOUT_FRAGMENTCART = 25;

  private static final int LAYOUT_FRAGMENTHOME = 26;

  private static final int LAYOUT_FRAGMENTHUBSLIST = 27;

  private static final int LAYOUT_FRAGMENTNOTIFICATION = 28;

  private static final int LAYOUT_FRAGMENTOFFERS = 29;

  private static final int LAYOUT_FRAGMENTOFFERSSINGLEITEM = 30;

  private static final int LAYOUT_FRAGMENTPROFILE = 31;

  private static final int LAYOUT_FRAGMENTSEARCHITEM = 32;

  private static final int LAYOUT_FREEDELIVERYLAYOUT = 33;

  private static final int LAYOUT_NOTIFICATIONROWITEM = 34;

  private static final int LAYOUT_PLACEHOLDERFOODDETAIL = 35;

  private static final int LAYOUT_RECYCLERVIEWADDRESSLISTSINGLEITEM = 36;

  private static final int LAYOUT_RECYCLERVIEWCARTSINGLEITEM = 37;

  private static final int LAYOUT_RECYCLERVIEWDISHFILTERSINGLEITEM = 38;

  private static final int LAYOUT_RECYCLERVIEWDISHTYPESINGLEITEM = 39;

  private static final int LAYOUT_RECYCLERVIEWDISHESSINGLEITEM = 40;

  private static final int LAYOUT_RECYCLERVIEWFILTERRESULTSINGLEITEM = 41;

  private static final int LAYOUT_RECYCLERVIEWHUBNEW = 42;

  private static final int LAYOUT_RECYCLERVIEWHUBSLISTSINGLEITEM = 43;

  private static final int LAYOUT_RECYCLERVIEWMOSTPOPULARSINGLEITEM = 44;

  private static final int LAYOUT_RECYCLERVIEWMYORDERSSINGLEITEM = 45;

  private static final int LAYOUT_RECYCLERVIEWNOTIFICATIONSINGLEITEM = 46;

  private static final int LAYOUT_RECYCLERVIEWOFFERSINGLEITEM = 47;

  private static final int LAYOUT_RECYCLERVIEWORDEREDSINGLEITEM = 48;

  private static final int LAYOUT_RECYCLERVIEWRECENTITEM = 49;

  private static final int LAYOUT_RECYCLERVIEWRELATEDFOODSSINGLEITEM = 50;

  private static final int LAYOUT_RECYCLERVIEWSEARCHSINGLEITEMNEW = 51;

  private static final int LAYOUT_SAMPLEROWITEM = 52;

  private static final int LAYOUT_TERMSANDCONDITIONSSINGLEITEM = 53;

  private static final int LAYOUT_WIDGETHEADERVIEW = 54;

  private static final int LAYOUT_WIDGETHEADERVIEWTOP = 55;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(55);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.about_offer_single_item, LAYOUT_ABOUTOFFERSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_about_us, LAYOUT_ACTIVITYABOUTUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_address_list, LAYOUT_ACTIVITYADDRESSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_change_address, LAYOUT_ACTIVITYCHANGEADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_change_location, LAYOUT_ACTIVITYCHANGELOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_detail_hub, LAYOUT_ACTIVITYDETAILHUB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_filter, LAYOUT_ACTIVITYFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_filter_result, LAYOUT_ACTIVITYFILTERRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_food_detail, LAYOUT_ACTIVITYFOODDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_my_orders, LAYOUT_ACTIVITYMYORDERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_notification, LAYOUT_ACTIVITYNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_offer_detail, LAYOUT_ACTIVITYOFFERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_onboard, LAYOUT_ACTIVITYONBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_order_placed, LAYOUT_ACTIVITYORDERPLACED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_signup, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.activity_track_item, LAYOUT_ACTIVITYTRACKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.content_main, LAYOUT_CONTENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.custom_row_item, LAYOUT_CUSTOMROWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_bottomsheet_login, LAYOUT_FRAGMENTBOTTOMSHEETLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_hubs_list, LAYOUT_FRAGMENTHUBSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_notification, LAYOUT_FRAGMENTNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_offers, LAYOUT_FRAGMENTOFFERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_offers_single_item, LAYOUT_FRAGMENTOFFERSSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.fragment_search_item, LAYOUT_FRAGMENTSEARCHITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.free_delivery_layout, LAYOUT_FREEDELIVERYLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.notification_row_item, LAYOUT_NOTIFICATIONROWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.placeholder_food_detail, LAYOUT_PLACEHOLDERFOODDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_address_list_single_item, LAYOUT_RECYCLERVIEWADDRESSLISTSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_cart_single_item, LAYOUT_RECYCLERVIEWCARTSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_dish_filter_single_item, LAYOUT_RECYCLERVIEWDISHFILTERSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_dish_type_single_item, LAYOUT_RECYCLERVIEWDISHTYPESINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_dishes_single_item, LAYOUT_RECYCLERVIEWDISHESSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_filter_result_single_item, LAYOUT_RECYCLERVIEWFILTERRESULTSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_hub_new, LAYOUT_RECYCLERVIEWHUBNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_hubs_list_single_item, LAYOUT_RECYCLERVIEWHUBSLISTSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_most_popular_single_item, LAYOUT_RECYCLERVIEWMOSTPOPULARSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_my_orders_single_item, LAYOUT_RECYCLERVIEWMYORDERSSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_notification_single_item, LAYOUT_RECYCLERVIEWNOTIFICATIONSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_offer_single_item, LAYOUT_RECYCLERVIEWOFFERSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_ordered__single_item, LAYOUT_RECYCLERVIEWORDEREDSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_recent_item, LAYOUT_RECYCLERVIEWRECENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_related_foods_single_item, LAYOUT_RECYCLERVIEWRELATEDFOODSSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.recycler_view_search_single_item_new, LAYOUT_RECYCLERVIEWSEARCHSINGLEITEMNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.sample_row_item, LAYOUT_SAMPLEROWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.terms_and_conditions_single_item, LAYOUT_TERMSANDCONDITIONSSINGLEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.widget_header_view, LAYOUT_WIDGETHEADERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alpharamen.customer.R.layout.widget_header_view_top, LAYOUT_WIDGETHEADERVIEWTOP);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ABOUTOFFERSINGLEITEM: {
        if ("layout/about_offer_single_item_0".equals(tag)) {
          return new AboutOfferSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for about_offer_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYABOUTUS: {
        if ("layout/activity_about_us_0".equals(tag)) {
          return new ActivityAboutUsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_about_us is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYADDRESSLIST: {
        if ("layout/activity_address_list_0".equals(tag)) {
          return new ActivityAddressListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_address_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHANGEADDRESS: {
        if ("layout/activity_change_address_0".equals(tag)) {
          return new ActivityChangeAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_change_address is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHANGELOCATION: {
        if ("layout/activity_change_location_0".equals(tag)) {
          return new ActivityChangeLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_change_location is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDETAILHUB: {
        if ("layout/activity_detail_hub_0".equals(tag)) {
          return new ActivityDetailHubBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_detail_hub is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEDITPROFILE: {
        if ("layout/activity_edit_profile_0".equals(tag)) {
          return new ActivityEditProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFILTER: {
        if ("layout/activity_filter_0".equals(tag)) {
          return new ActivityFilterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_filter is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFILTERRESULT: {
        if ("layout/activity_filter_result_0".equals(tag)) {
          return new ActivityFilterResultBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_filter_result is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFOODDETAIL: {
        if ("layout/activity_food_detail_0".equals(tag)) {
          return new ActivityFoodDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_food_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHOME: {
        if ("layout/activity_home_0".equals(tag)) {
          return new ActivityHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYLOGIN: {
        if ("layout/activity_login_0".equals(tag)) {
          return new ActivityLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMYORDERS: {
        if ("layout/activity_my_orders_0".equals(tag)) {
          return new ActivityMyOrdersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_my_orders is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYNOTIFICATION: {
        if ("layout/activity_notification_0".equals(tag)) {
          return new ActivityNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYOFFERDETAIL: {
        if ("layout/activity_offer_detail_0".equals(tag)) {
          return new ActivityOfferDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_offer_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYONBOARD: {
        if ("layout/activity_onboard_0".equals(tag)) {
          return new ActivityOnboardBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_onboard is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYORDERPLACED: {
        if ("layout/activity_order_placed_0".equals(tag)) {
          return new ActivityOrderPlacedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_order_placed is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSEARCH: {
        if ("layout/activity_search_0".equals(tag)) {
          return new ActivitySearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSIGNUP: {
        if ("layout/activity_signup_0".equals(tag)) {
          return new ActivitySignupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_signup is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSPLASH: {
        if ("layout/activity_splash_0".equals(tag)) {
          return new ActivitySplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTRACKITEM: {
        if ("layout/activity_track_item_0".equals(tag)) {
          return new ActivityTrackItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_track_item is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTENTMAIN: {
        if ("layout/content_main_0".equals(tag)) {
          return new ContentMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for content_main is invalid. Received: " + tag);
      }
      case  LAYOUT_CUSTOMROWITEM: {
        if ("layout/custom_row_item_0".equals(tag)) {
          return new CustomRowItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for custom_row_item is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBOTTOMSHEETLOGIN: {
        if ("layout/fragment_bottomsheet_login_0".equals(tag)) {
          return new FragmentBottomsheetLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bottomsheet_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCART: {
        if ("layout/fragment_cart_0".equals(tag)) {
          return new FragmentCartBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHUBSLIST: {
        if ("layout/fragment_hubs_list_0".equals(tag)) {
          return new FragmentHubsListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_hubs_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTNOTIFICATION: {
        if ("layout/fragment_notification_0".equals(tag)) {
          return new FragmentNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOFFERS: {
        if ("layout/fragment_offers_0".equals(tag)) {
          return new FragmentOffersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_offers is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOFFERSSINGLEITEM: {
        if ("layout/fragment_offers_single_item_0".equals(tag)) {
          return new FragmentOffersSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_offers_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCHITEM: {
        if ("layout/fragment_search_item_0".equals(tag)) {
          return new FragmentSearchItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search_item is invalid. Received: " + tag);
      }
      case  LAYOUT_FREEDELIVERYLAYOUT: {
        if ("layout/free_delivery_layout_0".equals(tag)) {
          return new FreeDeliveryLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for free_delivery_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_NOTIFICATIONROWITEM: {
        if ("layout/notification_row_item_0".equals(tag)) {
          return new NotificationRowItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for notification_row_item is invalid. Received: " + tag);
      }
      case  LAYOUT_PLACEHOLDERFOODDETAIL: {
        if ("layout/placeholder_food_detail_0".equals(tag)) {
          return new PlaceholderFoodDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for placeholder_food_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWADDRESSLISTSINGLEITEM: {
        if ("layout/recycler_view_address_list_single_item_0".equals(tag)) {
          return new RecyclerViewAddressListSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_address_list_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWCARTSINGLEITEM: {
        if ("layout/recycler_view_cart_single_item_0".equals(tag)) {
          return new RecyclerViewCartSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_cart_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWDISHFILTERSINGLEITEM: {
        if ("layout/recycler_view_dish_filter_single_item_0".equals(tag)) {
          return new RecyclerViewDishFilterSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_dish_filter_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWDISHTYPESINGLEITEM: {
        if ("layout/recycler_view_dish_type_single_item_0".equals(tag)) {
          return new RecyclerViewDishTypeSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_dish_type_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWDISHESSINGLEITEM: {
        if ("layout/recycler_view_dishes_single_item_0".equals(tag)) {
          return new RecyclerViewDishesSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_dishes_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWFILTERRESULTSINGLEITEM: {
        if ("layout/recycler_view_filter_result_single_item_0".equals(tag)) {
          return new RecyclerViewFilterResultSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_filter_result_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWHUBNEW: {
        if ("layout/recycler_view_hub_new_0".equals(tag)) {
          return new RecyclerViewHubNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_hub_new is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWHUBSLISTSINGLEITEM: {
        if ("layout/recycler_view_hubs_list_single_item_0".equals(tag)) {
          return new RecyclerViewHubsListSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_hubs_list_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWMOSTPOPULARSINGLEITEM: {
        if ("layout/recycler_view_most_popular_single_item_0".equals(tag)) {
          return new RecyclerViewMostPopularSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_most_popular_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWMYORDERSSINGLEITEM: {
        if ("layout/recycler_view_my_orders_single_item_0".equals(tag)) {
          return new RecyclerViewMyOrdersSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_my_orders_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWNOTIFICATIONSINGLEITEM: {
        if ("layout/recycler_view_notification_single_item_0".equals(tag)) {
          return new RecyclerViewNotificationSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_notification_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWOFFERSINGLEITEM: {
        if ("layout/recycler_view_offer_single_item_0".equals(tag)) {
          return new RecyclerViewOfferSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_offer_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWORDEREDSINGLEITEM: {
        if ("layout/recycler_view_ordered__single_item_0".equals(tag)) {
          return new RecyclerViewOrderedSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_ordered__single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWRECENTITEM: {
        if ("layout/recycler_view_recent_item_0".equals(tag)) {
          return new RecyclerViewRecentItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_recent_item is invalid. Received: " + tag);
      }
      case  LAYOUT_RECYCLERVIEWRELATEDFOODSSINGLEITEM: {
        if ("layout/recycler_view_related_foods_single_item_0".equals(tag)) {
          return new RecyclerViewRelatedFoodsSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_related_foods_single_item is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_RECYCLERVIEWSEARCHSINGLEITEMNEW: {
        if ("layout/recycler_view_search_single_item_new_0".equals(tag)) {
          return new RecyclerViewSearchSingleItemNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recycler_view_search_single_item_new is invalid. Received: " + tag);
      }
      case  LAYOUT_SAMPLEROWITEM: {
        if ("layout/sample_row_item_0".equals(tag)) {
          return new SampleRowItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sample_row_item is invalid. Received: " + tag);
      }
      case  LAYOUT_TERMSANDCONDITIONSSINGLEITEM: {
        if ("layout/terms_and_conditions_single_item_0".equals(tag)) {
          return new TermsAndConditionsSingleItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for terms_and_conditions_single_item is invalid. Received: " + tag);
      }
      case  LAYOUT_WIDGETHEADERVIEW: {
        if ("layout/widget_header_view_0".equals(tag)) {
          return new WidgetHeaderViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for widget_header_view is invalid. Received: " + tag);
      }
      case  LAYOUT_WIDGETHEADERVIEWTOP: {
        if ("layout/widget_header_view_top_0".equals(tag)) {
          return new WidgetHeaderViewTopBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for widget_header_view_top is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(51);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutUs");
      sKeys.put(2, "addressList");
      sKeys.put(3, "arrrow");
      sKeys.put(4, "bottomSelection");
      sKeys.put(5, "callback");
      sKeys.put(6, "cart");
      sKeys.put(7, "categoryId");
      sKeys.put(8, "categoryName");
      sKeys.put(9, "changeAddress");
      sKeys.put(10, "changeLocation");
      sKeys.put(11, "desc");
      sKeys.put(12, "editProfile");
      sKeys.put(13, "empty");
      sKeys.put(14, "filter");
      sKeys.put(15, "filterResult");
      sKeys.put(16, "foodDetail");
      sKeys.put(17, "hide");
      sKeys.put(18, "home");
      sKeys.put(19, "hubDetail");
      sKeys.put(20, "hubs");
      sKeys.put(21, "imageUrl");
      sKeys.put(22, "isLast");
      sKeys.put(23, "item");
      sKeys.put(24, "itemFirst");
      sKeys.put(25, "itemFourth");
      sKeys.put(26, "itemSecond");
      sKeys.put(27, "itemThird");
      sKeys.put(28, "listener");
      sKeys.put(29, "login");
      sKeys.put(30, "myorders");
      sKeys.put(31, "name");
      sKeys.put(32, "notification");
      sKeys.put(33, "notify");
      sKeys.put(34, "offerDetail");
      sKeys.put(35, "offers");
      sKeys.put(36, "onboard");
      sKeys.put(37, "payment");
      sKeys.put(38, "profile");
      sKeys.put(39, "ratingSelection");
      sKeys.put(40, "relatedFood");
      sKeys.put(41, "sample");
      sKeys.put(42, "search");
      sKeys.put(43, "selected");
      sKeys.put(44, "selection");
      sKeys.put(45, "signUp");
      sKeys.put(46, "splash");
      sKeys.put(47, "title");
      sKeys.put(48, "trackItem");
      sKeys.put(49, "url");
      sKeys.put(50, "userType");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(55);

    static {
      sKeys.put("layout/about_offer_single_item_0", com.alpharamen.customer.R.layout.about_offer_single_item);
      sKeys.put("layout/activity_about_us_0", com.alpharamen.customer.R.layout.activity_about_us);
      sKeys.put("layout/activity_address_list_0", com.alpharamen.customer.R.layout.activity_address_list);
      sKeys.put("layout/activity_change_address_0", com.alpharamen.customer.R.layout.activity_change_address);
      sKeys.put("layout/activity_change_location_0", com.alpharamen.customer.R.layout.activity_change_location);
      sKeys.put("layout/activity_detail_hub_0", com.alpharamen.customer.R.layout.activity_detail_hub);
      sKeys.put("layout/activity_edit_profile_0", com.alpharamen.customer.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_filter_0", com.alpharamen.customer.R.layout.activity_filter);
      sKeys.put("layout/activity_filter_result_0", com.alpharamen.customer.R.layout.activity_filter_result);
      sKeys.put("layout/activity_food_detail_0", com.alpharamen.customer.R.layout.activity_food_detail);
      sKeys.put("layout/activity_home_0", com.alpharamen.customer.R.layout.activity_home);
      sKeys.put("layout/activity_login_0", com.alpharamen.customer.R.layout.activity_login);
      sKeys.put("layout/activity_my_orders_0", com.alpharamen.customer.R.layout.activity_my_orders);
      sKeys.put("layout/activity_notification_0", com.alpharamen.customer.R.layout.activity_notification);
      sKeys.put("layout/activity_offer_detail_0", com.alpharamen.customer.R.layout.activity_offer_detail);
      sKeys.put("layout/activity_onboard_0", com.alpharamen.customer.R.layout.activity_onboard);
      sKeys.put("layout/activity_order_placed_0", com.alpharamen.customer.R.layout.activity_order_placed);
      sKeys.put("layout/activity_search_0", com.alpharamen.customer.R.layout.activity_search);
      sKeys.put("layout/activity_signup_0", com.alpharamen.customer.R.layout.activity_signup);
      sKeys.put("layout/activity_splash_0", com.alpharamen.customer.R.layout.activity_splash);
      sKeys.put("layout/activity_track_item_0", com.alpharamen.customer.R.layout.activity_track_item);
      sKeys.put("layout/content_main_0", com.alpharamen.customer.R.layout.content_main);
      sKeys.put("layout/custom_row_item_0", com.alpharamen.customer.R.layout.custom_row_item);
      sKeys.put("layout/fragment_bottomsheet_login_0", com.alpharamen.customer.R.layout.fragment_bottomsheet_login);
      sKeys.put("layout/fragment_cart_0", com.alpharamen.customer.R.layout.fragment_cart);
      sKeys.put("layout/fragment_home_0", com.alpharamen.customer.R.layout.fragment_home);
      sKeys.put("layout/fragment_hubs_list_0", com.alpharamen.customer.R.layout.fragment_hubs_list);
      sKeys.put("layout/fragment_notification_0", com.alpharamen.customer.R.layout.fragment_notification);
      sKeys.put("layout/fragment_offers_0", com.alpharamen.customer.R.layout.fragment_offers);
      sKeys.put("layout/fragment_offers_single_item_0", com.alpharamen.customer.R.layout.fragment_offers_single_item);
      sKeys.put("layout/fragment_profile_0", com.alpharamen.customer.R.layout.fragment_profile);
      sKeys.put("layout/fragment_search_item_0", com.alpharamen.customer.R.layout.fragment_search_item);
      sKeys.put("layout/free_delivery_layout_0", com.alpharamen.customer.R.layout.free_delivery_layout);
      sKeys.put("layout/notification_row_item_0", com.alpharamen.customer.R.layout.notification_row_item);
      sKeys.put("layout/placeholder_food_detail_0", com.alpharamen.customer.R.layout.placeholder_food_detail);
      sKeys.put("layout/recycler_view_address_list_single_item_0", com.alpharamen.customer.R.layout.recycler_view_address_list_single_item);
      sKeys.put("layout/recycler_view_cart_single_item_0", com.alpharamen.customer.R.layout.recycler_view_cart_single_item);
      sKeys.put("layout/recycler_view_dish_filter_single_item_0", com.alpharamen.customer.R.layout.recycler_view_dish_filter_single_item);
      sKeys.put("layout/recycler_view_dish_type_single_item_0", com.alpharamen.customer.R.layout.recycler_view_dish_type_single_item);
      sKeys.put("layout/recycler_view_dishes_single_item_0", com.alpharamen.customer.R.layout.recycler_view_dishes_single_item);
      sKeys.put("layout/recycler_view_filter_result_single_item_0", com.alpharamen.customer.R.layout.recycler_view_filter_result_single_item);
      sKeys.put("layout/recycler_view_hub_new_0", com.alpharamen.customer.R.layout.recycler_view_hub_new);
      sKeys.put("layout/recycler_view_hubs_list_single_item_0", com.alpharamen.customer.R.layout.recycler_view_hubs_list_single_item);
      sKeys.put("layout/recycler_view_most_popular_single_item_0", com.alpharamen.customer.R.layout.recycler_view_most_popular_single_item);
      sKeys.put("layout/recycler_view_my_orders_single_item_0", com.alpharamen.customer.R.layout.recycler_view_my_orders_single_item);
      sKeys.put("layout/recycler_view_notification_single_item_0", com.alpharamen.customer.R.layout.recycler_view_notification_single_item);
      sKeys.put("layout/recycler_view_offer_single_item_0", com.alpharamen.customer.R.layout.recycler_view_offer_single_item);
      sKeys.put("layout/recycler_view_ordered__single_item_0", com.alpharamen.customer.R.layout.recycler_view_ordered__single_item);
      sKeys.put("layout/recycler_view_recent_item_0", com.alpharamen.customer.R.layout.recycler_view_recent_item);
      sKeys.put("layout/recycler_view_related_foods_single_item_0", com.alpharamen.customer.R.layout.recycler_view_related_foods_single_item);
      sKeys.put("layout/recycler_view_search_single_item_new_0", com.alpharamen.customer.R.layout.recycler_view_search_single_item_new);
      sKeys.put("layout/sample_row_item_0", com.alpharamen.customer.R.layout.sample_row_item);
      sKeys.put("layout/terms_and_conditions_single_item_0", com.alpharamen.customer.R.layout.terms_and_conditions_single_item);
      sKeys.put("layout/widget_header_view_0", com.alpharamen.customer.R.layout.widget_header_view);
      sKeys.put("layout/widget_header_view_top_0", com.alpharamen.customer.R.layout.widget_header_view_top);
    }
  }
}
