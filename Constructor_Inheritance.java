package javapackage;

class Mentor
{
	Mentor()
	{
		System.out.println("Parent class : Mentor");
	}
}

public class Constructor_Inheritance extends Mentor{

	Constructor_Inheritance()
	{   super();	
		System.out.println("Child class : Method");
	}
	Constructor_Inheritance(int a)
	{   super();	
		System.out.println("Child class 1 : Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Inheritance c1=new Constructor_Inheritance();
		

	}

}
