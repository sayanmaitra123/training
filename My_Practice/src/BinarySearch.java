import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] ar2 = { 10, 20, 5, 11, 23 };
		int val = 23;

		// first is sorting the array

		Arrays.sort(ar2);

		// Displaying the sorted array

		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
		}

		// Binary Searching

		int left = 0;
		int right = ar2.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (ar2[mid] == val) {
				System.out.println(val + " is found at " + mid);
				break;
			} else if (ar2[mid] < val) {
				left = mid + 1;
			} else if (ar2[mid] > val) {
				right = mid - 1;
			}

		}
	}
}