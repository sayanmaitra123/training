

public class ArraySorting {
	public static void main(String[] args) {
		
		int [] ar= {5,3,1,2,4};
		int temp;
		int [] ar1=ar;
		
		
		System.out.println("This is the original loop:");
		for (int i : ar) {
			System.out.println(i);  //To display the original array that is initialized
		}
		System.out.println();
		
		int j;
				
		
		for (int i = 0; i < ar1.length; i++) {
			for(j=1;j<((ar1.length)-i);j++) {
				if(ar1[j-1]>ar1[j]) {
					temp=ar1[j-1];   //1st process of sorting array ar1
					ar1[j-1]=ar1[j];
					ar1[j]=temp;
				}
			}
			
		}
		
		
		for (int i = 0; i <ar.length; i++) {
			
			for(int k=i+1;k<ar.length;k++) {
				if(ar[i]>ar[k]) {
					temp=ar[i];                    //This is the nested-loop to sort the array, w/o the need for an Array method to sort, array ar
					ar[i]=ar[k];
					ar[k]=temp;
				}
			}
			
			
		}
		
		for (int i : ar) {
			System.out.println(i);   //This for-loop is for the printing of the sorted loop
		}
		
		
		
		
		
		
		
//		for (int i : ar) {
//			System.out.println(i);
//		}
		
		
		
		System.out.println("2nd way of sorting array :");
		
		for (int i : ar1) {
			System.out.println(i);
		}
		
		//My own logic for sorting of array
		
		
		
		
	}

}
