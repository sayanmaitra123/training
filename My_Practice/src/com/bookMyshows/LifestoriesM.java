package com.bookMyshows;
public class LifestoriesM extends BookMyShow {
	
	String category;

	public LifestoriesM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifestoriesM(int seats, String seatType, double price, String theater, double duration, String name, String category) {
		super(seats, seatType, price, theater, duration, name);
		// TODO Auto-generated constructor stub
		this.category=category;
	}

	@Override
	public void booking() {
		// TODO Auto-generated method stub
		super.booking();
		System.out.println("Name of movie: "+this.name);
		System.out.println("Duration of movie (mins): "+this.duration);
		System.out.println("Category of movie: "+this.category);
	}
	
	
	
	

}
