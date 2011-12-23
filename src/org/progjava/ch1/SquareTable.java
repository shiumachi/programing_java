package org.progjava.ch1;

public class SquareTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer N = new Integer(10);
		
		if (args.length == 2){
			N = new Integer(args[1]);
		}
		
		for(int i = 0; i < N; i++){
			System.out.printf("%d: %d\n", i+1, (int)Math.pow((double)(i+1),(double)2));
		}
		

	}

}
