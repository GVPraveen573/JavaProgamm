package javapackage;

import java.util.Scanner;

public class Trim_Sample {

	public static void main(String[] args) {
		System.out.println("Enter a name");
		Scanner s=new Scanner(System.in); 		
		String name1=s.next();
		String name2="";
		for(int i=name1.length()-1;i>=0;i--) {
			char c=name1.charAt(i);
			name2=name2+(name1.charAt(i));
			//System.out.println(c);
		}
		System.out.println(name2);
		System.out.println(name1);
		
		if (name1.equals(name2)) {
			System.out.println("palindrom1");	
		}
			else { 
			System.out.println("not palindrom");
			}

	}

	
}
