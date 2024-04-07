package javapackage;

import java.util.Arrays;

public class Array_string_4 {

	public static void main(String[] args) {
		String name="20Praveen1";
		int sum=0;
		int count=0;
		char [] a =name.toCharArray();
		System.out.println(Arrays.toString(a));
		for (int i=0;i<name.length();i++)
		{
			boolean answer=Character.isAlphabetic(a[i]);
			//System.out.println(answer);
			if (answer==true)
			{
				System.out.println("Alphabet value is present at " +i);				
				//sum=sum+a[i];
				count++;
			}
			
		}
		System.out.println("Number of alphabets : "  +count);
	//	System.out.println("Sum of digits : "  +sum);
	}

}
