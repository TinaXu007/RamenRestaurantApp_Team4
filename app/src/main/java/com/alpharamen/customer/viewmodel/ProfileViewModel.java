package com.alpharamen.customer.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.alpharamen.customer.base.BaseViewModel;
import com.alpharamen.customer.data.remote.bean.UserProfileBean;
import com.alpharamen.customer.data.repository.FoodRepository;
import com.alpharamen.customer.utils.AppLogger;
import com.alpharamen.customer.utils.InternetUtils;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

@Singleton
public class ProfileViewModel extends BaseViewModel {

    private MutableLiveData<UserProfileBean> responseLiveData = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private FoodRepository homeRepository;
    @Inject
    InternetUtils internetUtils;

    @Inject
    public ProfileViewModel(FoodRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    private void fetchUserProfile() {
        setIsLoading(true);
        disposable.add(homeRepository.getUserProfile(4)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onProfileSuccess, this::onProfileFail));
    }

    public LiveData<UserProfileBean> getUserProfile() {
        if (internetUtils.isNetworkAvailable())
            fetchUserProfile();
        else
            setNoInternetError();
        return this.responseLiveData;
    }

    private void onProfileSuccess(UserProfileBean homePageBean) {
        responseLiveData.setValue(homePageBean);
        AppLogger.d("Complete API call");
        setIsLoading(false);
    }

    private void onProfileFail(Throwable e) {
        responseLiveData.setValue(UserProfileBean.failureResponse());
        setIsLoading(false);
    }

    @Override
    protected void onCleared() {
        disposable.clear();
        super.onCleared();
    }
}
