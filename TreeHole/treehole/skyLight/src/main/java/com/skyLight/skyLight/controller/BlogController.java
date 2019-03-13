package com.skyLight.skyLight.controller;

import com.skyLight.skyLight.dao.BlogMapper;
import com.skyLight.skyLight.dao.BlogTextMapper;
import com.skyLight.skyLight.entity.Blog;
import com.skyLight.skyLight.entity.BlogExample;
import com.skyLight.skyLight.entity.BlogText;
import com.skyLight.skyLight.entity.BlogTextExample;
import com.skyLight.skyLight.tool.CommonTool;
import com.skyLight.skyLight.tool.ObjectResponse;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogMapper blogMapper;

    @Autowired
    BlogTextMapper blogTextMapper;

    @RequestMapping("/publish")
    public ObjectResponse publish(@RequestBody Map map){
        Blog blog = new Blog();
        blog.setAuthorId((String) map.get("authorId"));
        blog.setAuthorName((String) map.get("authorName"));
        blog.setCoverId((String) map.get("coverId"));
        blog.setId(UUID.randomUUID().toString());
        blog.setPageViews(0);
        blog.setPraise(0);
        blog.setTime(new Date());
        blog.setTitle((String) map.get("title"));
        Short visualLevel = CommonTool.integerToShort((Integer) map.get("visualLevel"));
        blog.setVisableLevel(visualLevel);
        blogMapper.insert(blog);

        BlogText blogText = new BlogText();
        blogText.setBlogid(blog.getId());
        blogText.setText((String) map.get("text"));
        blogTextMapper.insert(blogText);

        return new ObjectResponse();
    }

    @RequestMapping("/showAll")
    public ObjectResponse showAllBlog(){
        ObjectResponse<List<Blog>> objectResponse = new ObjectResponse<>();
        objectResponse.setData(blogMapper.selectByExample(new BlogExample()));
        return objectResponse;
    }

    @RequestMapping("/text/blogId")
    public ObjectResponse getText(@RequestBody Blog blog){
        ObjectResponse<BlogText> objectResponse = new ObjectResponse<>();
        BlogTextExample blogTextExample = new BlogTextExample();
        blogTextExample.createCriteria().andBlogidEqualTo(blog.getId());
        List<BlogText> blogTexts = blogTextMapper.selectByExampleWithBLOBs(blogTextExample);
        if (blogTexts.size() == 0){
            objectResponse.setMsg("博客的内容不存在");
        }else {
            objectResponse.setData(blogTexts.get(0));
        }
        return objectResponse;
    }
}
