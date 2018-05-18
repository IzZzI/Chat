package cn.snowman.chat.factory;


import cn.snowman.chat.base.BasePresenter;

/**
 * Created by zhouzy on 2017-12-8
 */

public interface IPersenterFactory {
    /**
     * 创建presenter实例
     *
     * @return
     */
    BasePresenter createPresenter();

}
