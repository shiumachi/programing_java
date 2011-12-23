package org.progjava.ch3;

public class Y extends X {
	protected int yMask = 0xff00;

	public Y() {		
		super();
		System.out.printf("yMask: %x\n", yMask);
		fullMask |= yMask;
		System.out.printf("Y()\n");
		System.out.printf("yMask: %x\n", yMask);
		System.out.printf("fullMask: %x\n", fullMask);

	}

}
