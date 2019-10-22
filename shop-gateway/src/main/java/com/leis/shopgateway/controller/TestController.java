package com.leis.shopgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author leis
 * @Date 2019/9/29 17:36
 * @Version 1.0
 **/
@RestController
@RequestMapping("/java")
public class TestController {

    @GetMapping("/helloWorld")
    public String hello(){
        return "hello";
    }
}
