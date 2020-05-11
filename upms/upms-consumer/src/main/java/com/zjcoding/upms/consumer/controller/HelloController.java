package com.zjcoding.upms.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjcoding.upms.common.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello服务API
 *
 * @author luckybearbear
 * @date 2020/5/11 0011 13:42
 */
@RestController
@Slf4j
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(defaultValue = "zjcoding") String name) {
        log.info("i'm ready to call someone......");
        return helloService.sayHello(name);
    }
}
