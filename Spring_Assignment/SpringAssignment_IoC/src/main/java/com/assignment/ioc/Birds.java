package com.assignment.ioc;

public class Birds extends Animal
{
  private String color;

public Birds(String animal_name, String animal_type, String color)
{
	super(animal_name, animal_type);
	this.color = color;
}

public Birds()
{
	
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

@Override
public String Display()
{
	 return "Name of the bird is "+animal_name+" its type is "+animal_type+" Color is "+color ;  
}
  



}
