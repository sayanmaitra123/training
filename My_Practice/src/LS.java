
import java.util.Scanner;

public class LS {
	
		public static void main(String[] args) {
			int[] ar1 = { 10, 4, 1, 0, 7 };
			int found = 0;
			int index = 0;

			
			

			for (int i = 0; i < ar1.length; i++) {
				if (7== ar1[i])
					found = 1;
					index = i;
				break;
			}

			if (found == 1)
				System.out.println("Value " + 10+ " is found at index position " + index);
			else
				System.out.println("Value " + 10+ " is NOT found !!");

		}

	}



