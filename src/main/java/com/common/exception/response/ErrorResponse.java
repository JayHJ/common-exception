package com.common.exception.response;

/**
 * for error response purpose, normally can use common response instead
 */
public class ErrorResponse extends BaseResponse {
    public ErrorResponse() {
    }

    public ErrorResponse(int code, String message) {
        super(code, message);
    }
}
