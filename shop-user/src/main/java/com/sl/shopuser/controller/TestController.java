package com.sl.shopuser.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author leis
 * @Date 2019/8/2 16:34
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        return "hello xxx";
    }

}
