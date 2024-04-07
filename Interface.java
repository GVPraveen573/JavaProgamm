package javapackage;

import java.util.Scanner;


interface student1 { 
	
	void reverse();
	

	int rev1= 0;
	Scanner S1= new Scanner (System.in);
	int n = S1.nextInt();
	while(n>0) {
		int rem = n%10;
		rev1 = rev1*10+rem;
		int n1 = n/10;
	}
	
		
		
	}

	

	
}
abstract class  student implements student1{
abstract void add();
int a= 23;
int b =40;
	

}
public class Interface extends student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface I1= new Interface();
		I1.reverse();
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
			System.out.println(rev1);
		}
	

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

}