package javapackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_Exception {

	public static void main(String[] args) {
		int a []=new int [5];
		int b =2;
		int c;
		Scanner a1=new Scanner(System.in);
		try {
			for (int i=0;i<3;i++){
			a[i]=a1.nextInt();			
		}
			c=2/a[4];
			System.out.println(a[4]);
		//	System.out.println(a[6]);
		}
		catch (ArrayIndexOutOfBoundsException z )
		{
					System.out.println("Array Index Out Of Bounds Exception");
		}
		catch (InputMismatchException z )
		{
					System.out.println("Invalid Datatype");
		}
		catch (ArithmeticException z )
		{
					System.out.println("Arithmetic Exception");
		}
		
/*		try {
		int d=a[2]/0;
		System.out.println(d);
		}
		catch (InputMismatchException z )
		{
					System.out.println("Invalid Datatype");
		}
	
		
		
		for (int j=0;j<5;j++)
		{
			System.out.print(a[j]);
		}
	*/

	}

}
