package javapackage;

class Grand_Parent_Class
{
	static void Father()
	{
		System.out.println("Parent1 class");
	}
	
}
class Parent_Class
{
	static void Mother()
	{
		System.out.println("Parent2 class");
	}
	
}


public class Multiple_level_Inheritance extends Grand_Parent_Class,Parent_Class  {
	static void Child()
	{
		System.out.println("Main class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
