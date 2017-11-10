package cn.fjlcx.android.imitatejianshu.di.component;

import android.content.Context;

import javax.inject.Singleton;

import cn.fjlcx.android.imitatejianshu.api.ApiService;
import cn.fjlcx.android.imitatejianshu.di.module.AppModule;
import dagger.Component;

/**
 * @author ling_cx
 * @date 2017/11/02.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context context();  // 提供Applicaiton的Context
    ApiService apiService();
}
