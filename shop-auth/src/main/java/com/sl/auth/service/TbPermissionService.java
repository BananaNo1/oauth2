package com.sl.auth.service;

import com.sl.auth.entity.TbPermission;

import java.util.List;

/**
 * @ClassName TbPermissionService
 * @Description TODO
 * @Author leis
 * @Date 2019/8/6 16:11
 * @Version 1.0
 **/
public interface TbPermissionService {

    List<TbPermission> selectByUserId(Long userId);
}
