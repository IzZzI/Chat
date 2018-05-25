package cn.snowman.chat.entity;

/**
 * 返回实体类
 *
 * @param <T>
 */
public class ResultEntity<T> {
    /**
     * 操作状态
     */
    private boolean success;
    /**
     * 错误代码
     */
    private int errorCode;
    /**
     * 原始错误消息
     */
    private String msg;
    /**
     * 业务数据
     */
    private T body;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public T getBody() {
        return body;
    }
}
