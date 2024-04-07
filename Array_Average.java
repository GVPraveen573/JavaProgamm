package javapackage;

public class Array_Average {

	public static void main(String[] args) {
	int N1 []=new int[5];
	N1[0]=15;
	N1[1]=20;
	N1[2]=30;
	N1[3]=6;
	N1[4]=27;
	int SUM=0;
	int a =6;
	int count=0;
	for (int i=0;i<5;i++) {
		SUM=SUM+N1[i];
		if(N1[i]==6)
		{
			count++;
		}
	}
		System.out.println(SUM);		
	double Avg=SUM/(N1.length);
	System.out.println("Average :" +Avg);
	if(count>0) {
		System.out.println("6 is exist");
	}
	else {
		System.out.println("6 doesn't exist");
	}
	}
	}


