package com.zjcoding.upms.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 *
 * @author luckybearbear
 * @date 2020/5/11 0011 13:41
 */
@SpringBootApplication
@EnableDubboConfiguration
public class UpmsConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UpmsConsumerApplication.class, args);
    }
}
