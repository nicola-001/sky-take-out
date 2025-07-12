package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
public class SkyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkyApplication.class, args);
        log.info("server started");
    }
}

/*
 * 1.全局异常
 * 2.拦截器
 *      将用户信息存储在ThreadLocal中
 *      扩展Spring MVC框架消息转换器
 * 3.登录时 token生成
 * 4.swagger
 * */
