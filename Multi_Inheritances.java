package javapackage;

class Grand_Parent_Class{
	static void GP_username(){
		System.out.println("Super Parent class 1");
	}
}
class Grand_Parent_Class_1 extends Grand_Parent_Class {
	static void GP_username1(){
		System.out.println("Super Parent class 2");
	}
}
class Parent_Class extends Grand_Parent_Class_1{
	static void login_using_UN1(){
		System.out.println("Parent class 3");
	}
}
class Parent_Class_1 extends Parent_Class{
	static void login_using_UN2(){
		System.out.println("Parent class 4");
	}
}
public class Multi_Inheritances extends Parent_Class_1{	
	static void Adding_Product_To_Cart()
	{
		System.out.println("Main class");	
	}
	public static void main(String[] args) {
		System.out.println("Multi Level Inheritances");
		Adding_Product_To_Cart();
		GP_username();
		GP_username1();
		login_using_UN1();
		login_using_UN2();
	}

}
