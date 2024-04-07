package javapackage;

import java.util.Scanner;

public class Circum_Of_Circle {
	static final double  p=3.14; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
		double c;
		System.out.println("Enter the value of radius: ");
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		c=p*2*a; 
		System.out.println("Circumference  of Circle : "+c);
	}

}
