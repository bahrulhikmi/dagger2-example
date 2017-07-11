package com.dagger.bahrulhikmi.dagger2_example.di;

import com.dagger.bahrulhikmi.dagger2_example.MainActivity;

import dagger.Component;

/**
 * Created by bar on 11/07/2017.
 */

@PerActivity
@Component (dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
