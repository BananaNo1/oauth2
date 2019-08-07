package com.sl.auth.service.impl;

import com.sl.auth.entity.TbUser;
import com.sl.auth.mapper.TbUserMapper;
import com.sl.auth.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @ClassName TbUserServiceImpl
 * @Description TODO
 * @Author leis
 * @Date 2019/8/6 15:54
 * @Version 1.0
 **/
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }

}
