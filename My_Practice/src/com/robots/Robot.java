package com.robots;

public abstract class Robot {
	String type,idNo,function;;

	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Robot(String type, String idNo, String function) {
		super();
		this.type = type;
		this.idNo=idNo;
		this.function=function;
	}
	
	
	public void report() {
		System.out.println("ID No. of the robot: "+idNo);
		System.out.println("Type of it: "+type);
		System.out.println("Use of robot: "+function);
	}
	
	

}
