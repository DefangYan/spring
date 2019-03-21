package com.defang.demoforcache.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author defang.yan
 * @date 19-3-21 上午10:28
 */
//创建user类用来模拟对象存储

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 8655851615465363473L;
    private Long id;
    private String username;
    private String password;

    public User(long l, String u1, String p1) {
    }
}
