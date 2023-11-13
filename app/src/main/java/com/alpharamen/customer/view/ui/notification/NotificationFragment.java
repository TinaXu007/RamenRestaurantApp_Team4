package com.alpharamen.customer.view.ui.notification;


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
import com.alpharamen.customer.data.models.NotificationItemModel;
import com.alpharamen.customer.databinding.FragmentNotificationBinding;
import com.alpharamen.customer.factory.ViewModelProviderFactory;
import com.alpharamen.customer.view.adapter.NotificationItemAdapter;
import com.alpharamen.customer.view.listener.OnAdapterSelectedListener;
import com.alpharamen.customer.view.ui.home_page.HomeActivity;
import com.alpharamen.customer.viewmodel.NotificationFragmentViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NotificationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotificationFragment extends BaseFragment<FragmentNotificationBinding, NotificationFragmentViewModel> {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    NotificationFragmentViewModel notificationFragmentViewModel;
    FragmentNotificationBinding dataBinding;
    List<NotificationItemModel> notificationItemModelList = new ArrayList<>();
    NotificationItemAdapter notificationItemAdapter;
    @Inject
    ViewModelProviderFactory mVviewModelFactory;

    public NotificationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NotificationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NotificationFragment newInstance(String param1, String param2) {
        NotificationFragment fragment = new NotificationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.notify;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_notification;
    }

    @Override
    public NotificationFragmentViewModel getBindingObject() {
        return notificationFragmentViewModel;
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
        notificationFragmentViewModel = ViewModelProviders.of(this, mVviewModelFactory).get(NotificationFragmentViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        dataBinding = getViewDataBinding();
        dataBinding.setNotify(notificationFragmentViewModel);
        if (getActivity() != null && getActivity() instanceof HomeActivity) {

            //((HomeActivity) getActivity()).hideBottomBar();
            ((HomeActivity) getActivity()).loadNotificationFragment();
        }
        // TODO: We need to populate the data here without blocking ui

        notificationItemAdapter = new NotificationItemAdapter(notificationItemModelList, adapterSelectedListener);
        dataBinding.recyclerViewNotificationList.setHasFixedSize(true);
        dataBinding.recyclerViewNotificationList.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        dataBinding.recyclerViewNotificationList.setAdapter(notificationItemAdapter);

    }

    OnAdapterSelectedListener<NotificationItemModel> adapterSelectedListener = new OnAdapterSelectedListener<NotificationItemModel>() {
        @Override
        public void onAdapterSelected(NotificationItemModel model) {
            for (NotificationItemModel itemModel : notificationItemModelList) {
                if (itemModel.equals(model)) {
                    if (itemModel.getId() == 1) {
                        itemModel.setSelected(!itemModel.isSelected());
                        if(itemModel.isSelected()){

                        }


                    } else {
                        itemModel.setSelected(false);

                    }
                } else {
                    itemModel.setSelected(false);

                }
            }
        }

        @Override
        public void onAdapterString(String text) {

        }
    };
}
