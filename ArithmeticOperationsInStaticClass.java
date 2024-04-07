package javapackage;

public class ArithmeticOperationsInStaticClass {

	public static void main(String[] args) {
		System.out.println("Main Method");
		additional();
		subtraction();
		multiplication();
		divison();	
	}
	private static void divison() {
		int a=10;
		int b=5;
		int div=a/b;
		System.out.print("Divison : ");
		System.out.println(div);
		}
	private static void subtraction() {
		byte a=10;
		short b=30000;	;
		int sub=a-b;
		System.out.println("Subtraction :" +sub);
	}
	static void additional() {
		byte a=100;
		short b=32767	;
		int add=a+b;
		System.out.println("Addition : " +add);
	}
	public static void multiplication() {
		byte a=10;
		float b=5.2f;
		float mul=a*b;
		System.out.println("Multiplication : " +mul);
	}
}
