package cn.snowman.chat.proxy;

import android.os.Bundle;

import cn.snowman.chat.base.BasePresenter;
import cn.snowman.chat.base.BaseView;
import cn.snowman.chat.factory.PresenterFactoryImpl;


/**
 * Created by zhouzy on 2017-12-12
 */

public class PresenterProxy {

    private static final String PRESENTER_KEY = "presenterKey";
    private PresenterFactoryImpl mFactory;
    private BasePresenter mPresenter;
    private Bundle mBundle;
    private boolean mIsAttchView;

    public PresenterProxy(Class<?> viewClass) {
        mFactory = PresenterFactoryImpl.getInstance(viewClass);
    }

    /**
     * 绑定Presenter和view
     *
     * @param view
     */
    public void onResume(BaseView view) {
        getMvpPresenter();
        if (mPresenter != null && !mIsAttchView) {
            mPresenter.onAttachView(view);
            mIsAttchView = true;
        }
    }

    /**
     * 获取创建的Presenter
     *
     * @return 指定类型的Presenter
     * 如果之前创建过，而且是以外销毁则从Bundle中恢复
     */
    public BasePresenter getMvpPresenter() {
        if (mFactory != null) {
            if (mPresenter == null) {
                mPresenter = mFactory.createPresenter();
                mPresenter.onCreate(mBundle == null ? null : mBundle.getBundle(PRESENTER_KEY));
            }
        }
        return mPresenter;
    }

    /**
     * 销毁Presenter
     */
    public void onDestroy() {
        if (mPresenter != null) {
            onDetachView();
            mPresenter.onDestroy();
            mPresenter = null;
        }
    }

    /**
     * 销毁Presenter持有的View
     */
    private void onDetachView() {
        if (mPresenter != null && mIsAttchView) {
            mPresenter.onDetachView();
            mIsAttchView = false;
        }
    }

    /**
     * 意外销毁的时候调用
     *
     * @return Bundle，存入回调给Presenter的Bundle和当前Presenter的id
     */
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        getMvpPresenter();
        if (mPresenter != null) {
            Bundle presenterBundle = new Bundle();
            //回调Presenter
            mPresenter.onSaveInstanceState(presenterBundle);
            bundle.putBundle(PRESENTER_KEY, presenterBundle);
        }
        return bundle;
    }

    /**
     * 意外关闭恢复Presenter
     *
     * @param savedInstanceState 意外关闭时存储的Bundler
     */
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        mBundle = savedInstanceState;
    }


}
