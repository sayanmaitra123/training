package com.visa;

public class AliensC extends Citizenship {
	String countryOrigin, visaNo, entryPort;

	public AliensC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AliensC(String name, int age, String gender, String countryOrigin, String visaNo, String entryPort) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
		this.countryOrigin=countryOrigin;
		this.visaNo=visaNo;
		this.entryPort=entryPort;
	}

	@Override
	public void identification() {
		// TODO Auto-generated method stub
		super.identification();
		System.out.println("Origin Country: "+countryOrigin);
		System.out.println("Visa No. of Alien: "+visaNo);
		System.out.println("Port of Entry: "+entryPort);
	}
	
	
	
	
	
	
	
	

}
