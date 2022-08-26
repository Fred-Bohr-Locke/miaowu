package com.miaowu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miaowu.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlogMapper extends BaseMapper<Blog>{
//    @Select("select * from blog order by datetime")
//    public List<Blog> findAll();
//
//    @Select("select * from blog where author=0 order by datetime")
//    public List<Blog> findYun();
//
//    @Select("select * from blog where author=1 order by datetime")
//    public List<Blog> findFeng();
}
