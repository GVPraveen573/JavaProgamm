package javapackage;

import java.util.Arrays;

public class Array_String_3 {

	public static void main(String[] args) {
		String name="20Praveen1";
		int sum=0;
		int count=0;
		char [] a =name.toCharArray();
		System.out.println(Arrays.toString(a));
		for (int i=0;i<name.length();i++)
		{
			boolean answer=Character.isDigit(a[i]);
			//System.out.println(answer);
			if (answer==true)
			{
				System.out.println("Numeric value is present at " +i);				
				sum=sum+a[i];
				count++;
			}
			
		}
		System.out.println("Number of digits : "  +count);
		System.out.println("Sum of digits : "  +sum);
	}

}
