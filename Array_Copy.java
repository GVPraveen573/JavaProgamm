package javapackage;

import java.util.Arrays;
public class Array_Copy {

	public static void main(String[] args) {
		int N1[]=new int[5];
		int N2[]=new int[5];
		N1[0]=15;
		N1[1]=20;
		N1[2]=30;
		N1[3]=6;
		N1[4]=27;
		System.out.println("Second Array");
		for (int i=0;i<5;i++) {
			N2[i]=N1[i];
			//System.out.print(N2[i]+ ",");
		}		
		System.out.println("Primary Array : " +Arrays.toString(N1));
		System.out.println("Copied Array : " +Arrays.toString(N2));
		System.out.println( "Array Reverse:");
		for (int i=(N1.length)-1;i>=0;i--) {
			System.out.print(N2[i]+ ",");
		}
	}
	

}
