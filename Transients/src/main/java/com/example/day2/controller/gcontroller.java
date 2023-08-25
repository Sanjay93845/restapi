package com.example.day2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2.model.gmodel;
import com.example.day2.service.gservice;

@RestController
public class gcontroller {
	@Autowired
	public gservice tserv;
	
	//posting the data
	@PostMapping("/postDetails")
	public String insertingDetails(@RequestBody gmodel t)
	{
		 tserv.postData(t);
		 return "Your data is saved successfully";
	}
	@GetMapping("/getDetails")
	public List<gmodel> gettingData(){
		return tserv.getData();
	}

}