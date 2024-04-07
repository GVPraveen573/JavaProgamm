package javapackage;

public class multi_level_inheritances_1 extends Grand_Parent {

	public static void main(String[] args)  {
		//multi_level_inheritances_5 e1=new multi_level_inheritances_5();
		//Grand_Parent GP=new Parent();
		//GP.Grand_parent_method1();
		Grand_Parent GP1=new multi_level_inheritances_1();
		GP1.Grand_parent_method1();
		
	}

	void Grand_parent_method1() {
		System.out.println("Grand parent1 method in Main class");
				
	}

}

/*abstract class Parent extends Grand_Parent {
	abstract void parent_method1();
	abstract void parent_method2();	
	
//	Parent p1=new Parent();
//	void Grand_parent_method1() {
//		System.out.println("Grand parent1 method in Parent class")
		
	}*/
	


abstract class Grand_Parent{
	abstract void Grand_parent_method1();
	abstract void Garnd_parent_method2();	
}




