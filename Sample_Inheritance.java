package javapackage;

class ParentClass
{
	static void Parent() {
		System.out.println("Iam parent method");
	}
	
}

public class Sample_Inheritance extends ParentClass { 

	public static void main(String[] args) {
				
		Child();
		Parent();

	}
	static void Child() {
		System.out.println("Iam child class");
	}

}
