package com.zc.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan({"com.zc.blog.mapper","com.zc.blog.mbg.mapper"})
public class BlogApplication extends SpringBootServletInitializer {


    /**
     * 从外部启动tomcat要
     * 继承SpringBootServletInitializer类，重写configure方法
     * */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(BlogApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
