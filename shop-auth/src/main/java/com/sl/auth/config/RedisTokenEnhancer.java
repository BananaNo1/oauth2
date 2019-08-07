package com.sl.auth.config;

import com.sl.auth.common.UserContext;
import com.sl.auth.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName RedisTokenEnhancer
 * @Description TODO
 * @Author leis
 * @Date 2019/8/5 14:19
 * @Version 1.0
 **/
public class RedisTokenEnhancer implements TokenEnhancer {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        if (accessToken instanceof DefaultOAuth2AccessToken) {
            OAuth2RefreshToken refreshToken =
                    accessToken.getRefreshToken();
            String value = refreshToken.getValue();
            String username = user.getUsername();
            redisTemplate.opsForValue().set(username, value, 60 * 60 * 24 * 7, TimeUnit.SECONDS);
        }
        return accessToken;
    }
}
