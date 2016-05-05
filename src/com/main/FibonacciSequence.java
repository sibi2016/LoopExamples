package com.main;

public class FibonacciSequence {
	public static void generateFibo() {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1);
		int nTemp;
		for (int i = 1; i < 15; i++) {
			System.out.print(" " + n2);
			nTemp = n1 + n2;
			n1 = n2;
			n2 = nTemp;
		}
	}
}

