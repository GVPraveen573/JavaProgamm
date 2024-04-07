package javapackage;

public class Method_Overloading_Sample {
	
	Method_Overloading_Sample()
	{
		this (10);
		//this (5.2); // This only should be on 1st line
		System.out.println("1");
		
	}
	
	Method_Overloading_Sample(int a )
	{
		//this(5.2);
		System.out.println("2");
	}
	Method_Overloading_Sample(double b)
	{
		this ('a');
		System.out.println("3");
	}
	Method_Overloading_Sample(char c)
	{
		System.out.println("4");
	}
	
	public static void main (String args[])
	{
		new Method_Overloading_Sample();
	}

}
