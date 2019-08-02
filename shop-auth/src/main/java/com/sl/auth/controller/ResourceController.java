package com.sl.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @ClassName ResourceController
 * @Description TODO
 * @Author leis
 * @Date 2019/8/2 17:02
 * @Version 1.0
 **/
@RestController
@RequestMapping("/auth")
public class ResourceController {

    @GetMapping("/member")
    public Principal user(Principal member){
        return member;
    }
}
