package javapackage;

public class Interfaces_1 implements Google_Auth {

	public static void main(String[] args) {
		Interfaces_1 I1=new Interfaces_1();
		I1.login();
		I1.registartion();
		I1.test_Method();
	

	}
	
	static void test_Method() {
		System.out.println("test Method-1");
	}

	public void login() {
		System.out.println("Interfaace Method-1");
		
	}
	public void registartion() {
		System.out.println("Interfaace Method-2");
		
	}


}

interface Google_Auth{
	void login();
	void registartion();
}
