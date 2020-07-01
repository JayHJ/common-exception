package com.common.exception.base;


/**
 * 只包装了 错误信息 的 {@link RuntimeException}.
 * 用于 {@link com.common.exception.asserts.Assert} 中用于包装自定义异常信息
 *
 */
public class WrapMessageException extends RuntimeException {

    private static final long serialVersionUID = 4031363235470624945L;

    public WrapMessageException(String message) {
        super(message);
    }

    public WrapMessageException(String message, Throwable cause) {
        super(message, cause);
    }
}
