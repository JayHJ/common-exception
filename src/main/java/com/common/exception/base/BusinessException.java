package com.common.exception.base;

import com.common.exception.enums.IResponseEnum;

public class BusinessException extends BaseException {

    private static final long serialVersionUID = -32541107398732573L;

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}
