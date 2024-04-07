package javapackage;

class GP_Class{
	GP_Class(){
		System.out.println("3");
	}
	
}

class Parent1_Class extends GP_Class{
	Parent1_Class(int a,double b){
		System.out.println("2");
	}
	
}

class Child_Class extends Parent1_Class{
	Child_Class(){
		super(10,9.87);
		System.out.println("1");
	}
	
}


public class SuperClass2 {

	/*public SuperClass2() {
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_Class C1=new Child_Class();

	}

}
