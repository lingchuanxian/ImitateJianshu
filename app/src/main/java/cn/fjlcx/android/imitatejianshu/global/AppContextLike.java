package cn.fjlcx.android.imitatejianshu.global;

import android.app.Application;
import android.content.Intent;

/**
 * class description here
 *
 * @author ling_cx
 * @date 2017/11/10
 */

@DefaultLifeCycle(
		application = ".AppContext", flags = ShareConstants.TINKER_ENABLE_ALL
)
public class AppContextLike extends ApplicationLike {


	public AppContextLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
		super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
	}

	@Override
	public void onCreate() {
		super.onCreate();
		TinkerInstaller.install(this);
	}
}
