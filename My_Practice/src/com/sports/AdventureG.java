package com.sports;
public class AdventureG extends Game {
	
	int levelNos;
	int maps;
	
	public AdventureG() {
		
	}
	
	

	



	public AdventureG(String name, String type, String genre, int levelNos, int maps) {
		super(name, type, genre);
		// TODO Auto-generated constructor stub
		
		this.levelNos=levelNos;
		this.maps=maps;
	}







	@Override
	public void details() {
		// TODO Auto-generated method stub
		super.details();
		System.out.println("No. of Levels to be completed: "+levelNos);
		System.out.println("Available Maps count: "+maps);
	}
	
	

}
