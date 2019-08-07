package com.sl.auth.service;

import com.sl.auth.entity.TbUser;

/**
 * @ClassName TbUserService
 * @Description TODO
 * @Author leis
 * @Date 2019/8/6 15:53
 * @Version 1.0
 **/
public interface TbUserService {

    TbUser getByUsername(String username);
}
