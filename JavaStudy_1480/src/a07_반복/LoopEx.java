package a07_반복;

public class LoopEx {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			    result = (++num);
		}
		
		System.out.println(result);
		
		int i = 0;
		
		while(i < 100) {
			    i++;
			    System.out.println(i);
			    System.out.println(i);
		}
		
		
		System.out.println("----------------------------");
		
		
		for(int j = 0; j < 100; ) {
			j++;
			System.out.println(j);	
		}
		for(int j = 0; j < 100; ) {
			j++;
			System.out.println(j);
		}
		for(int j = 0; j < 100; ) {
			j++;
			System.out.println(j);
		}
		for(int j = 0; j < 100; ) {
			j++;
			System.out.println(j);
		}	

	
	    int k = 0;
	    for(; k < 100;) {
	    	System.out.println(k);
	    	k++;
	    }	


	}
	
}
