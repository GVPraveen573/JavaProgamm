package javapackage;

public class Interface_3 extends Abstract_class_1{

	public static void main(String[] args) {
		Interface_3 i3=new Interface_3();
		i3.abstract_method1();
		i3.abstract_method2();
		i3.Interface_method1();
		i3.Interface_method2();
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

abstract class Abstract_class_1 implements Interface_class_1{
	
	abstract void abstract_method1();
	abstract void abstract_method2();

}

interface Interface_class_1{
	
	void Interface_method1();
	void Interface_method2();
	
}