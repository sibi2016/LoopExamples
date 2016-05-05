package com.main;

public class PrimeNumber {
	
	
	public static void primeNumb()
	{
		int number = 91;
		int half = (number + 1)/2;
		int reminder = 1;
		System.out.println(number);
		for (int i=2; i <= half;i++ )
		{
			reminder = number%i;
			if(reminder == 0)
			{
				System.out.println("Number is not prime");
				System.out.println("Factor is " +i);
				break;
			}
						
		}
		if(reminder != 0)
		{
		System.out.println("Number is prime");
		}
	}
	
	public static void main(String[] args) {
		primeNumb();
	}
}
