package com.leis.products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author leis
 * @Date 2019/8/7 14:40
 * @Version 1.0
 **/
@RestController
public class TestController {

    @RequestMapping("/get")
    public String get() {
        return "product xxxx";
    }
}
