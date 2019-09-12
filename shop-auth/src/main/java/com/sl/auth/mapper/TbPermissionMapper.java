package com.sl.auth.mapper;

import com.sl.auth.entity.TbPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description TODO
 * @Author leis
 * @Date 2019/8/6 16:14
 **/
@Repository
public interface TbPermissionMapper extends Mapper<TbPermission> {
    /**
     * 查询权限
     *
     * @param userId
     * @return
     */
    List<TbPermission> selectByUserId(@Param("userId") Long userId);

}