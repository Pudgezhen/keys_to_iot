package com.keys.user.service;

import com.keys.api.inter.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author mu_zhen
 * @description
 * @Date 2023/8/8 17:31
 */
@DubboService
public class UserServiceImpl implements IUserService {

    @Override
    public String echoName(String name) {
        return "echo-->"+name;
    }
}
