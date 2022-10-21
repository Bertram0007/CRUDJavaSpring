package com.assiment.backend.bean;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static BaseResponse success(Object data){
        BaseResponse baseResponse=new BaseResponse();
        baseResponse.setCode(0);
        baseResponse.setMessage("success");
        baseResponse.setData(data);
        return baseResponse;
    }

    public static BaseResponse error(Object data){
        BaseResponse baseResponse=new BaseResponse();
        baseResponse.setCode(500);
        baseResponse.setMessage("fail");
        baseResponse.setData(data);
        return baseResponse;
    }
}
