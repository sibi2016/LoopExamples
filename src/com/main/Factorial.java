package com.main;

public class Factorial {
	
	public static void findFactorialNonRecursive()
	{
		int number = 12;
		int factorial = 1;
		for (int i=2; i<=number; i++)
		{
			factorial = i * factorial;
		}
		
		System.out.println("Factorial of the number "+number+" is "+factorial);
	}
	
	public static int findFactorialRecursive(int number)
	{
		if (number == 1)
		{
			return 1;
		}
		else
		{
			return (number*findFactorialRecursive(number-1));
		}
		
	}
	
	public static void main(String[] args) {
		
		findFactorialNonRecursive();
		System.out.println("Factorial of the number is "+findFactorialRecursive(12));
	}

}
