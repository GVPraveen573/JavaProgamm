package javapackage;

import java.util.Scanner;

public class String_Functions {

	public static void main(String[] args) {
	/*	String name="Venkata Praveen";
		int s=name.length();
		System.out.println("lenght :" +s);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf('t'));
		System.out.println(name.equals("Venkata Praveen"));*/
		System.out.println("Enter string");
		Scanner s1=new Scanner(System.in);
		String name1=s1.nextLine();
		System.out.println("vertically");
		for (int i=0;i<name1.length();i++) {
			System.out.println(name1.charAt(i));
		}
		System.out.println("Enter string Again");		
		String name2=s1.nextLine();
		//String name2="Venkat";
		System.out.println("Vertically Reverse");
		for (int j=name2.length()-1;j>=0;j--){
			System.out.print(name2.charAt(j));
		}				

	}

}
