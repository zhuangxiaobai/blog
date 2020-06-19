package com.zc.blog.mbg.mapper;

import com.zc.blog.mbg.po.MUser;

public interface MUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MUser record);

    int insertSelective(MUser record);

    MUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);
}