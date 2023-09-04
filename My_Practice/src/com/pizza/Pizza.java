package com.pizza;

public abstract class Pizza {
	
	String bread;
	double d;
	String cheese;
	
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pizza(String bread, double d, String cheese) {
		super();
		this.bread = bread;
		this.d = d;
		this.cheese=cheese;
	}
	
	public void bill() {
		System.out.println("Bread Type: "+bread);
		System.out.println("Diameter Size(cms): "+d);
		System.out.println("Cheese Type: "+cheese);
		
	}

}
