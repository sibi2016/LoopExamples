package com.main;

public class SwapNumbers {
	//Swapping without third variable
	public static void swapNumbers1()
	{
		int Num1 = 10;
		int Num2 = 20;
		System.out.println("Swapping without third variable");
		System.out.println("N1" + "    "+ "N2");
		System.out.println(Num1 + "    "+ Num2);
		Num1 = Num1 + Num2;
		Num2 = Num1 - Num2;
		Num1 = Num1 - Num2;
		System.out.println(Num1 + "    "+ Num2);
	}
	
	//Swapping two numbers using a third variable
	public static void swapNumbers2()
	{
		int Num1 = 10;
		int Num2 = 20;
		System.out.println("N1" + "    "+ "N2");
		System.out.println(Num1 + "    "+ Num2);
		int Num3 = Num2;
		Num2 = Num1;
		Num1 = Num3;
		System.out.println(Num1 + "    "+ Num2);
	}
	
	public static void main(String[] args) {
		swapNumbers1();
		swapNumbers2();
	}
}
