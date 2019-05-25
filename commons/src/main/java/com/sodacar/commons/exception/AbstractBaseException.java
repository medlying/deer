package com.sodacar.commons.exception;

/**
 * @author bosong
 * @date 2019-05-24
 */

public abstract class AbstractBaseException extends RuntimeException{

    protected String code;

    protected String message;

    protected Object[] param;

    protected Data data;

    /**
     * 返回异常的code
     * @return code
     */
    public String code() {
        return code;
    }

    public String message() {
        return message;
    }

    public Object[] param() {
        return param;
    }

    public Data data() {
        return data;
    }



    @Override
    public String getMessage() {
        return "code: " + code + ", message: " + message;
    }

    public static class Data<T> {

        protected T data;

        public Data(T data) {
            this.data = data;
        }

        public T data() {
            return data;
        }
    }

}
