package javapackage;


abstract class Google_Code{
	abstract void login();
	abstract void Registartion();
}

public class Abstract_Class extends Google_Code{
	public static void main(String[] args) {
		Abstract_Class e1=new Abstract_Class();
		//Google_Code e1=new Google_Code();
		e1.login();
		e1.Registartion();
	}

	void login() {
	System.out.println("Login Method");
	}
	void Registartion() {
		System.out.println("Registartion Method");	
	}

}
