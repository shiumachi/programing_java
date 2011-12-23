package org.progjava.ch1;

public class Fibonacci {

	static final String TITLE = "Fibonacci Program";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c = 2;
		int N = 10;
		int[] results = new int[N];
		
		System.out.println(TITLE);
		
		for(int i = 0; i < N; i++){
			if (i+1 == 1){
				results[i] = 1;
				continue;
			} else if (i+1 == 2){				
				results[i] = 1;
				continue;
			} else if (i+1 == 3){				
				results[i] = 2;
				continue;
			} 
			
			a = b;
			b = c;
			c = a + b;
			results[i] = c;
		}
		
		for(int i = 0; i < N; i++){
      System.out.printf("%d: %d\n", i+1, results[i]);		  
		}

	}

}
