package com.example.day2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="S.No")
    private int sno;
    @Column(name="Product")
    private String names;
    @Column(name="Brand")
    private String brand;
    @Column(name="Price") 
    private String price;
    @Column(name="Quality")
    private int quality;
    @Column(name="Warrenty")
    private String warren;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getWarren() {
		return warren;
	}
	public void setWarren(String warren) {
		this.warren = warren;
	}
    
	
	
	
	
}