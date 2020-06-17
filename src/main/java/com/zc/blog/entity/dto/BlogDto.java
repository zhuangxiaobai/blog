package com.zc.blog.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class BlogDto {

    @ApiModelProperty(value = "博客id")
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "标题")
    @NotBlank(message = "标题不能为空")
    private String title;

    @ApiModelProperty(value = "描述")
    @NotBlank(message = "描述不能为空")
    private String description;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "内容")
    @NotBlank(message = "内容不能为空")
    private String content;


}
