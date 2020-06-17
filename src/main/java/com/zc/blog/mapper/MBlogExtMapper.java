package com.zc.blog.mapper;

import com.zc.blog.mbg.mapper.MBlogMapper;
import com.zc.blog.mbg.po.MBlog;


public interface MBlogExtMapper extends MBlogMapper {

    //void aaa(MBlog mBlog);

    int insertNoId(MBlog mBlog);
}
