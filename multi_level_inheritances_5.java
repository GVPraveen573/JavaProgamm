package javapackage;

public class multi_level_inheritances_5 extends Facebook_Class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi_level_inheritances_5 e1=new multi_level_inheritances_5();
		e1.multiple();
		e1.divide();
		e1.add();
		e1.subtract();
	}
	void multiple() {
		int a=10;
		int b=20;
		System.out.println(a*b);	
	}
	void divide() {
		int a=10;
		int b=3;
		System.out.println(a/b);
	}
	
}

abstract class Facebook_Class extends Google_Class{
	/*void add()
	{
		int a=10;
		int b=20;
	System.out.println(a+b);
	}
	static void subtract()
	{
		System.out.println(Math.subtractExact(10, 20));		
	}
	//abstract void multiple();
	//abstract void divide();	*/
}

abstract class Google_Class{
	void add()
	{
		int a=10;
		int b=20;
	System.out.println(a+b);
	}
	static void subtract()
	{
		
		System.out.println(Math.subtractExact(10, 20));		
	}
	abstract void multiple();
	abstract void divide();	
}

