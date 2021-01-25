package com.zc.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 导入的 lombok 依赖
 */
@Data    //提供getter/setter
@NoArgsConstructor //无参构造器
@AllArgsConstructor //有参构造器
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private Date birthday;
    private int gender;
    private Timestamp created;
    private Timestamp updated;
}

