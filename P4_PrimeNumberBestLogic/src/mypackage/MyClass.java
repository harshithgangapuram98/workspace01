package mypackage;

import java.util.Scanner;

public class MyClass {

	private static int Counter;

	public static void main(String[] args)
	{
		//variable declaration
		/*int input;
		Scanner obj = new Scanner(System.in);
		int i;
		
		//read user
		System.out.println("Enter any number");
		input = obj.nextInt();
		
		//actual logic
		for(i=2;i<input;i++)
		{
			if(input%i==0)
				break;
		
		}
		if(i==input)
		System.out.println("PRIME");
		else
			System.out.println("Not prime");
		*/
		int input;
		Scanner obj = new Scanner (System.in);
		int i;	
		
		System.out.println("Enter any number:");
		input = obj.nextInt();
		
		for(i=1;i<=input;i++)
		{
			if(input%i==0)
				Counter++;
		}
		  
			
		  if(Counter==2)
			  System.out.println("prime");
		  else
			  System.out.println("Not prime");
		
	}

}
