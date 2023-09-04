package com.bookMyshows;

public abstract class BookMyShow {
	int seats;
	String seatType;
	double price;
	String theater;
	double duration;
	String name;
	
	public BookMyShow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookMyShow(int seats, String seatType, double price, String theater, double duration, String name) {
		super();
		this.seats = seats;
		this.seatType=seatType;
		this.price = price;
		this.theater = theater;
		this.duration=duration;
		this.name=name;
	}
	
	public void booking() {
		System.out.println("No. of seats: "+seats);
		System.out.println("Category of seats: "+seatType);
		System.out.println("Price of ticket per person: "+price);
		System.out.println(("Total Ticket Cost: "+(seats*price)));
		System.out.println("Theater Name: "+theater);
		
	}

}
