package com.zc.blog.service.serviceImpl;

import com.zc.blog.mapper.MBlogExtMapper;
import com.zc.blog.mbg.mapper.MBlogMapper;
import com.zc.blog.mbg.po.MBlog;
import com.zc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    @Qualifier("MBlogMapper")
    private MBlogMapper blogMapper;
    @Autowired
    @Qualifier("MBlogExtMapper")
    private MBlogExtMapper blogExtMapper;

    @Override
    @Transactional(rollbackFor =  Exception.class)
    public int createOrUpdate(MBlog blog) {

        int success = 0;
        if(blog.getId() == null){
         //添加
            success = blogExtMapper.insertNoId(blog);



        }else{
         //修改




        }

       return success;

    }
}
