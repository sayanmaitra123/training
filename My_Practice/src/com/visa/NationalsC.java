package com.visa;
public class NationalsC extends Citizenship {
	String idNo;

	public NationalsC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NationalsC(String name, int age, String gender, String idNo) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
		this.idNo=idNo;
	}

	@Override
	public void identification() {
		// TODO Auto-generated method stub
		super.identification();
		System.out.println(("ID No.: "+idNo));
	}
	
	
	
	

}
