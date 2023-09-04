package com.bookMyshows;
public class KidsM extends BookMyShow {
	
	String category;

	public KidsM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KidsM(int seats, String seatType, double price, String theater, double duration, String name, String category) {
		super(seats, seatType, price, theater, duration, name);
		// TODO Auto-generated constructor stub
		this.category=category;
	}

	@Override
	public void booking() {
		// TODO Auto-generated method stub
		super.booking();
		System.out.println("Name of the movie: "+this.name);
		System.out.println("Duration of the movie (mins): "+this.duration);
		System.out.println("Category of it: "+this.category);
	}
	
	
	
	

}
