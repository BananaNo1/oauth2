package com.sl.shopuser.controller;

import com.sl.shopuser.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private ProductService productService;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/hello")
//    @PreAuthorize("hasAuthority('System')")
    public String hello() {
//        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        String result = productService.get();
//        String forObject = restTemplate.getForObject("http://localhost:8091/get", String.class);
        return "hello " + result;
    }

//    @PostMapping(value = "/login")
//    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
//        return  null;
//    }


}
