package javapackage;

import java.util.Arrays;
import java.util.Scanner;

public class Array_String10 {

	public static void main(String[] args) {
		int a []=new int [5];
		System.out.println("Enter String");
		Scanner a1=new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			a[i]=a1.nextInt();			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Reverse String");
		for (int i=4;i>=0;i--)
		{
			System.out.print(a[i]+ ",");		
		}
	}

}
