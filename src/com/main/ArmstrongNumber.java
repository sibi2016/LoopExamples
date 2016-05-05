package com.main;

public class ArmstrongNumber {
	
	public static void findAmstrongNumber()
	{
		int temp2 =0;
		int number = 54749;
		int compnumber = number;
		int numdigits = String.valueOf(number).length();
		for(int i = number;i > 0;)
		{
			int digit = number % 10;
			number = number/10;
			int temp1 = (int)Math.pow(digit, numdigits);
			temp2=temp2+temp1;
			if (number == 0)
			{
				break;
			}
		}
		if(temp2 == compnumber)
		{
			System.out.println("The number "+compnumber+" is an Armstrong number");
		}
		else
		{
			System.out.println("The number "+compnumber+" is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		findAmstrongNumber();
	}
}
