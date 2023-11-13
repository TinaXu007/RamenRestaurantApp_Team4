package com.alpharamen.customer.dagger.component;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ViewModel;
import android.content.Context;
import androidx.fragment.app.Fragment;

import com.alpharamen.customer.application.BaseApp;
import com.alpharamen.customer.dagger.ApplicationContext;
import com.alpharamen.customer.dagger.module.ActivityProvider;
import com.alpharamen.customer.dagger.module.ApplicationModule;
import com.alpharamen.customer.dagger.module.FragmentProvider;
import com.alpharamen.customer.dagger.module.ViewModelModule;
import com.alpharamen.customer.data.local.preference.PreferencesHandler;
import com.alpharamen.customer.data.remote.WebService;
import com.alpharamen.customer.utils.InternetUtils;

import java.util.Map;

import javax.inject.Provider;
import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ApplicationModule.class,
        ViewModelModule.class,
        AndroidSupportInjectionModule.class,
        FragmentProvider.class,
        ActivityProvider.class})
public interface ApplicationComponent {

    void inject(BaseApp app);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    WebService getWebService();

    PreferencesHandler getPreferencesHandler();

    //MusicDbHelper getMusicDbHelper();

    InternetUtils getInternetUtils();

    Map<Class<? extends ViewModel>, Provider<ViewModel>> creators();

    Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>> provideFragment();

    Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>> provideActivity();
}
