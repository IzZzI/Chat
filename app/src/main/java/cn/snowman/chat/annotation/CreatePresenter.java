package cn.snowman.chat.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import cn.snowman.chat.base.BasePresenter;

/**
 * Created by zhouzy on 2017-12-11
 * 创建presenter注解
 */

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CreatePresenter {
    Class<BasePresenter> value();
}
