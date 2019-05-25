package com.sodacar.commons.exception.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bosong
 * @date 2019-05-25
 */

public class BaseExceptionVo<T> {

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private T data;

    public BaseExceptionVo(String code) {
        this.code = code;
    }

    public BaseExceptionVo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseExceptionVo(String code, String message, T params) {
        this.code = code;
        this.message = message;
        this.data = params;
    }
}
