package mypackage;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		//variable declaration
		
		int input;
		Scanner obj = new Scanner(System.in);
		int sum=0; 
		int i;
		
		//read user
		System.out.println("Enter any natural number:");
		input = obj.nextInt();
		
		
		//find sum of n natural numbers
		for(i=1;i<=input;i++)
			sum+=i;
		
		System.out.println(sum);
		

		
	
			
		

	}

}
