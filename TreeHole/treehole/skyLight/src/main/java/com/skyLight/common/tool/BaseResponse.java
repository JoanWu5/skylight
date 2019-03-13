package com.skyLight.common.tool;

public class BaseResponse {

    private int status;
    private String msg;

    public BaseResponse(){
        this.status = 200;
        this.msg = "success";
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
