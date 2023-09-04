package com.pizza;
public class NonVegP extends Pizza {
	int toppings;
	String type;
	public NonVegP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NonVegP(String bread, double d, String cheese, String type, int toppings) {
		super(bread, d, cheese);
		// TODO Auto-generated constructor stub
		this.type=type;
		this.toppings=toppings;
	}
	@Override
	public void bill() {
		// TODO Auto-generated method stub
		super.bill();
		System.out.println("Type: "+type);
		System.out.println("No. of Non Veg toppings: "+toppings);
	}
	
	
	

}
