package com.sl.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @ClassName MyUserDetailsService
 * @Description TODO
 * @Author leis
 * @Date 2019/8/2 16:16
 * @Version 1.0
 **/
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if (username != null) {
            return new User(username, this.passwordEncoder.encode("123456"),
                    AuthorityUtils.createAuthorityList("admin"));
        } else {
            throw new UsernameNotFoundException("用户[" + username + "]不存在");
        }
    }
}
