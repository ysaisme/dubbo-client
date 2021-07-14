package com.ysa.apiService;

import api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: ysd
 * @Description:
 * @Date: Created in 14:47 2020/10/17
 * Modified By:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Override
    public String getInfo() {
        log.info("-> 这里是用户为服务");
        return "this is userService ~~~~~~";
    }
}
