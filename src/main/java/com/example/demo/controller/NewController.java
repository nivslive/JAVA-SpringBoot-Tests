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
import com.example.demo.dto.UserDTO;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author nivs
 */
@Controller
@RequestMapping( "/")
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
    public List testing() {
        UserDTO user1 = new UserDTO();
        user1.setName("Nivs");
        user1.setYear("testing");
        UserDTO user2 = new UserDTO();
        user2.setName("Nivs");
        user2.setYear("testing");
        UserDTO user3 = new UserDTO();
        user3.setName("Nivs");
        user3.setYear("testing");
        
        List<UserDTO> list = new ArrayList<>();
        list.addAll(Arrays.asList(user1, user2, user3));
        //map.put("tests", "testando6541");
       // map.put("testsss", "testando52");
       // map.put("testss", "testando244");
       // map.put("testssss", "testando42");
      //  map.put("testsss", "testando42");
       // String json = map.toString();
        //model.addAttribute("attribute", "value");
        return list;
    }
}
