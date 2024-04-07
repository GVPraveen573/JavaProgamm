package javapackage;

import java.util.Arrays;

public class Array_String_6 {

	public static void main(String[] args) {
		String name="Manish123 $# Kumar";
		int count=0;
		int count1=0;
		char [] a =name.toCharArray();
		System.out.println(Arrays.toString(a));
		for (int i=0;i<name.length();i++)
		{
			count1++;
			boolean answer=Character.isWhitespace(a[i]);
			boolean answer1=Character.isAlphabetic(a[i]);
			boolean answer2=Character.isDigit(a[i]);
			//System.out.println(answer);
			if (answer==true || answer1==true || answer2==true)
			{
					count++;				
			}			
		}		
		System.out.println("Number of Special  : "  +(count1-count));
	}

}
