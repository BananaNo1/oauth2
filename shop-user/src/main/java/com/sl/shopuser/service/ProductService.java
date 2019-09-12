package com.sl.shopuser.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author leis
 * @Date 2019/8/7 14:32
 * @Version 1.0
 **/

@FeignClient(name = "shop-product-8091", fallback = EchoServiceFallback.class, configuration = FeignConfiguration.class)
public interface ProductService {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String get();

}

class FeignConfiguration {
    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }
}

class EchoServiceFallback implements ProductService {

    @Override
    public String get() {
        return "echo fallback";
    }
}