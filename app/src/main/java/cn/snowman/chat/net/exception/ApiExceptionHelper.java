package cn.snowman.chat.net.exception;


import android.net.ParseException;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;

import org.json.JSONException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

/**
 * @author guanghe-code
 * @date on 2018-1-25 10:17
 * @describe 异常处理类
 */
public class ApiExceptionHelper {
    public static ApiException handleException(Throwable e) {
        ApiException apiException = new ApiException();
        if (e instanceof HttpException) {//HTTP错误
            apiException.setCode(((HttpException) e).code());
            apiException.setMsg("网络异常");
        } else if (e instanceof JsonParseException //数据解析错误
                || e instanceof JSONException
                || e instanceof ParseException || e instanceof MalformedJsonException) {
            apiException.setCode(ApiExceptionCode.DATA_PARSE_EXCEPTION);
            apiException.setMsg("数据解析异常");
        } else if (e instanceof ConnectException) {//连接网络错误
            apiException.setCode(ApiExceptionCode.CONNECT_EXCEPTION);
            apiException.setMsg("连接服务器异常");
        } else if (e instanceof SocketTimeoutException) {//网络超时
            apiException.setCode(ApiExceptionCode.TIME_OUT_EXCEPTION);
            apiException.setMsg("网络超时");
        } else if (e instanceof ApiServerException) {//未成功异常
            apiException.setCode(((ApiServerException) e).getCode());
            apiException.setMsg(((ApiServerException) e).getMsg());
        } else {//未知错误
            apiException.setCode(ApiExceptionCode.UNKNOWN_EXCEPTION);
            apiException.setMsg("未知错误");
        }
        return apiException;
    }

    /**
     * 获取异常信息
     *
     * @param e
     * @return
     */
    public static String getExceptionMsg(Throwable e) {
        String msg;
        if (e instanceof ApiException) {
            msg = ((ApiException) e).getMsg();
        } else {
            msg = e.getMessage();
        }
        return msg;
    }
}
