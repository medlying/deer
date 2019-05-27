package com.sodacar.deer.service.impl;

import com.sodacar.commons.page.Pageable;
import com.sodacar.deer.dao.mapper.DeviceMapper;
import com.sodacar.deer.dao.model.Device;
import com.sodacar.deer.dao.model.DeviceExample;
import com.sodacar.deer.service.DeviceService;
import com.sodacar.deer.service.model.DeviceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bosong
 * @date 2019-05-23
 */

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceMapper deviceMapper;

    @Override
    public Pageable<DeviceVo> list() {
        var deviceExample = new DeviceExample();
        return new Pageable<>(deviceMapper.countByExample(deviceExample), (page, limit) -> {
            deviceExample.setStart(page);
            deviceExample.setLimit(limit);
            return deviceMapper.selectByExample(deviceExample).stream().map(DeviceVo::generator).collect(Collectors.toList());
        });
    }

    @Override
    public Device insert(Device device) {
        deviceMapper.insertSelective(device);
        return device;
    }
}
