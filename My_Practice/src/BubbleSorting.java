
public class BubbleSorting {
	public static void main(String[] args) {
		int[] ar1 = { 10, 15, 2, 3, 4, 90, 35, 66, 89, 9008 };
		int temp;

		// Sorting of given array
		for (int a = 0; a < ar1.length; a++) {
			for (int i = 0; i < ar1.length; i++) {
				for (int j = 0; j < i; j++)
					if (ar1[j] > ar1[j + 1]) {
						temp = ar1[j + 1];
						ar1[j + 1] = ar1[j];
						ar1[j] = temp;
					}
			}

		}
//		for (int i = 0; i < ar1.length; i++) {
//			for (int j = 0; j < i; j++)
//				if (ar1[j] > ar1[j + 1]) {
//					temp = ar1[j + 1];
//					ar1[j + 1] = ar1[j];
//					ar1[j] = temp;
//				}

		// To display the sorted array

		for (int j = 0; j < ar1.length; j++)
			System.out.print(ar1[j] + " ");

	}
}
