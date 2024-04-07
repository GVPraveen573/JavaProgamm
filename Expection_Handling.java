package javapackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Expection_Handling {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int a=c.nextInt();
		try {
		int d=5/a;
		System.out.print(d);
	}
				catch (ArithmeticException d )
		{
					System.out.println("Arithmetic Exception");
		}
				catch (NullPointerException d1 )
		{
					System.out.println("Null point");
		}
				catch (InputMismatchException d2 )
		{
					System.out.println("input");
		}
/*		catch (ArrayIndexOutOfBounce d )
		{
					System.out.println("Arithmetic Exception");
		}*/

	}

}
