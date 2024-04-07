package javapackage;
import java.util.Scanner;

public class Scanner_Assign_2 {
	int a ; int b;
	void add(int d,int e){
		int c=d+e;
		System.out.println("Sum : " +c);
	}
	void sub(int d,int e) {
		int c=d-e;
		System.out.println("sub : " +c);
	}
	void mul(int d,int e)
	{
		int c=d*e;
		System.out.println("mul : " +c);
	}
	void div(int d,int e) {
		int c=d/e;
		System.out.println("div : " +c);
	}
	void mod(int d,int e) {
		int c=d%e;
		System.out.println("mod : " +c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of 1st number : ");
		int a=s1.nextInt();	
		System.out.println("Enter value of 2nd number : ");
		int b=s1.nextInt();
		Scanner_Assign_2 c=new Scanner_Assign_2();
		c.add(a,b);
		c.sub(a,b);
		c.mul(a,b);
		c.div(a,b);
		c.mod(a,b);
		s1.close();
	}
}
