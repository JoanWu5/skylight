package com.skyLight.skyLight.controller;

import com.skyLight.skyLight.service.FileService;
import com.skyLight.skyLight.tool.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileService fileService;

    @RequestMapping(value = "/coverUpload",method = RequestMethod.POST)
    public ObjectResponse singleFileUpload(@RequestParam("file") MultipartFile file,
                                           @RequestParam("blogId") String id) {

        ObjectResponse objectResponse = new ObjectResponse();
        objectResponse.setMsg(fileService.coverUpload(file,id));
        return objectResponse;

    }
}
