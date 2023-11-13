package com.alpharamen.customer.view.ui.offers;


import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.View;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseFragment;
import com.alpharamen.customer.data.models.OffersModel;
import com.alpharamen.customer.databinding.FragmentOffersBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.OffersAdapter;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;
import com.alpharamen.customer.view.ui.home_page.HomeActivity;
import com.alpharamen.customer.viewmodel.OffersViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OffersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OffersFragment extends BaseFragment<FragmentOffersBinding, OffersViewModel> implements OnAdapterSelectedListener<OffersModel> {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    FragmentOffersBinding datainding;
    List<OffersModel> offersModels = new ArrayList<>();
    OffersAdapter offersAdapter;
    @Inject
    ViewModelProviderFactory mVviewModelFactory;
    OffersViewModel offersViewModel;


    public OffersFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OffersFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OffersFragment newInstance(String param1, String param2) {
        OffersFragment fragment = new OffersFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.offers;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_offers;
    }

    @Override
    public OffersViewModel getBindingObject() {
        return offersViewModel;
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

        offersViewModel = ViewModelProviders.of(this, mVviewModelFactory).get(OffersViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        datainding = getViewDataBinding();
        datainding.setOffers(offersViewModel);
        if (getActivity() != null && getActivity() instanceof HomeActivity) {

            ((HomeActivity) getActivity()).loadOffersFragment();
        }
        populatData();
        offersAdapter = new OffersAdapter(offersModels, this);
        datainding.recyclerViewOffers.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        datainding.recyclerViewOffers.setHasFixedSize(true);
        datainding.recyclerViewOffers.setAdapter(offersAdapter);

    }

    private void populatData() {

        offersModels.add(new OffersModel("FREE LARGE BUBBLE TEA", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "FREEBT"));
        offersModels.add(new OffersModel("TUESDAY RAMEN OFFER", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "TUERAMEN"));
        offersModels.add(new OffersModel("FREE NOODLES", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "FREENOODLES OFFER"));
        offersModels.add(new OffersModel("BUY ONE GET ONE FOR 50% ", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "BUYHALF"));
        offersModels.add(new OffersModel("FREE GYOZA", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "FREEGYOZA"));
        offersModels.add(new OffersModel("BUY ONE DRINK GET SECOND FREE", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "SECONDFREE"));
        offersModels.add(new OffersModel("ONE FREE EXTRA ADD ON", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "FREEADD"));
        offersModels.add(new OffersModel("BUY ONE RAMEN GET SECOND FREE", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "RAMENFREE"));
        offersModels.add(new OffersModel("25% OFF FOR ALL ORDER", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "25OFF"));
        offersModels.add(new OffersModel("10% OFF FOR DRINK", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "DRINK10"));
        offersModels.add(new OffersModel("$5 OFF FOR ORDER OVER $30", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "ORDER5"));
        offersModels.add(new OffersModel("$10 OFF GOT ORDER OVER $50", "1 OCTOBER 2023 - 31 December 2023",
                R.drawable.special_offer, "ORDER10"));

    }


    @Override
    public void onAdapterSelected(OffersModel model) {

        if (model != null) {

            ((HomeActivity) Objects.requireNonNull(getActivity())).openOfferDetail(model);
        }


    }

    @Override
    public void onAdapterString(String text) {

    }
}
