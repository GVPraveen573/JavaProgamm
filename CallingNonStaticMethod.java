package javapackage;

public class CallingNonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingNonStaticMethod NS= new CallingNonStaticMethod();
		NS.Nonstatic1();NS.Nonstatic2();NS.Nonstatic2();
		static1();static2();static3();
	}
	void Nonstatic1() {
		System.out.println("This is a Non-Static Method-1");	
	}
	void Nonstatic2() {
		System.out.println("This is a Non-Static Method-2");	
	}
	void Nonstatic3() {
		System.out.println("This is a Non-Static Method-3");	
	}
	static void static1() {
		System.out.println("This is a Static Method-1");	
	}
	static void static2() {
		System.out.println("This is a Static Method-2");	
	}
	public static void static3() {
		System.out.println("This is a Static Method-3");	
	}
}
