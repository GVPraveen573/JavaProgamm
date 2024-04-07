package javapackage;
import java.util.Scanner;

public class Switch_Class {
	public static void main(String[] args) {
		System.out.println("   <12 : 1  \n 13-19 : 2 \n 20-60 : 3 \n   >60 : 4 \nChoose your age:"   );
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();		
		switch(a) {
			case 1:
				System.out.println("You are Child");
				break;
			case 2:
				System.out.println("You are Teenager");
				break;
			case 3:
				System.out.println("You are Adult");
				break;
			case 4:
				System.out.println("You are Senior Citizen");
				break;
			default:
				System.out.println("Wrong input");
				break;
		}			
		System.out.println("Avaiable broswers : \nEdge  \nChrome  \nFirefox \nChoose broswer you want to open : ");
		String b=s1.next();
		switch(b) {
		case "Edge":
			System.out.println("Opening Edge broswer");
			break;
		case "Chrome":
			System.out.println("Opening Chrome broswer");
			break;
		case "Firefox":
			System.out.println("Opening Firefox broswer");
			break;
		default:
			System.out.println("broswer not-defined");
			break;
	}	
	}

}
