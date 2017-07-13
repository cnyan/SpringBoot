package com.springmvc.web;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by 闫继龙 on 12/07/2017.
 */
@Controller
//@RequestMapping(value = "/upload")
public class UploadController {


    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file){


        try {
            FileUtils.writeByteArrayToFile(new File("/Users/jsj-9-4/",file.getOriginalFilename()),file.getBytes());

            System.out.println("上传文件:" + FileUtils.getTempDirectoryPath());
            return "upload success";
        } catch (IOException e) {
            e.printStackTrace();
            return "upload error";
        }
    }
}
