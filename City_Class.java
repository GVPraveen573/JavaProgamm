package javapackage;

class State_class {
	static void multiple() {
		System.out.println("Static method : Multiple");
	}
	void Divison()	{
		System.out.println("Non-Static method : Division");
	}
	
}

public class City_Class extends State_class {
	static void Add() {
		System.out.println("Static method : Child class");
	}
	void Sub(){
		System.out.println("Non-Static method :  child class");
	}
	public static void main(String[] args) {		
		Add();
		multiple();
		City_Class c1=new City_Class();
		c1.Divison();
		c1.Sub();
	}

}
