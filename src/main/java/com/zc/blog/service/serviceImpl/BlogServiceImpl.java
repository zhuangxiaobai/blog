package com.zc.blog.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.blog.mapper.MBlogExtMapper;
import com.zc.blog.mbg.mapper.MBlogMapper;
import com.zc.blog.mbg.po.MBlog;
import com.zc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
          //  success = blogExtMapper.insertNoId(blog);
            success = blogMapper.insertSelective(blog);



        }else{
         //修改

            success = blogMapper.updateByPrimaryKeySelective(blog);


        }

       return success;

    }

    @Override
    public PageInfo getBlogLists(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<MBlog> mBlogList=blogExtMapper.selectAll();
        PageInfo pageInfo = new PageInfo(mBlogList);
        System.out.println(pageInfo.toString());
        return  pageInfo;
    }

    @Override
    public MBlog getBlogById(Long id) {


        return blogMapper.selectByPrimaryKey(id);
    }
}
