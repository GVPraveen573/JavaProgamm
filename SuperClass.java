package javapackage;

class Parent{
	parent(int a)
	{
		System.out.println("this is parent constructor");
	}
}



public class SuperClass extends Parent{
	SuperClass()
	{
		super(10);
			System.out.println("this is parent constructor");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass s1=new SuperClass();

	}

}
