package cn.snowman.chat.net.exception;

/**
 * @author guanghe-code
 * @date on 2018-1-25 10:35
 * @describe 错误类
 */
public class ApiException extends Exception {
    private int code;//错误码
    private String msg;//错误信息

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
