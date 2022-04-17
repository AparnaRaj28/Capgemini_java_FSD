package com.assignment.ioc.config;

import org.springframework.context.annotation.Bean;

public class Config 
{
  @Bean("birds")
  public Birds getBirds()
  {
	  Birds b=new Birds("Dove","Mourning","light brown");
	  return b;
  }
  @Bean("mammals")
  public Mammals getMammals()
  {
	  Mammals m=new Mammals("Dove","Mourning","light brown");
	  return m;
  }
  @Bean("person")
  public Person getPerson()
  {
	  Person p=new Person("James","22");
	  return p;
  }
	@Bean("person_animal")
	public Animal getAnimal() {
		Animal animal = new Animal("Dog","color");
		return animal;
	}
}
