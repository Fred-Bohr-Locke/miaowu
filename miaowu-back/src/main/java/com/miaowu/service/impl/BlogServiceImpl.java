package com.miaowu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miaowu.entity.Blog;
import com.miaowu.mapper.BlogMapper;
import com.miaowu.service.BlogService;
import com.miaowu.vo.BlogVO;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    public IPage<Blog> searchBlog(BlogVO blogVO){
        // 设置Page
        int currentPage = blogVO.getPage();
        int size = blogVO.getSize();
        Page page = new Page(currentPage, size);

        // 设置QueryWrapper
        QueryWrapper<Blog> queryWrapper = new QueryWrapper<>();

        // 设置需要的字段
        queryWrapper.select("id", "title", "summary", "author", "create_time");

        // 设置条件
        String title = blogVO.getTitle();

        if (!StringUtils.isEmpty(title)) {
            queryWrapper.like("title", title);
        }

        // 倒序排序：置顶、发布时间、发布状态、创建时间
        queryWrapper.orderByDesc("create_time");

        // 查找
        IPage<Blog> blogIPage = baseMapper.selectPage(page, queryWrapper);

        return blogIPage;
    }
}
