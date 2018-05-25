package cn.snowman.chat.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.snowman.chat.R;
import cn.snowman.chat.adapter.CommonPagerAdapter;
import cn.snowman.chat.base.BaseActivity;
import cn.snowman.chat.fragment.SecretFragment;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewpager_main_container)
    ViewPager viewpagerMainContainer;
    private SecretFragment mSecretFragment;
    private CommonPagerAdapter mCommonPagerAdapter;
    private List<Fragment> mFragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mFragmentList = new ArrayList<>();
        mSecretFragment = new SecretFragment();
        mFragmentList.add(mSecretFragment);
        mCommonPagerAdapter = new CommonPagerAdapter(getSupportFragmentManager(), mFragmentList);
        viewpagerMainContainer.setAdapter(mCommonPagerAdapter);
    }
}
