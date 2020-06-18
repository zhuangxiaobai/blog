package com.zc.blog.entity.vo;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BlogVo {

    private Long id;


    private Long userId;

    private String title;

    private String description;

    private LocalDateTime created;

    private Integer status;

    private String content;

}
