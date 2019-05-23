package com.sodacar.deer.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bosong
 * @date 2019-05-21
 */

@RestController
public class AboutController {

    @RequestMapping(method = RequestMethod.GET)
    public String about() {
        return "hello";
    }

}
