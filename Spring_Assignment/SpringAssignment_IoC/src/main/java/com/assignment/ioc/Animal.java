package com.assignment.ioc;

public class Animal 
{
   public String animal_name;
   public String animal_type;
   
public Animal(String animal_name, String animal_type) 
{
	
	this.animal_name = animal_name;
	this.animal_type = animal_type;
}

public Animal() 
{
	
}

public String getAnimal_name() {
	return animal_name;
}

public void setAnimal_name(String animal_name) {
	this.animal_name = animal_name;
}

public String getAnimal_type() {
	return animal_type;
}

public void setAnimal_type(String animal_type) {
	this.animal_type = animal_type;
}
public String Display()
{
	return "Name of the animal is "+animal_name+" and type is "+animal_type;
}


}
