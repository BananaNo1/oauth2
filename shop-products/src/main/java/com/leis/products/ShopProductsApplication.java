package com.leis.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author leis
 * @Date 2019/8/7 14:18
 **/
@EnableEurekaClient
@SpringBootApplication
public class ShopProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopProductsApplication.class, args);
    }



}
