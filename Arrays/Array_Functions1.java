package javapackage;

public class Array_Functions1 {

	public static void main(String[] args) {
		int rollno[]=new int [5];
		String StudentName[]=new String [5];
		char G[]=new char [5];
		String mobile[]=new String [5];
		rollno[0] = 1;	rollno[1] = 2;	rollno[2] = 3;	rollno[3] = 4;	rollno[4] = 5;
		StudentName[0]="Kushal";
		StudentName[1]="Kushal P";	
		StudentName[2]="Vishal Prasad";		
		StudentName[3]="Monica Rawat";
		StudentName[4]="Kushagra Verma";
		G[0]='M';	G[1]='M';	G[2]='M';	G[3]='F';	G[4]='M';
		mobile[0]="968574";		mobile[1]="857412";		mobile[2]=	"857421";	mobile[3]="968521";		mobile[4]="967452";
		
		System.out.println("Student name\t"+StudentName[0]+"\t\t"+StudentName[1]+"\t"+StudentName[2]+"\t"+StudentName[3]+"\t"+StudentName[4]);
		System.out.println("Gender\t\t" +G[0]+"\t\t" +G[1]+"\t\t" +G[2]+"\t\t" +G[3]+"\t\t" +G[4]);
		System.out.println("Mobile Number\t"+mobile[0]+"\t\t"+mobile[1]+"\t\t"+mobile[2]+"\t\t"+mobile[3]+"\t\t"+mobile[4]);
		System.out.println("Roll No \t"+rollno[0]+"\t\t" +rollno[1]+"\t\t"+rollno[2]+"\t\t"+rollno[3]+"\t\t"+rollno[4]);
		
	}

}
