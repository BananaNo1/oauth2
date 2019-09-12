package com.sl.shopuser.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.sl.shopuser.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author leis
 * @Date 2019/8/2 16:34
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
@RefreshScope
public class TestController {

    @Autowired
    private ProductService productService;

    @Value("${param}")
    private String param;

    @Value("${UserLocalCache}")
    private String UserLocalCache;

    //    @Autowired
//    private RestTemplate restTemplate;
    @SentinelResource(value = "hello", blockHandler = "blockHandler")
    @GetMapping("/hello")
//    @PreAuthorize("hasAuthority('System')")
    public String hello() {
//        if (true) {
//            throw new RuntimeException();
//        }
//        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        String result = productService.get();
//        String forObject = restTemplate.getForObject("http://localhost:8091/get", String.class);
        return "hello xxx ****" + result;
    }

    public String blockHandler(HttpServletRequest req, BlockException ex) {
        //可以记录日志，返回任何你想返回的东西
        return "请放慢速度";
    }

    @GetMapping("/get")
    public String getParam() {
        return param + "***" + UserLocalCache;
    }
}
