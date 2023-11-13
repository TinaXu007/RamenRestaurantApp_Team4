package com.alpharamen.customer.view.ui.nearme;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseFragment;
import com.alpharamen.customer.data.models.FreeDeliveryResponseModel;
import com.alpharamen.customer.data.models.OfferListModelNew;
import com.alpharamen.customer.data.models.PopularListModelNew;
import com.alpharamen.customer.data.models.SampleModel;
import com.alpharamen.customer.databinding.FragmentHomeBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.MostPopularItemAdapter;
import com.alpharamen.customer.view.adapter.OfferListAdapter;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;
import com.alpharamen.customer.view.ui.home_page.HomeActivity;
import com.alpharamen.customer.viewmodel.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class FoodItemListFragment extends BaseFragment<FragmentHomeBinding, SampleModel> {
    // TODO: Rename parameter arguments, choose names that match
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    FragmentHomeBinding dataBinding;
    SampleModel sampleModel;
    List<OfferListModelNew> offerListModelList = new ArrayList<>();
    List<PopularListModelNew> mostPopularItemModelList = new ArrayList<>();

    OfferListAdapter offerListAdapter;
    MostPopularItemAdapter mostPopularItemAdapter;

    @Inject
    ViewModelProviderFactory mVviewModelFactory;
    HomeViewModel homeViewModel;


    public FoodItemListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment FoodItemListFragment.
     */
    public static FoodItemListFragment newInstance(String param1, String param2) {
        FoodItemListFragment fragment = new FoodItemListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this, mVviewModelFactory).get(HomeViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        dataBinding = (FragmentHomeBinding) getViewDataBinding();
        dataBinding.freeDeliveryLayout.setListener(onClickListener);
        dataBinding.setSample(sampleModel);


//        handleProgressBar();
        hideLoading(); // TODO: Tina added this

        if (getActivity() != null && getActivity() instanceof HomeActivity) {

            ((HomeActivity) getActivity()).showBottomBar();
            ((HomeActivity) getActivity()).loadFoodListFragment();

        }

        offerListAdapter = new OfferListAdapter(offerListModelList, offerItemListener);
        dataBinding.recyclerViewOfferList.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        dataBinding.recyclerViewOfferList.setHasFixedSize(true);
        dataBinding.recyclerViewOfferList.setAdapter(offerListAdapter);


        mostPopularItemAdapter = new MostPopularItemAdapter(mostPopularItemModelList, mostPopularItemListener);
        dataBinding.recyclerViewPopular.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        dataBinding.recyclerViewPopular.setHasFixedSize(true);
        dataBinding.recyclerViewPopular.setAdapter(mostPopularItemAdapter);
        dataBinding.recyclerViewPopular.scrollToPosition(2);



//        homeViewModel.getMutableLiveData().observe(this, itemResponseModel -> {
//
//
//            if (itemResponseModel != null && itemResponseModel.getData().getOfferList().size() > 0 &&
//                    itemResponseModel.getData().getPopularList().size() > 0) {
//
//                offerListModelList.addAll(itemResponseModel.getData().getOfferList());
//                mostPopularItemModelList.addAll(itemResponseModel.getData().getPopularList());
//
//
//            } else {
//                showToast("no response");
//            }
//
//            offerListAdapter.notifyDataSetChanged();
//            mostPopularItemAdapter.notifyDataSetChanged();
//
//        });

        homeViewModel.getFreeDeliveryMutableLiveData().observe(this, new Observer<FreeDeliveryResponseModel>() {
            @Override
            public void onChanged(@Nullable FreeDeliveryResponseModel freeDeliveryResponseModel) {
                if (freeDeliveryResponseModel != null && freeDeliveryResponseModel.getData().getFreeDeliveryList().size() > 0) {
                    dataBinding.freeDeliveryLayout.setItemFirst(freeDeliveryResponseModel.getData().getFreeDeliveryList().get(0));
                    dataBinding.freeDeliveryLayout.setItemSecond(freeDeliveryResponseModel.getData().getFreeDeliveryList().get(1));
                    dataBinding.freeDeliveryLayout.setItemThird(freeDeliveryResponseModel.getData().getFreeDeliveryList().get(2));
                    dataBinding.freeDeliveryLayout.setItemFourth(freeDeliveryResponseModel.getData().getFreeDeliveryList().get(3));
                }
            }
        });

    }



    OnAdapterSelectedListener<PopularListModelNew> mostPopularItemListener = new OnAdapterSelectedListener<PopularListModelNew>() {
        @Override
        public void onAdapterSelected(PopularListModelNew model) {
            if (getActivity() != null) {
                ((HomeActivity) getActivity()).openFoodDetails(model);
            }
        }

        @Override
        public void onAdapterString(String text) {

        }
    };
    OnAdapterSelectedListener<OfferListModelNew> offerItemListener = new OnAdapterSelectedListener<OfferListModelNew>() {
        @Override
        public void onAdapterSelected(OfferListModelNew model) {
            if (getActivity() != null) {
                ((HomeActivity) getActivity()).openOfferFood(model);
            }
        }

        @Override
        public void onAdapterString(String text) {

        }
    };


    private void handleProgressBar() {

        homeViewModel.getIsLoading().observe(getViewLifecycleOwner() != null ? getViewLifecycleOwner() : this,
                progressModel -> {
                    if (progressModel != null) {
                        if (progressModel.isLoading()) {
                            showLoading();
                        } else {
                            hideLoading();
                        }
                    }
                    if (progressModel != null && !progressModel.isHasInternet()) {
                        showToast("No internet connection");
                        dataBinding.constraintLayoutFoodItemList.setVisibility(View.GONE);
                        if (getActivity() != null) {
                            ((HomeActivity) getActivity()).noInternet();
                        }
                    } else if ((progressModel != null) && progressModel.isHasInternet()) {

                        if (getActivity() != null) {
                            ((HomeActivity) getActivity()).hasInternet();
                        }
                        //showLoading();
                    }

                });
    }

    private void hideLoading() {

        dataBinding.shimmerLayout.stopShimmerAnimation();
        dataBinding.shimmerLayout.setVisibility(View.GONE);
        dataBinding.constraintLayoutFoodItemList.setVisibility(View.VISIBLE);
    }

    private void showLoading() {

        dataBinding.shimmerLayout.setVisibility(View.VISIBLE);
        dataBinding.shimmerLayout.startShimmerAnimation();
        dataBinding.constraintLayoutFoodItemList.setVisibility(View.GONE);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public int getBindingVariable() {
        return BR.sample;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public SampleModel getBindingObject() {
        return sampleModel;
    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v == dataBinding.freeDeliveryLayout.cardViewFirst) {
                String itemName, itemRate;
                itemName = dataBinding.freeDeliveryLayout.textViewFirst.getText().toString();
                itemRate = dataBinding.freeDeliveryLayout.textViewRateFirst.getText().toString();

                if (getActivity() != null) {
                    ((HomeActivity) getActivity()).openCardViewFirst(itemName, itemRate);
                }

            } else if (v == dataBinding.freeDeliveryLayout.cardViewSecond) {
                String itemName, itemRate;
                itemName = dataBinding.freeDeliveryLayout.textViewItemNameSecond.getText().toString();
                itemRate = dataBinding.freeDeliveryLayout.textViewRateSecond.getText().toString();

                if (getActivity() != null) {
                    ((HomeActivity) getActivity()).openCardViewSecond(itemName, itemRate);
                }


            } else if (v == dataBinding.freeDeliveryLayout.cardViewThird) {

                String itemName, itemRate;
                itemName = dataBinding.freeDeliveryLayout.textViewItemNameThird.getText().toString();
                itemRate = dataBinding.freeDeliveryLayout.textViewRateThird.getText().toString();
                if (getActivity() != null) {
                    ((HomeActivity) getActivity()).openCardViewThird(itemName, itemRate);
                }

            } else if (v == dataBinding.freeDeliveryLayout.cardViewFourth) {

                String itemName, itemRate;
                itemName = dataBinding.freeDeliveryLayout.textViewItemNameFourth.getText().toString();
                itemRate = dataBinding.freeDeliveryLayout.textViewRateFourth.getText().toString();
                if (getActivity() != null) {

                    ((HomeActivity) getActivity()).openCardViewFourth(itemName, itemRate);
                }

            }

        }

    };

    @Override
    public void onResume() {
        super.onResume();
        dataBinding.shimmerLayout.startShimmerAnimation();
    }

    @Override
    public void onPause() {
        super.onPause();
        dataBinding.shimmerLayout.startShimmerAnimation();
    }

}



