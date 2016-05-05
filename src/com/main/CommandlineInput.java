package com.main;
import java.util.Scanner;

public class CommandlineInput {
	
	public static void main(String[] args)
	{
		
		System.out.println("Please enter a string");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		System.out.println("You entered "+ s);
		
		
	}

}
