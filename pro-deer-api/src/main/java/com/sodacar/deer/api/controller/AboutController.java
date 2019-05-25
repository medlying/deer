package com.sodacar.deer.api.controller;

import com.sodacar.deer.service.exception.DeviceException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bosong
 * @date 2019-05-21
 */

@RestController
@RequestMapping("about")
public class AboutController {

    @RequestMapping(method = RequestMethod.GET)
    public String about() {
        return "hello";
    }

    @RequestMapping(path = "/exe", method = RequestMethod.GET)
    public String exception() {
        throw new DeviceException("exc", "123");
    }

}
