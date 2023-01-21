/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.example.demo.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.naming.Context;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author nivs
 */
@Controller
public class FileResource {
    
    @Autowired
    private ResourceLoader resourceLoader;
    
    @RequestMapping("/storage")
    public static void createCacheFile(Context context, String fileName, String json) {

        FileWriter file = new FileWriter("E:/output.json");
        file.write(jsonObject.toJSONString());
        file.close();
    }
}
