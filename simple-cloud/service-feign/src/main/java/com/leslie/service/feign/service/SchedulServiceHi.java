package com.leslie.service.feign.service;

import com.leslie.service.feign.service.impl.SchedulServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "server-client-test", fallback = SchedulServiceHiHystrix.class, primary = false)
public interface SchedulServiceHi {

    @GetMapping("/")
    String sayHiFromClientOne();

    @GetMapping("/hi")
    String sayHiFromClientTwo(@RequestParam(required = false) String name);

}
