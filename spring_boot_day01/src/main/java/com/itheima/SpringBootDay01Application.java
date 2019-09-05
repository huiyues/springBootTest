package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 *
 * @author heiye
 * @date 2019-08-08 09:41
 */
//springBoot引导类
@SpringBootApplication
public class SpringBootDay01Application {

    //springBoot的启动方法
    public static void main(String[] args) {
        //springBoot的运行引导内
        SpringApplication.run(SpringBootDay01Application.class, args);
    }
}
