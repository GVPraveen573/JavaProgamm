package javapackage;

public class Array_Functions {

	public static void main(String[] args) {
		int rollno[]=new int [5];
		String StudentName[]=new String [5];
		char G[]=new char [5];
		String mobile[]=new String [5];
		rollno[0] = 1;
		rollno[1] = 2;
		rollno[2] = 3;
		rollno[3] = 4;
		rollno[4] = 5;
		StudentName[0]="Kushal";
		StudentName[1]="Kushal P";
		StudentName[2]="Vishal Prasad";
		StudentName[3]="Monica Rawat";
		StudentName[4]="Kushagra Verma";
		G[0]='M';
		G[1]='M';
		G[2]='M';
		G[3]='F';
		G[4]='M';
		mobile[0]="968574";
		mobile[1]="857412";
		mobile[2]="857421";
		mobile[3]="968521";
		mobile[4]="967452";
		
		System.out.print("Stundent Name\t");
		for (int i=0;i<5;i++)
		{
			System.out.print(StudentName[i]+" \t");
		}
		System.out.println("");
		System.out.print("Gender\t\t");
		for (int i=0;i<5;i++)
		{
			System.out.print(G[i]+"\t\t");
		}
		System.out.println("");
		System.out.print("Mobile Number\t");
		for (int i=0;i<5;i++)
		{
			System.out.print(mobile[i]+"\t\t");
		}
		System.out.println("");
		System.out.print("Roll No\t\t");
		for (int i=0;i<5;i++)
		{
			System.out.print(rollno[i]+"\t\t");
		}

	}

}
