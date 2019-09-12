package com.sl.auth.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_user")
public class TbUser {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，加密存储
     */
    private String password;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱
     */
    private String email;

    private Date created;

    private Date updated;
}