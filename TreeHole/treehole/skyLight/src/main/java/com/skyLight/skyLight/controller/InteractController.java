package com.skyLight.skyLight.controller;

import com.skyLight.skyLight.dao.BlogMapper;
import com.skyLight.skyLight.entity.Blog;
import com.skyLight.skyLight.tool.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/interac")
public class InteractController {

    @Autowired
    BlogMapper blogMapper;

    @RequestMapping("/praise")
    public ObjectResponse praise(@RequestBody Blog blog){
        blog = blogMapper.selectByPrimaryKey(blog.getId());
        blog.setPraise(blog.getPraise() + 1);
        blogMapper.updateByPrimaryKey(blog);
        return new ObjectResponse();
    }
}
