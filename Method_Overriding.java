package javapackage;

class two{
	void add() {
		System.out.println("Parent calss");
	}
}

final class one extends two{
	void add() {
		super.add();
		System.out.println("Child calss");
	}
}

class three extends one{
	void add() {
		System.out.println("3rd Child calss");
		//super.add();
	}
}

public class Method_Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one c1=new one();
		c1.add();
	}

}





