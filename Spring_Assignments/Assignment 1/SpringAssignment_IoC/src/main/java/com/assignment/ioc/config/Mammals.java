package com.assignment.ioc.config;

public class Mammals extends Animal
{
    private String color;

	public Mammals(String animal_name, String animal_type, String color)
	{
		super(animal_name, animal_type);
		this.color = color;
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
	 return "Name of the mammal is "+animal_name+" its type is "+animal_type+" Color is "+color ; 
   }
   

    
}
