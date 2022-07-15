package mypackage;

public class MyClass {

	public static void main(String[] args) 
	{
		
		int[] data = new int[] {5,7,8,9,6};
		
		/*//print the values using for loop
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
		//print the values using for each loop
		for(var d:data)
			System.out.println(d);
		*/
		
		int big = data[0];
		
		for(var d:data)
		{
			if(d>big)
				big=d;
		}
		System.out.println("Big="+big);
		
	}
}
