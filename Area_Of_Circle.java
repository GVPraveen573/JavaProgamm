package javapackage;

import java.util.Scanner;

public class Area_Of_Circle {
	
	static final double  p=3.14; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double c;
		System.out.println("Enter the value of radius: ");
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		c=p*a*a; 
		System.out.println("Area of Circle : "+c);

	}

}
