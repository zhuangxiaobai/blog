package com.zc.blog.service;

import com.zc.blog.mbg.po.MBlog;

public interface BlogService {
    int createOrUpdate(MBlog blog);
}
