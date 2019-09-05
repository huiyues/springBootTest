package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heiye
 * @date 2019-08-08 09:38
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloDemo(){
        return "hello word huiyue！";
    }
}
