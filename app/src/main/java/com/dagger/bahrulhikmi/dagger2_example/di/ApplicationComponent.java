package com.dagger.bahrulhikmi.dagger2_example.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.dagger.bahrulhikmi.dagger2_example.DemoApplication;
import com.dagger.bahrulhikmi.dagger2_example.data.DataManager;
import com.dagger.bahrulhikmi.dagger2_example.data.DbHelper;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication app);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPreferences getSharedPreferences();

    DbHelper getDbHelper();


}
