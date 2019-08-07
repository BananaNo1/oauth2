package com.sl.shopuser.service;

import org.springframework.cloud.openfeign.FeignClient;
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

@FeignClient(value = "shop-product-8091")
public interface ProductService {

    @RequestMapping(value = "/get")
    String get();

}
