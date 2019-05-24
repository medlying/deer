package com.sodacar.deer.api.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sodacar.deer.dao.model.Device;
import com.sodacar.deer.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bosong
 * @date 2019-05-23
 */

@RestController
@RequestMapping("device")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping(method = RequestMethod.GET)
    public PageInfo<Device> list(@RequestParam("page") int page, @RequestParam("page-limit") int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(deviceService.list(page, limit));
    }
}
