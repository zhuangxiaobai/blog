package com.zc.blog.mbg.mapper;

import com.zc.blog.mbg.po.MBlog;

public interface MBlogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MBlog record);

    int insertSelective(MBlog record);

    MBlog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MBlog record);

    int updateByPrimaryKeyWithBLOBs(MBlog record);

    int updateByPrimaryKey(MBlog record);
}