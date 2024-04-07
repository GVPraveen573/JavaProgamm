package javapackage;

import java.util.Scanner;

public class SampleForScanner {

	public SampleForScanner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int f1=s1.nextInt();
		System.out.print("Enter the 2nd number: ");
		int f2=s1.nextInt();
		int f3=f1+f2;
		System.out.println("Sum of Two numbers " +f3);

	}

}
