package com.assignment.ioc.config;

import org.springframework.beans.factory.annotation.Autowired;

public class Person
{
  private String person_name;
  private String person_age;
  
  @Autowired
  private Animal person_animal;


public Person(String person_name, String person_age) {
	super();
	this.person_name = person_name;
	this.person_age = person_age;
	
}


public String getPerson_name() {
	return person_name;
}


public void setPerson_name(String person_name) {
	this.person_name = person_name;
}


public String getPerson_age() {
	return person_age;
}


public void setPerson_age(String person_age) {
	this.person_age = person_age;
}


public Animal getPerson_animal() {
	return person_animal;
}


public void setPerson_animal(Animal person_animal) {
	this.person_animal = person_animal;
}
  
public String Display()
{
	 return "Name of person is "+person_name+" age is "+person_age+" person's animal is "+person_animal.getAnimal_name(); 
}
}
