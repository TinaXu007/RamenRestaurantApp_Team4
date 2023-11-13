package com.alpharamen.customer.view.ui.filter_result;

import androidx.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseActivity;
import com.alpharamen.customer.data.models.FilterResultModel;
import com.alpharamen.customer.databinding.ActivityFilterResultBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.FilterResultAdapter;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;
import com.alpharamen.customer.viewmodel.FilterResultViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class FilterResultActivity extends BaseActivity<ActivityFilterResultBinding, FilterResultViewModel> implements View.OnClickListener {

    ActivityFilterResultBinding dataBinding;
    FilterResultAdapter filterResultAdapter;
    List<FilterResultModel> filterResultModelList = new ArrayList<>();

    @Inject
    ViewModelProviderFactory viewModelProviderFactory;
    FilterResultViewModel filterResultViewModel;

    @Override
    public int getBindingVariable() {
        return BR.filterResult;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_filter_result;
    }

    @Override
    public FilterResultViewModel getBindingObject() {
        return filterResultViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        filterResultViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(FilterResultViewModel.class);
        dataBinding = getViewDataBinding();
        dataBinding.setListener(this::onClick);
        populateData();

        filterResultAdapter = new FilterResultAdapter(filterResultModelList, selectedListener);
        dataBinding.recyclerViewFilterResult.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
        dataBinding.recyclerViewFilterResult.setHasFixedSize(true);
        dataBinding.recyclerViewFilterResult.setAdapter(filterResultAdapter);

    }

    private void populateData() {

        filterResultModelList.add(new FilterResultModel(0, "Miso Ramen", "Mintza", "170"));
        filterResultModelList.add(new FilterResultModel(1, "Miso Ramen", "Mintza", "170"));
        filterResultModelList.add(new FilterResultModel(2, "Miso Ramen", "Mintza", "170"));
        filterResultModelList.add(new FilterResultModel(3, "Miso Ramen", "Mintza", "170"));
        filterResultModelList.add(new FilterResultModel(4, "Miso Ramen", "Mintza", "170"));
        filterResultModelList.add(new FilterResultModel(5, "Miso Ramen", "Mintza", "170"));
        filterResultModelList.add(new FilterResultModel(6, "Miso Ramen", "Mintza", "170"));
        filterResultModelList.add(new FilterResultModel(7, "Miso Ramen", "Mintza", "170"));

    }

    @Override
    public void onClick(View v) {

    }

    OnAdapterSelectedListener<FilterResultModel> selectedListener = new OnAdapterSelectedListener<FilterResultModel>() {
        @Override
        public void onAdapterSelected(FilterResultModel model) {

        }

        @Override
        public void onAdapterString(String text) {

        }
    };

    public static Intent newIntent(Context context) {
        return new Intent(context, FilterResultActivity.class);
    }
}
