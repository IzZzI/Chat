package cn.snowman.chat.net.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * @author guanghe-code
 * @date on 2018-1-24 18:31
 * @describe 适用Retrofit网络请求Observer(监听者)
 * 备注:
 * 1.重写onSubscribe，添加请求标识
 * 2.重写onError，封装错误/异常处理，移除请求
 * 3.重写onNext，移除请求
 * 4.重写cancel，取消请求
 */
public abstract class HttpRxObserver<T> implements Observer<T> {
    @Override
    public void onSubscribe(Disposable d) {

    }

    public void onComplete() {
    }

}
