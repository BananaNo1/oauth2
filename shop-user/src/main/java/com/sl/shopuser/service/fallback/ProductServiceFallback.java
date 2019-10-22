package com.sl.shopuser.service.fallback;

import com.sl.shopuser.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * @ClassName ProductServiceFallback
 * @Description TODO
 * @Author leis
 * @Date 2019/9/29 15:21
 * @Version 1.0
 **/
@Component
public class ProductServiceFallback implements ProductService {
    @Override
    public String get() {
        return "echo fallback";
    }
}
