package com.sl.auth.service.impl;

import com.sl.auth.entity.TbPermission;
import com.sl.auth.mapper.TbPermissionMapper;
import com.sl.auth.service.TbPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TbPrimissionServiceImpl
 * @Description TODO
 * @Author leis
 * @Date 2019/8/6 16:13
 * @Version 1.0
 **/
@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Autowired
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
