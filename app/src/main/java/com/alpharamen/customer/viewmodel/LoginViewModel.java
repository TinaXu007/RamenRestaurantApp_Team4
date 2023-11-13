package com.alpharamen.customer.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.alpharamen.customer.base.BaseViewModel;
import com.alpharamen.customer.data.remote.bean.LoginBean;
import com.alpharamen.customer.data.remote.bean.LoginRequest;
import com.alpharamen.customer.data.repository.FoodRepository;
import com.alpharamen.customer.utils.AppLogger;
import com.alpharamen.customer.utils.InternetUtils;
import com.alpharamen.customer.utils.ValidateUtils;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

@Singleton
public class LoginViewModel extends BaseViewModel {

    private MutableLiveData<LoginBean> responseLiveData = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private FoodRepository homeRepository;
    @Inject
    InternetUtils internetUtils;

    @Inject
    public LoginViewModel(FoodRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    public void performValidation(String email, String password) {
        if (internetUtils.isNetworkAvailable()) {
            if (!ValidateUtils.isEmailValid(email)){
                setErrorMessage("Email not valid");
            }else if (password.isEmpty()) {
                setErrorMessage("Password cannot be empty");
            }else {
                setIsLoading(true);
                disposable.add(homeRepository.performLogin(new LoginRequest(email, password))
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(this::onLoginSuccess, this::onLoginFail));
            }
        }else{
            setNoInternetError();
        }
    }

    private void onLoginSuccess(LoginBean homePageBean) {
        responseLiveData.setValue(homePageBean);
        AppLogger.d("Complete API call");
        setIsLoading(false);
    }

    private void onLoginFail(Throwable e) {
        responseLiveData.setValue(LoginBean.failureResponse());
        setIsLoading(false);
    }

    public LiveData<LoginBean> subscribeLogin() {
        return this.responseLiveData;
    }

    @Override
    protected void onCleared() {
        disposable.clear();
        super.onCleared();
    }
}
