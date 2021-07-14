package com.ysa.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.ysa.service.TestService;
import com.ysa.util.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ysd
 * @Description:
 * @Date: Created in 14:29 2020/10/17
 * Modified By:
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    @SentinelResource(value = "hello", blockHandler = "exceptionHandler", fallback = "helloFallback")
    public BaseResult getHello() {
        return BaseResult.success(testService.hello());
    }
}
