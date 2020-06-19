package com.zc.blog.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {

    private Long id;


    private String username;


    private String avatar;


    private String email;


    private String password;

    private Integer status;

    private LocalDateTime created;

    private LocalDateTime lastLogin;
}
