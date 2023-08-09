package com.keys.device.controller;

import com.keys.api.inter.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mu_zhen
 * @description
 * @Date 2023/8/9 9:05
 */
@RestController
public class TestController {

    @DubboReference(check = false)
    private IUserService userService;

    @RequestMapping("/test")
    public String test(@RequestBody String name){
        return userService.echoName(name);
    }
}
