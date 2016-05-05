package com.main;
import java.util.Scanner;

public class CommandlineInput {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String s = sc.nextLine();
		System.out.println("You entered "+ s);
		
		
	}

}
