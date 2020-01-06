package com.leslie.service.feign.service.impl;

import com.leslie.service.feign.service.SchedulServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedulServiceHiHystrix implements SchedulServiceHi {
    @Override
    public String sayHiFromClientOne() {
        return "sorry";
    }

    @Override
    public String sayHiFromClientTwo(String name) {
        return "sorry : " + name;
    }
}
