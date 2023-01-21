package com.example.demo.entities;

import java.util.ArrayList;

public class Components {
    private ArrayList<Object> resources;
    private String type;

    public Components(ArrayList<Object> resources, String type) {
        this.resources = resources;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
     }

    public ArrayList<Object> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Object> resources) {
        this.resources = resources;
    }

}
