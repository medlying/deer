package com.sodacar.commons.exception.handler;

import com.sodacar.commons.exception.AbstractBaseException;
import com.sodacar.commons.exception.vo.BaseExceptionVo;
import com.sodacar.commons.source.SourceHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Properties;

/**
 * @author bosong
 * @date 2019-05-25
 */

@ControllerAdvice
public class BaseExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    private static final String DEFAULT_EXCEPTION_CODE = System.getProperty("default.exception.code", "too_busy");

    private static final String DEFAULT_EXCEPTION_MESSAGE = System.getProperty("default.exception.message", "未知错误");

    @Autowired
    SourceHandler sourceHandler;

    private static void logException(Exception e) {
        logger.error(e.getMessage(), e);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseExceptionVo handleException(HttpServletRequest httpServletRequest, Exception exception) {
        logException(exception);
        String message = sourceHandler.resource(httpServletRequest).property(DEFAULT_EXCEPTION_CODE).orElse(DEFAULT_EXCEPTION_MESSAGE);
        return new BaseExceptionVo(DEFAULT_EXCEPTION_CODE, message);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(AbstractBaseException.class)
    @ResponseBody
    public BaseExceptionVo baseExceptionHandle(HttpServletRequest httpServletRequest, AbstractBaseException exception) {
        logException(exception);
        Object[] param = exception.param();
        String message = sourceHandler.resource(httpServletRequest).property(exception.code())
                .orElse(exception.message() != null ? exception.message() : "");
        message = param != null && param.length > 0 ? String.format(message, exception.param()) : message;
        return new BaseExceptionVo(exception.code(), message, exception.data());
    }
}
