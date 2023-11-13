package com.alpharamen.customer.view.ui.hub_detail_page;

import androidx.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.material.appbar.AppBarLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseActivity;
import com.alpharamen.customer.data.models.DishItemModel;
import com.alpharamen.customer.data.models.DishTypeModel;
import com.alpharamen.customer.data.models.HubsListModel;
import com.alpharamen.customer.databinding.ActivityDetailHubBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.DIshItemAdapter;
import com.alpharamen.customer.view.adapter.DishTypeAdapter;
import com.alpharamen.customer.view.customview.HeaderView;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;
import com.alpharamen.customer.view.ui.food_item_detail_page.FoodDetailActivity;
import com.alpharamen.customer.viewmodel.DetailViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class DetailHubActivity extends BaseActivity implements AppBarLayout.OnOffsetChangedListener {
    protected HeaderView toolbarHeaderView;
    protected AppBarLayout appBarLayout;
    protected Toolbar toolbar;
    List<DishTypeModel> dishTypeModels = new ArrayList<>();
    List<DishItemModel> dishItemModels = new ArrayList<>();
    List<DishItemModel> indianItemsList = new ArrayList<>();
    List<DishItemModel> sweetItemsList = new ArrayList<>();
    List<DishItemModel> snacksList = new ArrayList<>();
    List<DishItemModel> cooldrinksList = new ArrayList<>();
    List<DishItemModel> chineseItemsList = new ArrayList<>();
    DIshItemAdapter dishItemAdapter;
    DishTypeAdapter dishTypeAdapter;
    @Inject
    ViewModelProviderFactory mViewModelFactory;
    ActivityDetailHubBinding dataBinding;
    DetailViewModel detailViewModel;
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == dataBinding.toolbarHeaderView.imageViewPrevious) {
                onBackPressed();

            } else if (v == dataBinding.toolbarHeaderView.imageViewCart) {

                openCart();
            }

        }
    };
    OnAdapterSelectedListener<DishTypeModel> onAdapterSelectedListener = new OnAdapterSelectedListener<DishTypeModel>() {
        @Override
        public void onAdapterSelected(DishTypeModel model) {
            for (DishTypeModel dishTypeModel : dishTypeModels) {
                if (dishTypeModel.equals(model)) {
                    dishTypeModel.setSelected(true);
                    if (dishTypeModel.getId() == 0) {

                        dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.GONE);
                        dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.VISIBLE);
                        dataBinding.mainContentLayout.shimmerLayout.startShimmerAnimation();
                        setRecyclerView(indianItemsList);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.VISIBLE);
                                dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.GONE);
                            }
                        }, 500);

                    }
                    if (dishTypeModel.getId() == 1) {

                        dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.GONE);
                        dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.VISIBLE);
                        dataBinding.mainContentLayout.shimmerLayout.startShimmerAnimation();
                        setRecyclerView(chineseItemsList);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.VISIBLE);
                                dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.GONE);
                            }
                        }, 500);

                    }
                    if (dishTypeModel.getId() == 2) {
                        dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.GONE);
                        dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.VISIBLE);
                        dataBinding.mainContentLayout.shimmerLayout.startShimmerAnimation();
                        setRecyclerView(sweetItemsList);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.VISIBLE);
                                dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.GONE);
                            }
                        }, 500);
                    }
                    if (dishTypeModel.getId() == 3) {

                        dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.GONE);
                        dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.VISIBLE);
                        dataBinding.mainContentLayout.shimmerLayout.startShimmerAnimation();
                        setRecyclerView(snacksList);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.VISIBLE);
                                dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.GONE);
                            }
                        }, 500);
                    }
                    if (dishTypeModel.getId() == 4) {
                        dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.GONE);
                        dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.VISIBLE);
                        dataBinding.mainContentLayout.shimmerLayout.startShimmerAnimation();
                        setRecyclerView(cooldrinksList);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dataBinding.mainContentLayout.recyclerViewDishes.setVisibility(View.VISIBLE);
                                dataBinding.mainContentLayout.shimmerLayout.setVisibility(View.GONE);
                            }
                        }, 500);

                    }

                } else {
                    dishTypeModel.setSelected(false);
                }
            }


        }

        @Override
        public void onAdapterString(String text) {

        }
    };

    private void setRecyclerView(List<DishItemModel> dishItemModelList) {

        dishItemModels.clear();
        dishItemModels.addAll(dishItemModelList);

        dataBinding.mainContentLayout.recyclerViewDishes.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
        dataBinding.mainContentLayout.recyclerViewDishes.setHasFixedSize(true);
        dataBinding.mainContentLayout.recyclerViewDishes.setAdapter(dishItemAdapter);
        dishItemAdapter.notifyDataSetChanged();
    }

    OnAdapterSelectedListener<DishItemModel> selectedListener = new OnAdapterSelectedListener<DishItemModel>() {
        @Override
        public void onAdapterSelected(DishItemModel model) {

            Intent i = new Intent(DetailHubActivity.this, FoodDetailActivity.class);
            i.putExtra("DishItemModel", model);
            startActivityForResult(i, 4311);
            overridePendingTransition(0, 0);

        }

        @Override
        public void onAdapterString(String text) {

        }
    };
    private boolean isHideToolbarView = false;

    @Override
    public int getBindingVariable() {
        return BR.hubDetail;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_detail_hub;
    }

    @Override
    public Object getBindingObject() {
        return detailViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailViewModel = ViewModelProviders.of(this, mViewModelFactory).get(DetailViewModel.class);
        dataBinding = (ActivityDetailHubBinding) getViewDataBinding();
        dataBinding.setListener(listener);
        dataBinding.toolbarHeaderView.setListener(listener);
        HubsListModel hubsListModel = getIntent().getParcelableExtra("HUBMODEL");
        dataBinding.toolbarHeaderView.setItem(hubsListModel);

        toolbarHeaderView = findViewById(R.id.toolbar_header_view);
        appBarLayout = findViewById(R.id.appbar);
        toolbar = findViewById(R.id.toolbar);
        dataBinding.recyclerViewDishTypes.setNestedScrollingEnabled(false);

        setSupportActionBar(toolbar);
        initUi();
        populateData();
        dishItemAdapter = new DIshItemAdapter(dishItemModels, selectedListener);
        setRecyclerView(indianItemsList);

        dishTypeAdapter = new DishTypeAdapter(dishTypeModels, onAdapterSelectedListener);
        dataBinding.recyclerViewDishTypes.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL, false));
        dataBinding.recyclerViewDishTypes.setHasFixedSize(true);
        dataBinding.recyclerViewDishTypes.setAdapter(dishTypeAdapter);
        dishTypeModels.get(0).setSelected(true);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4311) {
            if (data != null && data.getExtras() != null) {
                Bundle bundle = data.getExtras();
                if (bundle.containsKey("GOTOCART")) {
                    int go = bundle.getInt("GOTOCART", 0);
                    if (go == 1) {
                        openCart();
                    }
                }
            }

        }
    }

    private void populateData() {

        dishTypeModels.add(new DishTypeModel("Indian", 0));
        dishTypeModels.add(new DishTypeModel("Chinese", 1));
        dishTypeModels.add(new DishTypeModel("Sweets", 2));
        dishTypeModels.add(new DishTypeModel("Snacks", 3));
        dishTypeModels.add(new DishTypeModel("Cocktails", 4));


        indianItemsList.add(new DishItemModel("Chicken Burger", "Alpha Ramen", "60", R.drawable.login_image));
        indianItemsList.add(new DishItemModel("Chicken Burger", "Alpha Ramen", "70", R.drawable.login_image));
        indianItemsList.add(new DishItemModel("Chicken Burger", "Alpha Ramen", "80", R.drawable.login_image));
        indianItemsList.add(new DishItemModel("Chicken Burger", "Alpha Ramen", "70", R.drawable.login_image));
        indianItemsList.add(new DishItemModel("Chicken Burger", "Alpha Ramen", "70", R.drawable.login_image));

        chineseItemsList.add(new DishItemModel("Kung Pao Chicken", "Alpha Ramen", "100", R.drawable.dp));
        chineseItemsList.add(new DishItemModel("Wontons", "Alpha Ramen", "120", R.drawable.login_image));
        chineseItemsList.add(new DishItemModel("Dumplings", "Alpha Ramen", "70", R.drawable.dp));
        chineseItemsList.add(new DishItemModel("Chow Mein", "Alpha Ramen", "70", R.drawable.mintzza));
        chineseItemsList.add(new DishItemModel("Spring Rolls", "Alpha Ramen", "70", R.drawable.login_image));


        sweetItemsList.add(new DishItemModel("PATISA", "Alpha Ramen", "40", R.drawable.dp));
        sweetItemsList.add(new DishItemModel("MATHURA PEDA", "Alpha Ramen", "90", R.drawable.login_image));
        sweetItemsList.add(new DishItemModel("CHAINA ANGOOR", "Alpha Ramen", "70", R.drawable.dp));
        sweetItemsList.add(new DishItemModel("MEWA BITE", "Alpha Ramen", "70", R.drawable.mintzza));
        sweetItemsList.add(new DishItemModel("RAJBHOG", "Alpha Ramen", "70", R.drawable.login_image));


        snacksList.add(new DishItemModel("Bitterballen", "Alpha Ramen", "80", R.drawable.dp));
        snacksList.add(new DishItemModel("Bonda", "Alpha Ramen", "100", R.drawable.login_image));
        snacksList.add(new DishItemModel("Croquette", "Alpha Ramen", "70", R.drawable.dp));
        snacksList.add(new DishItemModel("Doughnutn", "Alpha Ramen", "70", R.drawable.mintzza));
        snacksList.add(new DishItemModel("Pancakes", "Alpha Ramen", "70", R.drawable.login_image));


        cooldrinksList.add(new DishItemModel("Apple Margarita", "Alpha Ramen", "50", R.drawable.dp));
        cooldrinksList.add(new DishItemModel("Aperol Spritz", "Alpha Ramen", "70", R.drawable.login_image));
        cooldrinksList.add(new DishItemModel("Alabama Slammer ", "Alpha Ramen", "80", R.drawable.dp));
        cooldrinksList.add(new DishItemModel("Adult Hot Chocolate", "Alpha Ramen", "90", R.drawable.mintzza));
        cooldrinksList.add(new DishItemModel("Anejo Highball", "Alpha Ramen", "70", R.drawable.login_image));

    }

    private void initUi() {
        dataBinding.appbar.addOnOffsetChangedListener(this);
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        int maxScroll = appBarLayout.getTotalScrollRange();
        float percentage = (float) Math.abs(verticalOffset) / (float) maxScroll;

        if (percentage == 1f && isHideToolbarView) {

            toolbarHeaderView.setVisibility(View.VISIBLE);
            isHideToolbarView = !isHideToolbarView;

            dataBinding.imageViewLocation.setVisibility(View.GONE);

            dataBinding.imageViewStarWhite.setVisibility(View.GONE);
            dataBinding.wacTextViewNoOfStars.setVisibility(View.GONE);
            dataBinding.wacTextViewStars.setVisibility(View.GONE);

            dataBinding.imageViewClock.setVisibility(View.GONE);
            dataBinding.wacTextViewTime.setVisibility(View.GONE);
            dataBinding.wacTextViewDeliveryTime.setVisibility(View.GONE);

            dataBinding.imageViewLocToLoc.setVisibility(View.GONE);
            dataBinding.wacTextViewDistance.setVisibility(View.GONE);
            dataBinding.wacTextViewKm.setVisibility(View.GONE);

        } else if (percentage < 1f && !isHideToolbarView) {

            toolbarHeaderView.setVisibility(View.VISIBLE);
            isHideToolbarView = !isHideToolbarView;

            dataBinding.imageViewLocation.setVisibility(View.VISIBLE);

            dataBinding.imageViewStarWhite.setVisibility(View.VISIBLE);
            dataBinding.wacTextViewNoOfStars.setVisibility(View.VISIBLE);
            dataBinding.wacTextViewStars.setVisibility(View.VISIBLE);

            dataBinding.imageViewClock.setVisibility(View.VISIBLE);
            dataBinding.wacTextViewTime.setVisibility(View.VISIBLE);
            dataBinding.wacTextViewDeliveryTime.setVisibility(View.VISIBLE);

            dataBinding.imageViewLocToLoc.setVisibility(View.VISIBLE);
            dataBinding.wacTextViewDistance.setVisibility(View.VISIBLE);
            dataBinding.wacTextViewKm.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        DetailHubActivity.this.finish();
        overridePendingTransition(0, 0);

    }

    public void openCart() {

        Intent i = new Intent();
        i.putExtra("GOTOCART", 1);
        setResult(RESULT_OK, i);
        onBackPressed();

    }

}
