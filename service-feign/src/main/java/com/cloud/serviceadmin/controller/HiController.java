package com.cloud.serviceadmin.controller;

import com.cloud.serviceadmin.schedule.HiSchedule;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
public class HiController {

    private HiSchedule hiSchedule;

    @Autowired
    public HiController(HiSchedule hiSchedule) {
        this.hiSchedule = hiSchedule;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "hackyo") String name) {
        return hiSchedule.hiFormClient(name);
    }

}
