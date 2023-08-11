package com.keys.user.service;

import com.keys.api.inter.IUserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author mu_zhen
 * @description
 * @Date 2023/8/8 17:31
 */
@DubboService
public class UserServiceImpl implements IUserService {


    private String group;
    @Override
    public String echoName(String name) {
        return "echo-->"+name+group;
    }
}
