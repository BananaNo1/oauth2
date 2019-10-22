package com.leis.shopgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GatewayRoutes
 * @Description TODO
 * @Author leis
 * @Date 2019/9/29 17:30
 * @Version 1.0
 **/
//@Configuration
public class GatewayRoutes {

    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/java/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("http://localhost:8090/helloWorld")).build();
    }
}
