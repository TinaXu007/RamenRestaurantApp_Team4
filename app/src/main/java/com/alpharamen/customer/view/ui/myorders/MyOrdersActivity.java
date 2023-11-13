package com.alpharamen.customer.view.ui.myorders;

import androidx.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseActivity;
import com.alpharamen.customer.data.models.MyordersItemModel;
import com.alpharamen.customer.databinding.ActivityMyOrdersBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.OrderListAdapter;
import com.alpharamen.customer.view.listener.MyOrdersListItemClickListener;
import com.alpharamen.customer.view.ui.track_item.TrackItemActivity;
import com.alpharamen.customer.viewmodel.MyOrdersViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MyOrdersActivity extends BaseActivity<ActivityMyOrdersBinding, MyOrdersViewModel> implements MyOrdersListItemClickListener {

    ActivityMyOrdersBinding dataBinding;
    MyOrdersViewModel myOrdersViewModel;
    // MyordersAdapter myordersAdapter;
    OrderListAdapter adapter;
    List<MyordersItemModel> myordersItemModels = new ArrayList<>();

    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    @Override
    public int getBindingVariable() {
        return BR.myorders;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_my_orders;
    }

    @Override
    public MyOrdersViewModel getBindingObject() {
        return myOrdersViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myOrdersViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(MyOrdersViewModel.class);
        dataBinding = getViewDataBinding();
        dataBinding.setListener(onClickListener);
        populateData();
        //myordersAdapter = new MyordersAdapter(myordersItemModels, this);
        adapter = new OrderListAdapter(myordersItemModels, this, MyOrdersActivity.this);
        dataBinding.recyclerViewOrders.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
        dataBinding.recyclerViewOrders.setHasFixedSize(true);
        dataBinding.recyclerViewOrders.setAdapter(adapter);

    }

    private void populateData() {

        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Pending", 0));
        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Pending", 0));
        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Cancelled", 1));
        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Delivered", 2));
        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Delivered", 2));
        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Delivered", 2));
        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Delivered", 2));
        myordersItemModels.add(new MyordersItemModel("Miso Ramen", "Mintzza Food Mall", "₹56", "Delivered", 2));


    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == dataBinding.imageViewPrevArrow) {
                onBackPressed();
                overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
            }

        }
    };


    public static Intent newIntent(Context context) {
        return new Intent(context, MyOrdersActivity.class);
    }

    @Override
    public void click(MyordersItemModel myordersItemModel) {

        /*pending-0
        cancelled-1
        devilered-2    */


        for (MyordersItemModel itemModel : myordersItemModels) {
            if (itemModel.equals(myordersItemModel)) {
                if (itemModel.getId() == 2) {
                    itemModel.setSelected(!itemModel.isSelected());

                } else if (itemModel.getId() == 0) {
                    itemModel.setSelected(false);

                    Intent i = TrackItemActivity.newIntent(getApplicationContext());
                    startActivity(i);
                    overridePendingTransition(0, 0);
                }else if(itemModel.getId()==1){
                    itemModel.setSelected(false);
                }


            } else {
                itemModel.setSelected(false);
            }
        }
        adapter.notifyDataSetChanged();

    }
}
