package cn.fjlcx.android.imitatejianshu.global;

import android.app.Application;

import com.blankj.utilcode.util.Utils;
import com.squareup.leakcanary.LeakCanary;

import cn.fjlcx.android.imitatejianshu.di.component.AppComponent;
import cn.fjlcx.android.imitatejianshu.di.component.DaggerAppComponent;
import cn.fjlcx.android.imitatejianshu.di.module.AppModule;

/**
 * class description here
 *
 * @author ling_cx
 * @date 2017/11/02.
 */

public class AppContext extends Application {
	private static AppContext instance;
	/**
	 * activity管理类
	 */
	private ActivityManager activityManager = null;
	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
		if (LeakCanary.isInAnalyzerProcess(this)) {
			return;
		}
		activityManager = ActivityManager.getInstance();
		Utils.init(this);
	}

	public static AppContext getInstance() {
		return instance;
	}

	public ActivityManager getActivityManager() {
		return activityManager;
	}

	public AppComponent getAppComponent(){
		return DaggerAppComponent.builder()
				.appModule(new AppModule(this))
				.build();
	}

	public void finishAllActivity(){
		activityManager.finishAllActivity();
	}
}
