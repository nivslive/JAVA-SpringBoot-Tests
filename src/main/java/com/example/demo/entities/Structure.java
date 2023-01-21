package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Collection;

import com.example.demo.entities.Components;
import com.example.demo.interfaces.Component;
public class Structure {
    ArrayList<Object> components = new ArrayList<Object>();

    public ArrayList<Object> setComponents() {  
        ArrayList<Object> components = new ArrayList<Object>();
        components.add(new Resources("Test", "Test"));
        components.add(new Resources("test", "test"));
        Components comp = new Components(components, "title");
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(comp);
        return list;
    }

}