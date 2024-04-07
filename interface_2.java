package javapackage;

public class interface_2 extends Abstract_class{

	public static void main(String[] args) {
		
		interface_2 i2=new interface_2();
		i2.abstract_method1();
		i2.abstract_method2();
		i2.Interface_method1();
		i2.Interface_method2();

	}

	public void Interface_method1() {
		System.out.println("Interfaace Method-1");
	}

	public void Interface_method2() {
		System.out.println("Interfaace Method-2");
	}

	void abstract_method1() {
		System.out.println("Abstract Method-1");
	}

	void abstract_method2() {
		System.out.println("Abstract Method-2");
	}

}

abstract class Abstract_class implements Interface_class{
	
	abstract void abstract_method1();
	abstract void abstract_method2();

}

interface Interface_class{
	
	void Interface_method1();
	void Interface_method2();
	
}
