package javapackage;

public class Abstraact_multi_inheritances extends Parent1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraact_multi_inheritances s1=new Abstraact_multi_inheritances();
		s1.Parent();
		s1.Grand_Parent();
		s1.Parent2();
		s1.Grand_Parent2();
		s1.test1();
		s1.test();
	}
	void Parent() {
		System.out.println("Parent-1 :Main class");
	}

	void Grand_Parent() {
		System.out.println("Grand parent-1 : Main class");
	}
	void Parent2() {
		System.out.println("Parent method -2 :Main class");
	}

	void Grand_Parent2() {
		System.out.println("Grand parent method :  Main class");
	}

}
abstract class Parent1 extends Grand_Parent100{
	abstract void Parent();
	abstract void Parent2();
	void test1() {
		System.out.println("Parent Class");
	}
}
	
abstract class Grand_Parent100{
	abstract void Grand_Parent();
	abstract void Grand_Parent2();
	void test() {
		System.out.println("Grand parent Class");
	}
}

