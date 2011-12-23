package org.progjava.ch3;

public class X {
	protected int xMask = 0x00ff;
	protected int fullMask;

	public X() {
		System.out.printf("fullMask: %x\n", fullMask);
		fullMask = xMask;
		System.out.printf("X()\n");
		System.out.printf("xMask: %x\n", xMask);
		System.out.printf("fullMask: %x\n", fullMask);
	}

	public int mask(int orig) {
		return (orig & fullMask);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Y y = new Y();
		
		System.out.printf("%x %x %x\n", y.xMask, y.yMask, y.fullMask);

	}

}
