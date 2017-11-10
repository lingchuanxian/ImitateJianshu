package cn.fjlcx.android.imitatejianshu.di.module;

import android.content.Context;

import javax.inject.Singleton;

import cn.fjlcx.android.imitatejianshu.api.ApiEngine;
import cn.fjlcx.android.imitatejianshu.api.ApiService;
import dagger.Module;
import dagger.Provides;

/**
 * @author ling_cx
 * @date 2017/11/02.
 */
@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return context;
    }


    @Provides
    @Singleton
    public ApiService provideApiService() {
        return ApiEngine.getInstance().getApiService();
    }
}
