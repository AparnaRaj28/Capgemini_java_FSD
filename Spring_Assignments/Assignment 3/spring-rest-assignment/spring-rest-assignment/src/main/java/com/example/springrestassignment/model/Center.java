package com.example.springrestassignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Center 
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long center_id;
  private String center_address;
  private int center_pincode;
  private String center_district;
  private String center_state;
  
   public Center() {

     }

public long getCenter_id() {
	return center_id;
}

public void setCenter_id(long center_id) {
	this.center_id = center_id;
}

public String getCenter_address() {
	return center_address;
}

public void setCenter_address(String center_address) {
	this.center_address = center_address;
}

public int getCenter_pincode() {
	return center_pincode;
}

public void setCenter_pincode(int center_pincode) {
	this.center_pincode = center_pincode;
}

public String getCenter_district() {
	return center_district;
}

public void setCenter_district(String center_district) {
	this.center_district = center_district;
}

public String getCenter_state() {
	return center_state;
}

public void setCenter_state(String center_state) {
	this.center_state = center_state;
}

public Center(String center_address, int center_pincode, String center_district, String center_state) {
	super();
	this.center_address = center_address;
	this.center_pincode = center_pincode;
	this.center_district = center_district;
	this.center_state = center_state;
}
   
}
