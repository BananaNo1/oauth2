package com.sl.shopzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description TODO
 * @Author leis
 * @Date 2019/8/7 10:13
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ShopZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopZullApplication.class, args);
    }

}
