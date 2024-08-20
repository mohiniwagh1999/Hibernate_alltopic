package com.tut;


import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



@Entity
public class Address {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     @Column(name="id")
	private int add_id;
     @Column(length=50,name="str")
	private String street;
	private String city;
	private boolean isOpen;
	
	@Transient
	private double x;
	//@Temporal(TemporalType.DATE)
	//private Date addedDate;
	@Lob
	private byte[] image;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(int add_id, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.add_id = add_id;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		//this.addedDate = addedDate;
		this.image = image;
	}


	public int getAdd_id() {
		return add_id;
	}


	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	


	


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x=" + x
				+ ", addedDate="  + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
	
}
