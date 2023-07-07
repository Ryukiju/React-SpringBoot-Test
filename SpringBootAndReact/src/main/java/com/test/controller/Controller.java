package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value="/**")
    public String root(){
    	System.out.println("root");
        return "index.html";
    }
	

}
