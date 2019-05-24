package com.sodacar.deer.service.impl;

import com.sodacar.deer.dao.mapper.DeviceMapper;
import com.sodacar.deer.dao.model.Device;
import com.sodacar.deer.dao.model.DeviceExample;
import com.sodacar.deer.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bosong
 * @date 2019-05-23
 */

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceMapper deviceMapper;

    @Override
    public List<Device> list(int page, int pageLimit) {
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.setStart(page > 0 ? (page - 1) * pageLimit : 0);
        deviceExample.setLimit(pageLimit);
        deviceExample.createCriteria().andCardNumberEqualTo("1234");
        return deviceMapper.selectByExample(deviceExample);
    }
}
