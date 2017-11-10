package cn.fjlcx.android.imitatejianshu.ui.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

import butterknife.BindView;
import cn.fjlcx.android.imitatejianshu.R;
import cn.fjlcx.android.imitatejianshu.base.BaseActivity;
import cn.fjlcx.android.imitatejianshu.bean.TabBean;
import cn.fjlcx.android.imitatejianshu.global.ViewPagerSetting;
import cn.fjlcx.android.imitatejianshu.ui.adapter.PagerAdapter;
import cn.fjlcx.android.imitatejianshu.ui.fragment.IndexFragment;
import cn.fjlcx.android.imitatejianshu.ui.fragment.PersonalFragment;

/**
 * 主页
 * @author ling_cx
 * @date 2017/11/03.
 */

public class HomeActivity extends BaseActivity {

	@BindView(R.id.vpContent)
	ViewPager mVpContent;
	@BindView(R.id.ctlMenu)
	CommonTabLayout mCtlMenu;

	private ArrayList<Fragment> mFragments = new ArrayList<>();
	private String[] mTitles = {"首页", "发现", "消息","我的"};
	private int[] mIconUnselectIds = {
			R.mipmap.tab_homepage_unchecked, R.mipmap.tab_find_unchecked,
			R.mipmap.tab_message_unchecked,R.mipmap.tab_people_unchecked};
	private int[] mIconSelectIds = {
			R.mipmap.tab_homepage_checked, R.mipmap.tab_find_checked,
			R.mipmap.tab_message_checked,R.mipmap.tab_people_checked};
	private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();

	@Override
	protected int attachLayoutRes() {
		return R.layout.activity_home;
	}

	@Override
	protected void initViews() {
		getToolBar().hide();
		mFragments.add(IndexFragment.getInstance());
		mFragments.add(IndexFragment.getInstance());
		mFragments.add(IndexFragment.getInstance());
		mFragments.add(PersonalFragment.getInstance());

		for (int i = 0; i < mTitles.length; i++) {
			mTabEntities.add(new TabBean(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
		}
		mVpContent.setAdapter(new PagerAdapter(getSupportFragmentManager(),mFragments,mTitles));
		mVpContent.setOffscreenPageLimit(3);
		mCtlMenu.setTabData(mTabEntities);
		ViewPagerSetting.commonSettingWithCommonTabLayout(mVpContent,mCtlMenu);
		mCtlMenu.setOnTabSelectListener(new OnTabSelectListener() {
			@Override
			public void onTabSelect(int position) {
				Log.d(TAG, "onTabSelect: ");
				mVpContent.setCurrentItem(position);
			}
			@Override
			public void onTabReselect(int position) {
				Log.d(TAG, "onTabReselect: ");
			}
		});
	}

	@Override
	protected void initData() {

	}

	@Override
	protected void initInject() {

	}

	/**
	 * 按返回键后台运行程序
	 */
	@Override
	public void onBackPressed() {
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		intent.addCategory(Intent.CATEGORY_HOME);
		startActivity(intent);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
