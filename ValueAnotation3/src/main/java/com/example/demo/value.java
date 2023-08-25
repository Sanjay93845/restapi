package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
     @Value("076")
     public int regNum;
     @Value("Sanjay")
     public String name;
     @RequestMapping("/display")
     public String display()
     {
	    return "My Name is "+name+"Reg Number is "+regNum;
     }
}
