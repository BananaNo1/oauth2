package com.sl.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SholDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SholDiscoveryApplication.class, args);
    }

}
