package com.skyLight.skyLight.tool;

import com.skyLight.common.tool.BaseResponse;

public class ObjectResponse<T> extends BaseResponse {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
