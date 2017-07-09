package com.dagger.bahrulhikmi.dagger2_example;

import android.app.Application;
import android.content.Context;

import com.dagger.bahrulhikmi.dagger2_example.data.DataManager;

import javax.inject.Inject;

/**
 * Created by bar on 09/07/2017.
 */

public class DemoApplication extends Application {

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
