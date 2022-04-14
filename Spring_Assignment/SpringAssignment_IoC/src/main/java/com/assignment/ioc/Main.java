package com.assignment.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		//System.out.println("Config loaded");
		//Birds b=(Birds)context.getBean("birds");
		//System.out.println(b.Display());
		Animal animal_bird=context.getBean("birds",Animal.class);
		Animal animal_mammal=context.getBean("mammals",Animal.class);
		Person p=(Person)context.getBean("person");
		System.out.println(animal_bird.Display());
		System.out.println(animal_mammal.Display());
		System.out.println(p.Display());
	}

}
