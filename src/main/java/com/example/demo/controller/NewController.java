/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.Components;
import com.example.demo.entities.Structure;
import com.example.demo.entities.User;
import com.example.demo.interfaces.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author nivs
 */
@Controller
@RequestMapping("/")
public class NewController {
    
    @GetMapping
    @ResponseBody
    public String home() {
        //model.addAttribute("attribute", "value");
        return "Olá mundo!";
    }
    
    @GetMapping("testhash")
    @ResponseBody
    //  @ResponseStatus(code = HttpStatus.GET)
    public String testHash() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("tests", "testando6541");
        map.put("testsss", "testando52");
        map.put("testss", "testando244");
        map.put("testssss", "testando42");
        map.put("testsss", "testando42");
        String json = map.toString();
        //model.addAttribute("attribute", "value");
        return json;
    }
    
    @GetMapping("testing")
    @ResponseBody
    //  @ResponseStatus(code = HttpStatus.GET)
    public Map testing() {
        User user1 = new User();
        user1.setName("Nivss");
        user1.setYear("testingg");
        User user2 = new User();
        user2.setName("Nivsss");
        user2.setYear("testingggss");
        User user3 = new User();
        user3.setName("Nivssss");
        user3.setYear("testingsss");
        Map<String, String> map = new HashMap<String, String>();
        map.put(user1.getName(), user1.getYear());
        map.put(user2.getName(), user2.getYear());
        map.put(user3.getName(), user3.getYear());
        //Optional
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(user1, user2, user3));
        //map.put("tests", "testando6541");
       // map.put("testsss", "testando52");
       // map.put("testss", "testando244");
       // map.put("testssss", "testando42");
      //  map.put("testsss", "testando42");
       // String json = map.toString();
        //model.addAttribute("attribute", "value");
        return map;
    }


    @GetMapping("fodase")
    @ResponseBody 
    public Components fodase() {
        Structure structure = new Structure();
        return structure.setComponents();
    }
}


