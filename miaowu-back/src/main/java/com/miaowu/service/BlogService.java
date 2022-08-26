package com.miaowu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.miaowu.entity.Blog;
import com.miaowu.vo.BlogVO;

public interface BlogService extends IService<Blog> {

    public IPage<Blog> searchBlog(BlogVO blogVO);
}
