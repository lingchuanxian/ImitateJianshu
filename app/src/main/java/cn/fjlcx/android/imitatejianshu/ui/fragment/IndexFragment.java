package cn.fjlcx.android.imitatejianshu.ui.fragment;

import cn.fjlcx.android.imitatejianshu.R;
import cn.fjlcx.android.imitatejianshu.base.BaseFragment;


/**
 * 首页Fragment
 *
 * @author ling_cx
 * @date 2017/11/03.
 */

public class IndexFragment extends BaseFragment{
    protected final String TAG = this.getClass().getSimpleName();

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_index;
    }

    @Override
    protected void initViews() {
        getToolBar().setTitle("简书")
                .setDisplayHomeAsUpEnabled(false);
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


    public static IndexFragment getInstance() {
        IndexFragment mPersonalFragment = new IndexFragment();
        return mPersonalFragment;
    }

}
