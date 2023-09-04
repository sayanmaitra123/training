package com.robots;
public class VirtualR extends Robot {
	
	String typeOfService;
	String name;
	public VirtualR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VirtualR(String type, String idNo, String function, String typeOfService, String name) {
		super(type, idNo, function);
		// TODO Auto-generated constructor stub
		this.typeOfService=typeOfService;
		this.name=name;
		
	}
	@Override
	public void report() {
		// TODO Auto-generated method stub
		super.report();
		System.out.println("The kind of service it offers: "+typeOfService);
		System.out.println("Name of this service: "+name);
		
	}
	
	
	
	

}
