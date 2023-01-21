/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Components;
import com.example.demo.entities.Structure;

/**
 *
 * @author nivs
 */
@Controller
@RequestMapping("url")
public class RestController {

    @GetMapping("/testhash")
    @ResponseBody
    public ArrayList<Object> page(Model model) {
        Structure structure = new Structure();
        return structure.setComponents();
    }
    
}
