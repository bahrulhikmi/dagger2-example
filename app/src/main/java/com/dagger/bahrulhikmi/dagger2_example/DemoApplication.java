package com.dagger.bahrulhikmi.dagger2_example;

import android.app.Application;
import android.content.Context;

import com.dagger.bahrulhikmi.dagger2_example.data.DataManager;
import com.dagger.bahrulhikmi.dagger2_example.di.ApplicationComponent;
import com.dagger.bahrulhikmi.dagger2_example.di.ApplicationModule;
import com.dagger.bahrulhikmi.dagger2_example.di.DaggerApplicationComponent;

import javax.inject.Inject;


public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager mDataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);

    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }

}
