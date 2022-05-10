package com.wipro.training.springdemo;

public class Student {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {//Getter and setter
		this.name = name;
	}
	
	public void display()
    {
        System.out.println("Hello "+name);
    }

}
