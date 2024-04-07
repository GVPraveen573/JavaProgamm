package javapackage;  

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		int [] s1=new int [5];		
		System.out.println("Enter number");
		//Scanner s2=new Scanner(System.in); //Single instance creation for scanner class
		for (int i=0;i<5;i++) {
			Scanner s2=new Scanner(System.in); //multiple instance creation for scanner class
			s1[i]=s2.nextInt();
		}
		for (int j=0;j<5;j++) {
			System.out.print(s1[j]+"," );
		}
	}
}
