package com.skyLight.skyLight.controller;

import com.skyLight.skyLight.dao.AuthorMapper;
import com.skyLight.skyLight.entity.Author;
import com.skyLight.skyLight.tool.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorMapper authorMapper;

    @RequestMapping("/setInfo")
    public ObjectResponse setInfo(@RequestBody Author author){
        ObjectResponse objectResponse = new ObjectResponse();
        if(authorMapper.selectByPrimaryKey(author.getId()) == null){
            objectResponse.setMsg("该作者不存在");
            objectResponse.setStatus(404);
        }else
            authorMapper.updateByPrimaryKeySelective(author);
        return objectResponse;
    }

    @RequestMapping("getInfo")
    public ObjectResponse getInfo(@RequestBody Map map){
        ObjectResponse<Author> objectResponse = new ObjectResponse<>();

        if(authorMapper.selectByPrimaryKey((String) map.get("authorId")) == null){
            objectResponse.setMsg("该作者不存在");
            objectResponse.setStatus(404);
        }else
            objectResponse.setData(authorMapper.selectByPrimaryKey((String) map.get("authorId")));
        return objectResponse;

    }
}
