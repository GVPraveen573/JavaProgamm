package javapackage;

public class String_function_1 {

	public static void main(String[] args) {
		String s1="praveenp";
		String s2="Naveen";
		//System.out.println(s1.replace('v', 'i'));	
		System.out.println(s1.replaceAll("[A-Z]", "Hello"));
		//System.out.println(s1.replaceAll("[A-Z]"," "));
		//System.out.println(s1.replaceAll("[a-z]"," "));
		//System.out.println(s1.isEmpty());
		//System.out.println(s1.lastIndexOf('p'));
		System.out.println(s1.contains(s2));
		System.out.println(s1.equalsIgnoreCase("praveenP"));
	}

}
