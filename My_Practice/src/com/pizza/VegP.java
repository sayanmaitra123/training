package com.pizza;

public class VegP extends Pizza {
	String category,type;
	int toppings;

	public VegP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VegP(String bread, double d, String cheese, String category, String type, int toppings) {
		super(bread, d, cheese);
		// TODO Auto-generated constructor stub
		
		this.category=category;
		this.type=type;
		this.toppings=toppings;
	}

	@Override
	public void bill() {
		// TODO Auto-generated method stub
		super.bill();
		System.out.println("Category is: "+this.category);
		System.out.println("Type: "+ this.type);
		System.out.println("No. of Veg toppings: "+this.toppings);
	}
	
	
	
	
	
	

}
