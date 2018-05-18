package cn.snowman.chat.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.snowman.chat.proxy.PresenterProxy;


/**
 * Created by zhouzy on 2017-12-8
 */

public class BaseMvpActivity extends Activity implements BaseView {

    private PresenterProxy mPresenterProxy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenterProxy = new PresenterProxy(getClass());
        if (savedInstanceState != null) {
            mPresenterProxy.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mPresenterProxy.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenterProxy.onResume(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mPresenterProxy.onSaveInstanceState();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenterProxy.onDestroy();
    }

    public BasePresenter getPresenter() {
        return mPresenterProxy.getMvpPresenter();
    }

}
