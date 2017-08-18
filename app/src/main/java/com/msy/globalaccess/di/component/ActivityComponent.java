package com.msy.globalaccess.di.component;

import android.app.Activity;
import android.content.Context;

import com.msy.globalaccess.business.demo.activities.NewsActivity;
import com.msy.globalaccess.di.module.ActivityModule;
import com.msy.globalaccess.di.qualifier.ContextLife;
import com.msy.globalaccess.di.scope.PerActivity;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by hxy on 2016/12/7 0007.
 * <p>
 * description :
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    Retrofit getRetrofit();

    void inject(NewsActivity activity);

}
