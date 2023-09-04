package com.sports;
public class ActionG extends Game {
	
	int VNo;

	public ActionG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionG(String name, String type, String genre, int Vno) {
		super(name, type, genre);
		this.VNo=Vno;
		
		
	}
	@Override
	public void details() {
		// TODO Auto-generated method stub
		super.details();
		System.out.println("Version No.: "+VNo);
	}
	
	
	
	

}
