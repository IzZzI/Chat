package cn.snowman.chat.net.observable;

import com.trello.rxlifecycle2.LifecycleProvider;

import cn.snowman.chat.entity.ResultEntity;
import cn.snowman.chat.net.function.HttpResultExceptionFunction;
import cn.snowman.chat.net.function.ServerResultFunction;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * @author guanghe-code
 * @date on 2018-1-24 18:13
 * @describe 适用Retrofit网络请求Observable(被监听者)
 */
public class HttpRxObservable<T> {
    public static <T> Observable getObservable(Observable<ResultEntity<T>> apiObservable,
                                               LifecycleProvider lifecycle) {
        //showLog(request);
        Observable observable;
        //随生命周期自动管理.eg:onCreate(start)->onStop(end)
        observable = apiObservable.map(new ServerResultFunction())//转换数据，服务器返回false时转换为异常
                .compose(lifecycle.bindToLifecycle())//需要在这个位置添加
                .onErrorResumeNext(new HttpResultExceptionFunction())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        return observable;
    }
}

