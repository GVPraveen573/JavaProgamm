package javapackage;

import java.util.Date;

public class Epouch_Sample {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime()); //Machine time
		Date d2=new Date(d1.getTime()); // Human time
		System.out.println(d2);
		String currenttime=d2.toString();
		Date d3=new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d3);	
		String month =currenttime.substring(4,8);
		System.out.println(month); // get only month
		String date=currenttime.substring(8,10);
		System.out.println(currenttime.substring(8,10)); //get only date
		//System.out.println(currenttime.substring(8));
		String year=currenttime.substring((currenttime.length()-4));
		System.out.println(currenttime.substring((currenttime.length()-4))); //get only year
		System.out.println(date.concat(year));
	
	}

}








