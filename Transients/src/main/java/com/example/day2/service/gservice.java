package com.example.day2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day2.model.gmodel;
import com.example.day2.repository.grep;

@Service
public class gservice {
	@Autowired
	public grep trepo;
	
	//post data
	public String postData(gmodel t)
	{
		trepo.save(t);
		return "Your data is saved successfully";
	}
	//transient
	public List<gmodel> getData()
	{
		return trepo.findAll();
	}

}