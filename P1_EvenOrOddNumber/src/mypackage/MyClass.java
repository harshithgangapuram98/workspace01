package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args)
	{
		//variable declaration
		
		int input;
		Scanner obj = new Scanner(System.in);
		
		//read value from user
		System.out.println("Enter any number:");
		input = obj.nextInt();
		String result;
		//logic writing
		/*if(input%2==0)
			result = "Even Number";
		else
			result = "Odd Number";
			*/
		result = (input%2==0)?"Even number":"Odd number";//turnary operator
		
		System.out.println(result);

	}

}
