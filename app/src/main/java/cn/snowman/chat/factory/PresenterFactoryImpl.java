package cn.snowman.chat.factory;


import cn.snowman.chat.annotation.CreatePresenter;
import cn.snowman.chat.base.BasePresenter;

/**
 * Created by zhouzy on 2017-12-8
 * presenter工厂实现类
 */

public class PresenterFactoryImpl implements IPersenterFactory {

    private Class<BasePresenter> mPresenterClass;

    private PresenterFactoryImpl(Class<BasePresenter> presenterClass) {
        this.mPresenterClass = presenterClass;
    }

    /**
     * 获取presenter工厂实例
     *
     * @param viewClass 要绑定presenter的view的Class
     *                  需要声明@CreatePresenter注解
     * @return 工厂实例
     */
    public static PresenterFactoryImpl getInstance(Class<?> viewClass) {
        CreatePresenter annotation = viewClass.getAnnotation(CreatePresenter.class);
        Class<BasePresenter> presenterClass = null;
        if (annotation != null) {
            presenterClass = annotation.value();
        }
        return presenterClass == null ? null : new PresenterFactoryImpl(presenterClass);
    }

    /**
     * 创建presenter
     *
     * @return
     */
    @Override
    public BasePresenter createPresenter() {
        try {
            return mPresenterClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Presenter创建失败!，检查是否声明了@CreatePresenter(xx.class)注解");
        }
    }


}
