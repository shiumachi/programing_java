package org.progjava.ch1;

public final class ImprovedFibonacci {

	static final int MAX_INDEX = 9;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lo = 1;
		int hi = 1;
		boolean isEven;
		String mark;
		Result[] results = new Result[MAX_INDEX];
		String[] output = new String[MAX_INDEX];
		
		System.out.println("1: " + lo);
		results[0] = new Result(1, false);
		
		
		for(int i = MAX_INDEX; i > 1; i--){
			if (hi % 2 == 0){				
				isEven = true;
			} else {
				isEven = false;
			}
			
			results[MAX_INDEX-i+1] = new Result(hi,isEven);
			hi = lo + hi;
			lo = hi - lo;
			
		}
		
		for(int i = 0; i < MAX_INDEX; i++){
		  if(results[i].isEven() == true){
		    mark = " *";
		  } else {
		    mark = "";
		  }
      output[i] = (i+1) + ": " + results[i].getResult() + mark;
		}
		
		for(int i = 0; i < MAX_INDEX; i++){
		  System.out.printf("%s\n", output[i]);
		}
	}

}
