package com.sodacar.deer.service.exception;

import com.sodacar.commons.exception.AbstractBaseException;
import com.sodacar.deer.dao.model.Device;

/**
 * @author bosong
 * @date 2019-05-25
 */

public class DeviceException extends AbstractBaseException {

    public DeviceException(String code) {
        this.code = code;
    }

    public DeviceException(String code, String message) {
        this(code, message, null, null);
    }

    public DeviceException(String code, String message, Object[] param) {
        this(code, message, param, null);
    }

    public DeviceException(String code, String message, DeviceException.Data data) {
        this(code, message, null, data);
    }

    public DeviceException(String code, String message, Object[] param, DeviceException.Data data) {
        this.code = code;
        this.message = message;
        this.param = param;
        this.data = data;
    }

}
