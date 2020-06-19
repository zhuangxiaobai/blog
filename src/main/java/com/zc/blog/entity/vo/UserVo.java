package com.zc.blog.entity.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserVo {
    private Long id;


    private String username;


    private String avatar;


    private String email;


    private String password;

    private Integer status;

    private LocalDateTime created;

    private LocalDateTime lastLogin;
}
