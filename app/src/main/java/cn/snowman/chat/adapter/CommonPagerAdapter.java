package cn.snowman.chat.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页viewpager适配器
 */
public class CommonPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;

    public CommonPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        if (fragmentList == null) {
            fragmentList = new ArrayList<Fragment>();
        }
        this.mFragmentList = fragmentList;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
