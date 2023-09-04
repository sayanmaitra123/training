
public class Example4 {
	
	public static void main(String[] args) {
		
		String [] vocab= {"is","are","am","of","an","a"};
		String quote="Those are Apples";
		
		boolean flag=false;
		
		for (String string : vocab) {
			if(quote.indexOf(string)!=-1) {
				flag=true;
				break;
			}
		}
		
		System.out.println(flag?"Valid Quote":"Invalid Quote");
	}

}
