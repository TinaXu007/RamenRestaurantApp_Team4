package com.alpharamen.customer.view.ui.offer_detail;

import androidx.lifecycle.ViewModelProviders;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseActivity;
import com.alpharamen.customer.data.models.AboutOfferModel;
import com.alpharamen.customer.data.models.OffersModel;
import com.alpharamen.customer.data.models.TermsAndConditionsModel;
import com.alpharamen.customer.databinding.ActivityOfferDetailBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.AboutOfferAdapter;
import com.alpharamen.customer.view.adapter.TermsAndConditionsAdapter;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;
import com.alpharamen.customer.viewmodel.OfferDetailViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class OfferDetailActivity extends BaseActivity implements View.OnClickListener {
    List<AboutOfferModel> aboutOfferModels = new ArrayList<>();
    List<TermsAndConditionsModel> termsAndConditionsModels = new ArrayList<>();
    AboutOfferAdapter aboutOfferAdapter;
    TermsAndConditionsAdapter termsAndConditionsAdapter;
    @Inject
    ViewModelProviderFactory mViewModelFactory;
    ActivityOfferDetailBinding dataBinding;
    OfferDetailViewModel offerDetailViewModel;

    @Override
    public int getBindingVariable() {
        return BR.offerDetail;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_offer_detail;
    }

    @Override
    public Object getBindingObject() {
        return offerDetailViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        offerDetailViewModel = ViewModelProviders.of(this, mViewModelFactory).get(OfferDetailViewModel.class);
        dataBinding = (ActivityOfferDetailBinding) getViewDataBinding();
        dataBinding.setListener(this);
        populateData();

        aboutOfferAdapter = new AboutOfferAdapter(aboutOfferModels, aboutOfferListener);
        dataBinding.recyclerViewAbout.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
        dataBinding.recyclerViewAbout.setHasFixedSize(true);
        dataBinding.recyclerViewAbout.setAdapter(aboutOfferAdapter);


        termsAndConditionsAdapter = new TermsAndConditionsAdapter(termsAndConditionsModels, termsAndConditionsListener);
        dataBinding.recyclerViewTerms.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
        dataBinding.recyclerViewTerms.setHasFixedSize(true);
        dataBinding.recyclerViewTerms.setAdapter(termsAndConditionsAdapter);

        OffersModel offersModel = getIntent().getParcelableExtra("OFFERMODEL");
        dataBinding.setItem(offersModel);
//        dataBinding.textViewOffer.setText(offersModel.getOfferCode());


    }

    OnAdapterSelectedListener<AboutOfferModel> aboutOfferListener = new OnAdapterSelectedListener<AboutOfferModel>() {
        @Override
        public void onAdapterSelected(AboutOfferModel model) {

        }

        @Override
        public void onAdapterString(String text) {

        }
    };

    OnAdapterSelectedListener<TermsAndConditionsModel> termsAndConditionsListener = new OnAdapterSelectedListener<TermsAndConditionsModel>() {
        @Override
        public void onAdapterSelected(TermsAndConditionsModel model) {

        }

        @Override
        public void onAdapterString(String text) {

        }
    };

    private void populateData() {

        aboutOfferModels.add(new AboutOfferModel("1. 10% points rewards, upto 20 points when you pay using this offer."));
        aboutOfferModels.add(new AboutOfferModel("2. Use promocode \"REWARDS10\""));
        aboutOfferModels.add(new AboutOfferModel("3. 50% cashback, upto 20 points when you pay using this offer."));
        aboutOfferModels.add(new AboutOfferModel("4. Use promocode \"REWARDS10\""));


        termsAndConditionsModels.add(new TermsAndConditionsModel("1. 10% points rewards, upto 20 points when you pay using this offer."));
        termsAndConditionsModels.add(new TermsAndConditionsModel("2. Use promocode \"REWARDS10\""));
        termsAndConditionsModels.add(new TermsAndConditionsModel("3. 10% points rewards, upto 20 points when you pay using this offer."));
        termsAndConditionsModels.add(new TermsAndConditionsModel("4. Use promocode \"REWARDS10\""));
    }

    @Override
    public void onClick(View v) {

        String text = dataBinding.textViewOffer.getText().toString();
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

        if (v == dataBinding.imageViewPrevious) {
            onBackPressed();

        } else if (v == dataBinding.textViewCopy) {

            ClipData clip = ClipData.newPlainText("text", text);
            if (clipboard != null) {
                clipboard.setPrimaryClip(clip);
            }
            showToast(text + " copied");

        } else if (v == dataBinding.textViewCopyCode) {

            ClipData clip = ClipData.newPlainText("text", text);
            if (clipboard != null) {
                clipboard.setPrimaryClip(clip);
            }
            // showToast(text + " copied");

            Intent i = new Intent();
            i.putExtra("GOTOFOODLIST", 1);
            setResult(RESULT_OK, i);
            onBackPressed();

        }

    }

    public static Intent newIntent(Context context) {
        return new Intent(context, OfferDetailActivity.class);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        OfferDetailActivity.this.finish();
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);

    }
}
