package com.zc.blog.service;

import com.github.pagehelper.PageInfo;
import com.zc.blog.mbg.po.MBlog;

import java.util.List;

public interface BlogService {
    int createOrUpdate(MBlog blog);

    PageInfo getBlogLists(Integer currentPage, Integer pageSize);

    MBlog getBlogById(Long id);
}
