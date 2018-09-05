package com.cloud.serviceadmin.schedule.hystric;

import com.cloud.serviceadmin.schedule.HiSchedule;
import org.springframework.stereotype.Component;

/**
 * HiScheduleHystric
 *
 * @author hackyo
 * @version V1.0.0
 * @date 2018/8/22 16:45
 */
@Component
public class HiScheduleHystric implements HiSchedule {

    @Override
    public String hiFormClient(String name) {
        return "error";
    }

}
