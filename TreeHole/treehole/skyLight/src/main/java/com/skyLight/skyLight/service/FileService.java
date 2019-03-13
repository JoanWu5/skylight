package com.skyLight.skyLight.service;

import com.skyLight.skyLight.tool.ObjectResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FileService {

    private static String COVER_FOLDER = "D:/work/devops/TreeHole/treehole/src/main/resources/static/cover";


    public String coverUpload(MultipartFile file,String blogId){
        if(file.isEmpty()){
            return "the file is empty";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        //此处为文件的存储路径
        String path = COVER_FOLDER + blogId;
        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "upload successfully";
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
            return e.toString();
        }
    }

    public boolean multifileUpload(List<MultipartFile> files, String blogId){
        if(files.isEmpty()){
            return false;
        }

        String path = "d:/test/" + blogId;

        for(MultipartFile file:files){
            String fileName = file.getOriginalFilename();
            int size = (int) file.getSize();
            System.out.println(fileName + "-->" + size);

            if(file.isEmpty()){
                return false;
            }else{
                File dest = new File(path + "/" + fileName);
                if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
                    dest.getParentFile().mkdir();
                }
                try {
                    file.transferTo(dest);
                }catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }



}
