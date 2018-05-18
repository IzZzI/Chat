package cn.snowman.chat.base;

import android.os.Bundle;

/**
 * Created by zhouzy on 2017-12-8
 */

public class BasePresenter {
    /**
     * v层
     */
    private BaseView mView;


    /**
     * 获取V层
     *
     * @return
     */
    public BaseView getView() {
        return this.mView;
    }

    /**
     * 绑定V层
     *
     * @param view
     */
    public void onAttachView(BaseView view) {
        this.mView = view;
    }

    /**
     * 解绑V层
     */
    public void onDetachView() {
        this.mView = null;
    }

    /**
     * 创建presenter时调用
     * @param savedState
     */
    public void onCreate(Bundle savedState) {

    }

    /**
     * 销毁presenter时调用
     */
    public void onDestroy() {

    }

    /**
     * 在Presenter意外销毁的时候被调用，它的调用时机和Activity、Fragment、View中的onSaveInstanceState
     * 时机相同
     * @param outState
     */
    public void onSaveInstanceState(Bundle outState) {
    }


}
