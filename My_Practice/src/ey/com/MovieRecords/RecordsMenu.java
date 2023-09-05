package ey.com.MovieRecords;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecordsMenu {
	public static void main(String[] args) throws IOException {
		RecordsDao r = new RecordsDaoImpl();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Enter one of the choices :");
			System.out.println("1. Add record");
			System.out.println("2. List Records");
			System.out.println("3. Find by actor");
			System.out.println("4. Find by genre");
			System.out.println("5. Find by title");
			System.out.println("6. Update a record");
			System.out.println("7. Delete a record");
			System.out.println("8. Exit program");

			int ch = scan.nextInt();

			switch (ch) {
			case 1:
				BufferedWriter w = new BufferedWriter(new FileWriter("src/movies.txt"));
				Scanner s1 = new Scanner(System.in);

				System.out.println("Enter artist name: ");
				w.write(s1.next());
				System.out.println("Enter movie genre :");
				w.write("," + s1.next());
				System.out.println("Enter movie title:");
				w.write("," + s1.nextLine());
				
				

			}
		}

	}
}
