package com.visa;

public abstract class Citizenship {
	String name;
	int age;
	String gender;
	public Citizenship() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizenship(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void identification() {
		System.out.println(("Name of the person: "+name));
		System.out.println("Age of the person: "+age);
		System.out.println("Gender of the person: "+gender);
	}
	

}
