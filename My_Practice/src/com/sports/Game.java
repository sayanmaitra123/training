package com.sports;

public abstract class Game {
	
		String name;
		String type;
		String genre;
		
		public Game() {
			
		};
		
		public Game(String name, String type, String genre) {
			this.name=name;
			this.type=type;
			this.genre=genre;
			
		}
		
		public void details() {
			System.out.println("Name: "+ name);
			System.out.println("Type: "+ type);
			System.out.println("Genre: "+ genre);
		}
		
		
	
		
}
