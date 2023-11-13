package com.alpharamen.customer.view.ui.cart;

import androidx.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AlertDialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.alpharamen.customer.BR;
import com.alpharamen.customer.R;
import com.alpharamen.customer.base.BaseFragment;
import com.alpharamen.customer.data.models.CartItemModel;
import com.alpharamen.customer.databinding.FragmentCartBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.CartItemAdapterNew;
import com.alpharamen.customer.view.listener.CartItemQuantityChangeListener;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;
import com.alpharamen.customer.view.ui.home_page.HomeActivity;
import com.alpharamen.customer.viewmodel.CartViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends BaseFragment<FragmentCartBinding, CartViewModel> implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    List<CartItemModel> cartItemModels = new ArrayList<>();
    CartItemAdapterNew cartItemAdapter;
    CartItemModel itemModel;
    private AlertDialog alertDialog;
    int no = 1;
    float totalAmount = 0;
    float deliveryCharge = 0;
    int listSize;
    int itemsQuantity = 1;
    @Inject
    ViewModelProviderFactory mVviewModelFactory;
    FragmentCartBinding dataBinding;
    CartViewModel cartViewModel;

    public CartFragment() {
        // Required empty public constructor
    }

    /**
     * @return A new instance of fragment CartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CartFragment newInstance(String param1, String param2) {
        CartFragment fragment = new CartFragment();
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
        cartViewModel = ViewModelProviders.of(this, mVviewModelFactory).get(CartViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        dataBinding = getViewDataBinding();
        dataBinding.setCart(cartViewModel);
        dataBinding.setListener(this);

        populateData();
        //dataBinding.nestedScrollView.scrollTo(0, 0);
       /* dataBinding.recyclerViewCartItems.setNestedScrollingEnabled(false);
        dataBinding.nestedScrollView.fullScroll(View.FOCUS_UP);
        dataBinding.nestedScrollView.fullScroll(View.FOCUS_UP);*/

        //dataBinding.nestedScrollView.smoothScrollTo(0,0);

        // TODO: Jina and Yuqiao need to look into how to observe change in data

        if (getActivity() != null && getActivity() instanceof HomeActivity) {

            ((HomeActivity) getActivity()).hideBottomBar();
            ((HomeActivity) getActivity()).loadCartFragment();
        }

        refreshList();


    }

    private void refreshList() {
        totalAmount = 0;

        for (CartItemModel cartItemModel : cartItemModels) {

            totalAmount = totalAmount + (Float.valueOf(cartItemModel.getRate()) * cartItemModel.getNo());
        }
        listSize = cartItemModels.size();

        priceCalculation(listSize, totalAmount);

    }

    private void priceCalculation(int size, float Amount) {
        // TODO: Tina implement price calculation
    }

    CartItemQuantityChangeListener cartItemQuantityChangeListener = new CartItemQuantityChangeListener() {
        @Override
        public void increaseQuantity(CartItemModel cartItemModel) {
            totalAmount = totalAmount + (Float.valueOf(cartItemModel.getRate()));
            priceCalculation(listSize, totalAmount);


        }

        @Override
        public void decreaseQuantity(CartItemModel cartItemModel) {

            totalAmount = totalAmount - (Float.valueOf(cartItemModel.getRate()));
            priceCalculation(listSize, totalAmount);


        }
    };

    OnAdapterSelectedListener<CartItemModel> selectedListener = new OnAdapterSelectedListener<CartItemModel>() {
        @Override
        public void onAdapterSelected(CartItemModel model) {

        }

        @Override
        public void onAdapterString(String text) {


            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getContext());
            LayoutInflater inflater = CartFragment.this.getLayoutInflater();
            View dialogView = inflater.inflate(R.layout.cart_item_delete_diologue, null);
            TextView cancel = dialogView.findViewById(R.id.textView_cancel);
            TextView delete = dialogView.findViewById(R.id.text_view_delete);
            dialogBuilder.setView(dialogView);
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (alertDialog != null && alertDialog.isShowing()) {
                        alertDialog.dismiss();

                    }
                }
            });
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (CartItemModel cartItemModel : cartItemModels) {
                        if (cartItemModel.getId() == Integer.parseInt(text)) {
                            if (alertDialog != null && alertDialog.isShowing()) {
                                int index = cartItemModels.indexOf(cartItemModel);
                                cartItemModels.remove(cartItemModel);
                                cartItemAdapter.notifyItemRangeChanged(0, cartItemModels.size() - 1);
                                showToast(cartItemModel.getItenName() + " is removed");
                                //cartItemAdapter.notifyItemRemoved(index);
                                cartItemAdapter.notifyDataSetChanged();

                                refreshList();


                                alertDialog.dismiss();

                            }
                            break;
                        }
                    }
                    if (cartItemModels.size() == 0) {
                        // dataBinding.setEmpty(0);
                        // TODO: Tina Start Remove
                        /*
                        dataBinding.textViewRate.setVisibility(View.GONE);
                        dataBinding.textViewCheckout.setVisibility(View.GONE);
                        dataBinding.lottieAnimationView.setVisibility(View.VISIBLE);
                        dataBinding.cardViewOrderDetails.setVisibility(View.GONE);
                        dataBinding.cardViewAddress.setVisibility(View.GONE);
                        dataBinding.textViewContinueShopping.setVisibility(View.VISIBLE);
                        dataBinding.textViewNoItems.setVisibility(View.VISIBLE);
                        dataBinding.recyclerViewCartItems.setVisibility(View.GONE);
                        */
                        // TODO: Tina End Remove
                        if (getActivity() != null && getActivity() instanceof HomeActivity) {

                            ((HomeActivity) getActivity()).showBottomBar();
                        }
                    }
                }
            });
            alertDialog = dialogBuilder.create();
            if (alertDialog.getWindow() != null) {
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
            alertDialog.show();
            WindowManager.LayoutParams lp = new WindowManager.LayoutParams();

            // lp.copyFrom(alertDialog.getWindow().getAttributes());
            lp.copyFrom(alertDialog.getWindow().getAttributes());

            alertDialog.getWindow().setAttributes(lp);


        }
    };

    private void populateData() {
        // TODO: Discuss with Yuqiao about demo items to add to UI - what food items?
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
        return BR.cart;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_cart;
    }

    @Override
    public CartViewModel getBindingObject() {
        return cartViewModel;
    }

    @Override
    public void onClick(View v) {
        if (v == dataBinding.imageViewPrevArrow) {
            if (getActivity() != null && getActivity() instanceof HomeActivity) {

                ((HomeActivity) getActivity()).onBackPressed();

            }
        }
        // TODO: Fix making remain button clickable. We need more UI views
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // TODO: Yuqiao needs too look into how to handle data response

        if (requestCode == 100) {

            if (data != null && data.getExtras() != null) {
                // TODO: Handle updates to address information
            }

            }
        }


}
