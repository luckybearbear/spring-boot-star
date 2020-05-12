package com.zjcoding.upms.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动器
 *
 * @author luckybearbear
 * @date 2020/5/11 0011 12:00
 */
@EnableDubboConfiguration
@SpringBootApplication
@Slf4j
public class UpmsProviderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UpmsProviderApplication.class, args);
        int length = context.getBeanDefinitionNames().length;
        log.info("Spring boot启动初始化了 {} 个 Bean", length);
    }
}
