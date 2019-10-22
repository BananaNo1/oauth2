package com.sl.shopuser.service;

import com.sl.shopuser.service.fallback.ProductServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author leis
 * @Date 2019/8/7 14:32
 * @Version 1.0
 **/

@FeignClient(name = "shop-product-8091", fallback = ProductServiceFallback.class)
public interface ProductService {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String get();
}

