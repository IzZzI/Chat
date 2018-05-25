package cn.snowman.chat.net.exception;

/**
 * @author guanghe-code
 * @date on 2018-1-25 11:14
 * @describe 请求接口未成功异常
 */
public class ApiServerException extends Exception {
    private int code;
    private String msg;

    public ApiServerException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiServerException() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
