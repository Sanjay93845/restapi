package com.example.day2.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.day2.model.model;


public interface rep extends JpaRepository<model, Integer> {

}

