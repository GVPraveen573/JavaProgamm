package javapackage;

import java.util.Scanner;

public class Palindrom_Sample {
	public static void main(String[] args) {
		System.out.println("Enter a string");
	Scanner s1=new Scanner(System.in);
	String name1=s1.nextLine();
	String name2="";
	for(int i=name1.length()-1;i>=0;i--) {
		char c=name1.charAt(i);
		name2=name2+(name1.charAt(i));
		//System.out.println(name2);
	}
	System.out.println(name2);
	if (name1.equals(name2))
	{
		System.out.println("Given string '" +name1+ " is Palindrom");
	}	else {
			System.out.println("Given string '" +name1+ "' is not Palindrom");
	}
	

}

}
