package com.sodacar.commons.exception;

/**
 * @author bosong
 * @date 2019-05-24
 */

public abstract class AbstractBaseException extends RuntimeException{

    private String code;

    private String message;

    /**
     * 返回异常的code
     * @return code
     */
    public abstract String code();

    @Override
    public String getMessage() {
        return "code: " + code + ", message: " + message;
    }

}
