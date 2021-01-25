package com.zc.ssm.pojo;

import org.junit.Test;

/**
 * 测试 User.java 类的 Lombok 依赖中
 *      getter/setter/无参构造/有参构造/toString方法
 * 是否生效
 */
public class TestUserLombok {
    @Test
    public void test1(){
        User u = new User();
        u.setId(1);
        u.setUsername("张三");
        u.setPassword("123");
        System.out.println(u);
    }

}
