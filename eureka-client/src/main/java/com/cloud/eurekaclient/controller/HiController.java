package com.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HiController
 *
 * @author hackyo
 * @version V1.0.0
 * @date 2018/8/22 16:45
 */
@RefreshScope
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @Value("${foo}")
    String foo;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "hackyo") String name) {
        return "hi " + name + " ,i am from port:" + port + " foo=" + foo;
    }

}
