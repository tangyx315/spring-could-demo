package com.cloud.serviceadmin.schedule;

import com.cloud.serviceadmin.schedule.hystric.HiScheduleHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HiSchedule
 *
 * @author hackyo
 * @version V1.0.0
 * @date 2018/8/22 16:45
 */
@FeignClient(value = "eureka-client", fallback = HiScheduleHystric.class)
public interface HiSchedule {

    /**
     * 测试接口
     *
     * @param name 测试参数
     * @return 测试结果
     */
    @GetMapping("/hi")
    String hiFormClient(@RequestParam(value = "name", defaultValue = "hackyo") String name);

}
