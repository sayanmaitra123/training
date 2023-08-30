import java.util.Iterator;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			
		}
		//Using for-each loop
		System.out.println(" ");
		
		for (int i : ar) {
			System.out.println(i);
		}
		
		System.out.println(" ");
		
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Using for each loop
		
		for (int[] is : mat) {
			for (int j : is) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		int [][] jag= {{1,2},{3,4,5},{6,7,8,9}};
		
		for (int[] is : jag) {
			for (int i : is) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}
}
