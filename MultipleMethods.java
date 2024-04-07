package javapackage;

public class MultipleMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleMethods a1=new MultipleMethods();
		a1.Nonstatic();
		sample();

	}
	void Nonstatic() {
		System.out.println("This is a Non-Static Method");	
	}
	
	static void sample() {
		System.out.println("This is a Static Method");	
	}
	
	MultipleMethods() {
		System.out.println("This is a Constructor Method");		
	}

}
