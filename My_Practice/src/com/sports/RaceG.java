package com.sports;
public class RaceG extends Game {
	
	String arcadeType;
	
	public RaceG() {
		super();
	}

	public RaceG(String name, String type, String genre, String arcadeType) {
		super(name, type, genre);
		this.arcadeType=arcadeType;
		
	}
	
	@Override
	public void details() {
		// TODO Auto-generated method stub
		super.details();
		System.out.println("Arcade Type: "+arcadeType);
	}
	
	
	
	
	

}
