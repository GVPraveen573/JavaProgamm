package javapackage;

import java.util.Arrays;

//import javax.xml.stream.events.*;

public class Array_String9 {

	public static void main(String[] args) {
		String name1="12987678689";
		int count=0;
		char a1[]=name1.toCharArray();
		System.out.println(Arrays.toString(a1));
		for (int i=0;i<name1.length();i++) {
			boolean answer=Character.isDigit(a1[i]);
			if(answer == true)
			{
				count++;
			}
		}
		if (count == name1.length())
		
			System.out.print("String contains only Digits");
		else
			System.out.print("String contains Digits & others things as well");
		

	}

}
