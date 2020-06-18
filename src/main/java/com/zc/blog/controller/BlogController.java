package com.zc.blog.controller;

import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.IPage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.blog.api.CommonResult;

import com.zc.blog.entity.dto.BlogDto;

import com.zc.blog.entity.vo.BlogVo;
import com.zc.blog.mbg.po.MBlog;
import com.zc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/blogLists")
    public CommonResult listBlog(@RequestParam Integer currentPage,@RequestParam Integer pageSize) {


       /* List<MBlog> blogLists= blogService.getBlogLists(currentPage,pageSize);
        List<BlogVo> blogVos = new ArrayList<>();
        for(MBlog mBlog:blogLists){
            BlogVo blogVo = new BlogVo();

            BeanUtil.copyProperties(mBlog,blogVo);

            blogVos.add(blogVo);

        }*/
        PageInfo  blogPageInfo= (PageInfo) blogService.getBlogLists(currentPage,pageSize);

        return CommonResult.success(blogPageInfo);
    }


    @GetMapping("/{id}")
    public CommonResult detail(@PathVariable(name = "id") Long id) {
        MBlog mBlog = blogService.getBlogById(id);

        BlogVo blogVo = new BlogVo();

        BeanUtil.copyProperties(mBlog,blogVo);


        return CommonResult.success(blogVo);
    }
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

            blog = new MBlog();
            blog.setId(blogDto.getId());
            blog.setUserId(1L);
           // blog.setCreated(LocalDateTime.now());





        }else{
        //添加

            blog = new MBlog();
            blog.setUserId(1L);
            blog.setCreated(LocalDateTime.now());
            blog.setStatus(0);

        }

        BeanUtil.copyProperties(blogDto, blog, "id", "userId", "created", "status");
        System.out.println("传入的修改参数"+blog.toString());
        int success   = blogService.createOrUpdate(blog);

        if(success == 1){

            return CommonResult.success(null);
        }else{

            return  CommonResult.failed();

        }




    }



}
