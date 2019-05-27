package com.sodacar.deer.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sodacar.commons.page.Page;
import com.sodacar.deer.dao.model.Device;
import com.sodacar.deer.service.DeviceService;
import com.sodacar.deer.service.model.DeviceVo;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public Page<DeviceVo> list(@RequestParam("page") long page,
                               @RequestParam("page-limit") long limit) {
        return deviceService.list().toPage(page, limit);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Device add(Device device) {
        return deviceService.insert(device);
    }
}
