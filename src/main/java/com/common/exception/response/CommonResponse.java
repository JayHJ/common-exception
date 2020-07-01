package com.common.exception.response;

/**
 * for normal response purpose
 */
public class CommonResponse<T> extends BaseResponse {
    private T data;

    public CommonResponse() {
        super();
    }

    public CommonResponse(T data) {
        super();
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
