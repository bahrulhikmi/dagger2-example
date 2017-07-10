package com.dagger.bahrulhikmi.dagger2_example.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app)
    {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext()
    {
        return mApplication;
    }

    @Provides
    Application provideApplication()
    {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName()
    {
        return "example-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion()
    {
        return 1;
    }

    @Provides
    SharedPreferences provideSharedPreference()
    {
        return  mApplication.getSharedPreferences("example-prefs", Context.MODE_PRIVATE);
    }
}
