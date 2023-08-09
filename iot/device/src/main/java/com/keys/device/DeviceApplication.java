package com.keys.device;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mu_zhen
 * @description
 * @Date 2023/8/8 16:37
 */
@SpringBootApplication
public class DeviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeviceApplication.class,args);
    }

}
