package com.robots;

public class MechanizedR extends Robot {
	
	int duration;
	String energySource;
	public MechanizedR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MechanizedR(String type, String idNo, String function, int duration, String energySource) {
		super(type, idNo, function);
		// TODO Auto-generated constructor stub
		this.duration=duration;
		this.energySource=energySource;
	}
	@Override
	public void report() {
		// TODO Auto-generated method stub
		super.report();
		System.out.println("Duration of usage of it (hours): "+duration);
		System.out.println("The charging source of it: "+energySource);
		
	}
	
	
	
	

}
