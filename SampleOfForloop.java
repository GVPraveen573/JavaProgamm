package javapackage;

import java.util.Scanner;

public class SampleOfForloop {
	static double pi=3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Multiples of 5 between 0 to 100");
		Scanner s1=new Scanner(System.in);
		for (int i=1;i<=100;i++)
		{
			if (i%5==0)
				System.out.println(i);
		}
		s1.close();

	}

}
