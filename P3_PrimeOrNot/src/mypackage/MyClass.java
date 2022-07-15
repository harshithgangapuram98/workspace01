package mypackage;

import java.util.Scanner;

public class MyClass {

	private static int Counter;

	public static void main(String[] args)
	{
		//variable declaration
		int input;
		Scanner obj = new Scanner(System.in);
		
		//read user
		System.out.println("Enter any number");
		input = obj.nextInt();
		
		//logic
		for(int i=1;i<=input;i++)
		{
			if(input%i==0)
				Counter++;
		}
		if(Counter==2)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");

	}

}
