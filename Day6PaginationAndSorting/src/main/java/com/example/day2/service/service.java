package com.example.day2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

import com.example.day2.model.model;
import com.example.day2.repository.rep;

@Service
public class service {
	@Autowired
	public rep grepo;
	
	//post the data
	public String saveMatrix(model m)
	{
		 grepo.save(m);
		 return "Data is saved";
		
	}
	
	//get the data
    public List<model> getMatrix()
	{
		 return grepo.findAll();
			
	}
    // update the data
    public model updatematrix (model mm)
    {
    	return grepo.saveAndFlush(mm);
    }
    //delete the data
    public void deletematrix(int sno) {
    	grepo.deleteById(sno);
    }
    //delete data
    public boolean deletematrixif(int name)
    {
    	if(grepo.existsById(name)) {
    		grepo.deleteById(name);
    		return true;
    	}else {
    		return false;
    	}
    }
  //getUserId
    @GetMapping("/users/userId")
    
    public Optional<model> getuserById(int userId)
    {
    	Optional<model> hotel = grepo.findById(userId);
    	if(hotel.isPresent()) {
    		return hotel;
    	}
    	else
    	{
    		return null;
    	}
    }
  //sorting
    public List<model> sortByAsc(String name)
	{
		return grepo.findAll(Sort.by(name).descending());
	}
}