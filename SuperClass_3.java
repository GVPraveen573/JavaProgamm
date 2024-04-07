package javapackage;



public class SuperClass_3 {
	String name;
	int age;
	double Salary;
	void student_details(String name,int age,double salary) {
		System.out.println("Iam " +name + " and my age is "+age + " and my salary is " +salary);
		this.name=name;
		this.age=age;
		this.Salary=age;
	}

/*	public SuperClass_3() {
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		SuperClass_3 S1=new SuperClass_3();
		S1.student_details ("Praveen",21,5000);
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.Salary);

	}

}
