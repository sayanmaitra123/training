import java.util.Scanner;

public class SortStringQuiz {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = console.next();

		String res = sort(str);

	}

	private static String sort(String str) {

		char arr[] = str.toCharArray();

		char temp;

		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

				j += 1;
			}

			i += 1;

		}

		System.out.println(arr);

		/*
		 * char[] chars=str.toCharArray(); for(int i=0;i<chars.length;i++) { for(int
		 * j=0;j<chars.length;j++) { char c=' ';
		 * if(chars[0]+"".compareTo(chars[j]+"")>0) {
		 * 
		 * } } }
		 */

		return null;

	}

}
