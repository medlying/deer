package com.sodacar.deer.service;

import com.sodacar.deer.dao.model.Device;

import java.util.List;

/**
 * @author bosong
 * @date 2019-05-23
 */

public interface DeviceService {

    /**
     * 列表
     */
    List<Device> list(int page, int pageLimit);
}
