package cn.snowman.chat.net.function;


import cn.snowman.chat.net.exception.ApiExceptionHelper;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * @author guanghe-code
 * @date on 2018-1-25 11:26
 * @describe 异常统一处理
 */
public class HttpResultExceptionFunction implements Function<Throwable, ObservableSource> {
    @Override
    public ObservableSource apply(Throwable throwable) throws Exception {
        return Observable.error(ApiExceptionHelper.handleException(throwable));
    }
}
