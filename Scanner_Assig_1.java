package javapackage;
import java.util.Scanner;
public class Scanner_Assig_1 {
	void add(){
		System.out.println("Enter 2 numbers f9or Addition");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt(); int b=s1.nextInt();int c=a+b;
		System.out.println("add : " +c);
	}
	void sub() {
		System.out.println("Enter 2 numbers for Subtraction");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();	int b=s1.nextInt();int c=a-b;
		System.out.println("sub : " +c);
	}
	void mul()
	{
		System.out.println("Enter 2 numbers for Multiplication");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();	int b=s1.nextInt();int c=a*b;
		System.out.println("mul : " +c);
	}
	void div() {
		System.out.println("Enter 2 numbers for Division");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();int b=s1.nextInt();int c=a/b;
		System.out.println("div : " +c);
	}
	void mod() {
		System.out.println("Enter 2 numbers for mod");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();	int b=s1.nextInt();int c=a%b;
		System.out.println("mod : " +c);
	}
	public static void main(String[] args) {
		Scanner_Assig_1 c=new Scanner_Assig_1();
		Scanner s1=new Scanner(System.in);
		c.add();c.sub();c.mul();c.div();c.mod();
		s1.close();

	}

}
