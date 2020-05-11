package com.zjcoding.upms.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjcoding.upms.common.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Hello服务实现
 *
 * @author luckybearbear
 * @date 2020/5/11 0011 13:02
 */
@Service
@Component
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        log.info("someone is calling me......");
        return "say hello to: " + name;
    }
}
