package com.main;

public class PingPong 
{
	public PingPong()
	{
		int num = 2;
		int reminder1 = num % 3;
		int reminder2 = num % 5;
		if (reminder1 == 0 && reminder2 == 0)
		{
			System.out.println("Ping Pong");
		}
		else if (reminder2 == 0)
		{
			System.out.println("Pong, Divisible by 5");
		}
		else if (reminder1 == 0)
		{
			System.out.println("Ping, Divisible by 3");
		}
		else
		{
			System.out.println("The number "+num+" is not divisible by 3 or 5." );
		}
	}
}
