package com.sl.auth.service;

import com.google.common.collect.Lists;
import com.sl.auth.entity.TbPermission;
import com.sl.auth.entity.TbUser;
import com.sl.auth.mapper.TbPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

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

//    @Autowired
//    private UserContext userContext;

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        MyUser myUser = new MyUser();
//        myUser.setUsername(username);
//        userContext.setUser(myUser);

//        TbUser tbUser = tbUserService.getByUsername(username);
//        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
//        if (tbUser != null) {
//            List<TbPermission> tbPermissions = tbPermissionMapper.selectByUserId(tbUser.getId());
//
//            tbPermissions.stream().forEach(tbPermission -> {
//                if (tbPermission != null && tbPermission.getEnname() != null) {
//                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
//                    grantedAuthorities.add(grantedAuthority);
//                }
//            });
//        }
//
//        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
        if (username != null) {
            return new User(username, this.passwordEncoder.encode("123456"),
                    AuthorityUtils.createAuthorityList("admin"));
        } else {
            throw new UsernameNotFoundException("用户[" + username + "]不存在");
        }
    }
}
