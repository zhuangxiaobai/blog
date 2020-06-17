package com.zc.blog.controller;

import cn.hutool.core.bean.BeanUtil;
import com.zc.blog.api.CommonResult;

import com.zc.blog.entity.dto.BlogDto;

import com.zc.blog.mbg.po.MBlog;
import com.zc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/blog")
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


//    @GetMapping("/blog/{id}")
//    public CommonResult detail(@PathVariable(name = "id") Long id) {
//        Blog blog = blogService.getById(id);
//
//
//        return CommonResult.success(blog);
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

    @PostMapping("/createOrUpdate")
    public CommonResult createOrUpdate(@Validated @RequestBody BlogDto blogDto) {

        MBlog blog = null;
        if(blogDto.getId() != null) {
        //修改







        }else{
        //添加

            blog = new MBlog();
            blog.setUserId(1L);
            blog.setCreated(LocalDateTime.now());
            blog.setStatus(0);

        }

        BeanUtil.copyProperties(blogDto, blog, "id", "userId", "created", "status");
        int success   = blogService.createOrUpdate(blog);

        if(success == 1){

            return CommonResult.success(null);
        }else{

            return  CommonResult.failed();

        }




    }



}
