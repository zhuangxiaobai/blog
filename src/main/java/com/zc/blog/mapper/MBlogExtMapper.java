package com.zc.blog.mapper;

import com.zc.blog.mbg.mapper.MBlogMapper;
import com.zc.blog.mbg.po.MBlog;

import java.util.List;


public interface MBlogExtMapper extends MBlogMapper {



    List<MBlog> selectAll();
}
