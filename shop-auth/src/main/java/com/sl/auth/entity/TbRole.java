package com.sl.auth.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_role")
public class TbRole {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 父角色
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色英文名称
     */
    private String enname;

    /**
     * 备注
     */
    private String description;

    private Date created;

    private Date updated;
}