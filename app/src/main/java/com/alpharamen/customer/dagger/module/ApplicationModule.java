package com.alpharamen.customer.dagger.module;

import android.app.Application;
import android.content.Context;

import com.alpharamen.customer.dagger.ApplicationContext;

import dagger.Module;
import dagger.Provides;


@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

}
