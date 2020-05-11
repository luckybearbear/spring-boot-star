package com.zjcoding.upms.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 *
 * @author luckybearbear
 * @date 2020/5/11 0011 12:00
 */
@EnableDubboConfiguration
@SpringBootApplication
public class UpmsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsProviderApplication.class, args);
    }
}
