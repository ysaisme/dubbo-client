package com.ysa.service.impl;

import api.HelloService;
import com.ysa.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


/**
 * @Author: ysd
 * @Description:
 * @Date: Created in 14:49 2020/10/17
 * Modified By:
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Reference
    HelloService helloService;

    @Override
    public String hello() {

        String result = helloService.hello("hello dubbo");
        log.info("-> 打印一下: {}", result);
        return result;
    }
}
