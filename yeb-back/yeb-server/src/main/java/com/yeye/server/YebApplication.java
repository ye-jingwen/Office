package com.yeye.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: yeb-back
 * @description: 启动类
 * @author: YEYE
 * @create: 2021-12-02
 **/
@SpringBootApplication
@MapperScan("com.yeye.server.mapper")
public class YebApplication {
    public static void main(String[] args){
        SpringApplication.run(YebApplication.class,args);
    }
}
