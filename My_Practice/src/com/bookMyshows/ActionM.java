package com.bookMyshows;
public class ActionM extends BookMyShow {
	String category;

	public ActionM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionM(int seats, String seatType, double price, String theater, double duration, String name, String category) {
		super(seats, seatType, price, theater, duration, name);
		// TODO Auto-generated constructor stub
		this.category=category;
	}

	@Override
	public void booking() {
		// TODO Auto-generated method stub
		super.booking();
		System.out.println("Name of the movie: "+name);
		System.out.println("Duration of this movie (mins): "+this.duration);
		System.out.println("Category of this movie:"+this.category);
		
	}
	
	
	
	
	
	

}
