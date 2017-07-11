package com.dagger.bahrulhikmi.dagger2_example.di;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bar on 11/07/2017.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity act)
    {
        mActivity = act;
    }

    @Provides
    @ActivityContext
    Context provideContext()
    {
        return mActivity;
    }

    @Provides
    Activity provideActivity()
    {
        return mActivity;
    }
}
