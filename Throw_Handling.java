package javapackage;

public class Throw_Handling {

	public static void main(String[] args) throws NullPointerException, InterruptedException {
		//throw new NullPointerException();
		
		Thread.sleep(2000);
		throw new NullPointerException("No data Yet");
		
		


	}

}
