package com.miaowu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.miaowu.entity.Blog;
import com.miaowu.service.BlogService;
import com.miaowu.vo.BlogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping("/save")
    public void saveBlog(@RequestBody Blog blog) throws Exception {
        Boolean result = blogService.save(blog);
        if (!result) throw new Exception("保存失败");
    }

    @GetMapping("/delete/{id}")
    public void deleteBlog(@PathVariable("id") Integer id) throws Exception {
        Boolean result = blogService.removeById(id);
        if (!result) throw new Exception("删除失败");
    }

    @PostMapping("/update")
    public void updateBlog(@RequestBody Blog blog) throws Exception {
        Boolean result = blogService.updateById(blog);
        if (!result) throw new Exception("更新失败");
    }

    @PostMapping("/search")
    public IPage<Blog> search(@RequestBody BlogVO blogVO) {
        IPage<Blog> blogIPage = blogService.searchBlog(blogVO);
        return blogIPage;
    }

    @GetMapping("/get/{id}")
    public Blog getBlog(@PathVariable("id") Integer id) throws Exception {
        Blog blog = blogService.getById(id);
        if (blog == null) throw new Exception("获取失败");
        return blog;
    }

}
