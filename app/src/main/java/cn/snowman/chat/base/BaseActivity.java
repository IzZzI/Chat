package cn.snowman.chat.base;

import android.content.Intent;

import com.zhy.autolayout.AutoLayoutActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by zhouzy on 2017/3/8.
 */

public class BaseActivity extends AutoLayoutActivity {

    private Unbinder unbinder;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();

    }
}
