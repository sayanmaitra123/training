import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		int[] first= {3,6,8,1};
		int[] second= {2,4,7,9,5};
		
		mergeArray(first,second);
		
		System.out.println(Arrays.toString(first));
	}
	private static void mergeArray(int[] first, int[] second) {
		int[] final1=new int[first.length+second.length];
		int k;
		
		for(k=0;k<first.length;k++) {
			final1[k]=first[k];
			
		}
		
		for(int j=0;j<second.length;j++) {
			final1[k]=second[j];
		}
		
		System.out.println("Merged Array : "+final1);
		
	}

}
