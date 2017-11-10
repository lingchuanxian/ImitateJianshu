package cn.fjlcx.android.imitatejianshu.ui.fragment;

import android.view.Menu;
import android.view.MenuInflater;

import cn.fjlcx.android.imitatejianshu.R;
import cn.fjlcx.android.imitatejianshu.base.BaseFragment;


/**
 * 首页Fragment
 *
 * @author ling_cx
 * @date 2017/11/03.
 */

public class PersonalFragment extends BaseFragment{
    protected final String TAG = this.getClass().getSimpleName();
    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_personal;
    }

    @Override
    protected void initViews() {
        getToolBar().setTitle("我的")
                .setDisplayHomeAsUpEnabled(false);
        setHasOptionsMenu(true);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initInject() {
    }

    @Override
    protected String[] getNeedPermissions() {
        return new String[0];
    }


    public static PersonalFragment getInstance() {
        PersonalFragment mPersonalFragment = new PersonalFragment();
        return mPersonalFragment;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.personal_menu,menu);
    }
}
