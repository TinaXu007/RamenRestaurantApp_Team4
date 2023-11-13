package com.alpharamen.customer.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.alpharamen.customer.base.BaseViewModel;
import com.alpharamen.customer.data.remote.bean.SplashBean;
import com.alpharamen.customer.data.repository.FoodRepository;
import com.alpharamen.customer.utils.AppLogger;
import com.alpharamen.customer.utils.InternetUtils;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

@Singleton
public class SplashViewModel extends BaseViewModel {

    private MutableLiveData<SplashBean> responseLiveData = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private FoodRepository homeRepository;
    @Inject
    InternetUtils internetUtils;

    @Inject
    public SplashViewModel(FoodRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    private void fetchConfig() {
       setIsLoading(true);
        disposable.add(homeRepository.getConfig(4)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onSplashSuccess, this::onSplashFail));
    }

    private void onSplashSuccess(SplashBean homePageBean){
        responseLiveData.setValue(homePageBean);
        AppLogger.d("Complete API call");
        setIsLoading(false);
    }

    private void onSplashFail(Throwable t){
        responseLiveData.setValue(SplashBean.failureResponse());
        setIsLoading(false);
    }

    public LiveData<SplashBean> getConfig() {
        responseLiveData = new MutableLiveData<>();
        fetchConfig();
        return this.responseLiveData;
    }

    @Override
    protected void onCleared() {
        disposable.clear();
        super.onCleared();
    }
}
