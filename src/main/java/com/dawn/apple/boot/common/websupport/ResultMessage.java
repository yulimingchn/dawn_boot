package com.dawn.apple.boot.common.websupport;

import java.io.Serializable;

/**
 * 接口返回结果消息
 *
 * @author yuliming
 * @create 2017-11-27 16:54
 */
public class ResultMessage<T> implements Serializable {


    public static final int SUCCESS_STATUS = 200;
    public static final  int FAIL_CODE = 500;
    public static final  int FAIL_OTHER_CODE = 4000;
    public static final  int FAIL_PARAM_CODE = 4001;
    public static final  int FAIL_BUSINESS_CODE = 4002;
    public static final  int FAIL_DATABASE_CODE = 4003;
    public static final  int REMOTE_SERVER_INTERNAL_ERROR = 5010;
    public static final  int NEED_LOGIN = 6060;
    public static final  int NO_AUTO_LOGIN = 6061;

    public static final String SUCCESS_MESSAGE = "success";

    /**
     * 返回状态，成功为200
     */
    private int status;

    /**
     * 返回消息，成功为success
     */
    private String message;

    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResultMessage<T> success() {
        return success(null);
    }

    public static <T> ResultMessage<T> success(T data) {
        return success(data, SUCCESS_MESSAGE,SUCCESS_STATUS);
    }

    public static <T> ResultMessage<T> success(T data, String message, int responseStatus) {
        ResultMessage response = new ResultMessage();
        response.setData(data);
        response.setStatus(responseStatus);
        response.setMessage(message);
        return response;
    }

    public static <T> ResultMessage<T> error(int status, String message) {
        ResultMessage response = new ResultMessage();
        response.setStatus(status);
        response.setMessage(message);
        return response;
    }

    public static <T> ResultMessage<T> error(int status) {
        return error(status, null);
    }



}
