package com.zc.blog.controller;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.IPage;
import com.github.pagehelper.Page;
import com.zc.blog.api.CommonResult;
import com.zc.blog.entity.Blog;
import com.zc.blog.mbg.model.MBlog;
import com.zc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

//    @GetMapping("/blog/blogLists")
//    public CommonResult listBlog(@RequestParam Integer currentPage,@RequestParam Integer pageSize) {
//
//        //Page page = new Page(currentPage, pageSize);
//        //IPage pageData = blogService.getBlogs();
//
//       // return CommonResult.success();
//    }
//
//    @DeleteMapping("/blog/delete/{id}")
//    public CommonResult deleteBlog(@PathVariable(name = "id") Long id) {
//        //Blog blog = blogService.getById(id);
//        //Assert.notNull(blog, "该博客已被删除");
//
//        //return CommonResult.success(blog);
//    }
//
//    @PostMapping("/blog/create")
//    public CommonResult createBlog(@RequestBody MBlog mBlog) {
//        //Blog blog = blogService.getById(id);
//        //Assert.notNull(blog, "该博客已被删除");
//
//        //return CommonResult.success(blog);
//    }
//
//
//    @PutMapping("/blog/update/{id}")
//    public CommonResult updateBlog(@PathVariable(name = "id") Long id,@RequestBody MBlog mBlog) {
//        //Blog blog = blogService.getById(id);
//        //Assert.notNull(blog, "该博客已被删除");
//
//        //return CommonResult.success(blog);
//    }



}
