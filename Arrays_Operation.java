package javapackage;

public class Arrays_Operation {

	public static void main(String[] args) {
		int a []=new int [4];
		a[0]=23 ;
		a[1]=9;
		a[2]=20;
		a[3]=15;
		for (int i=0;i<4;i++)
		{
		if (a[i]%3==0 && a[i]%5==0)
		{
			System.out.println("Frog & Cat");
		}
		else if (a[i]%3==0)
		{
			System.out.println("Frog ");
		}
		else if (a[i]%5==0)
		{
			System.out.println("Cat");
		}
		else 
		{
			System.out.println("Given number wont divisible by both 3 & 5");
		}
		}
	}

}
