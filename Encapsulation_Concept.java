package javapackage;

class login{
	private String email_id="praveen@gmail.com";
 

	public String getEmail_id()
	{
		return email_id;
	}

	public void setEmail_id(String email_id)
	{
		this.email_id=email_id;
	}

}

public class Encapsulation_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login n1=new login();
		n1.setEmail_id("praveen.gv@gmail.com");
		System.out.println(n1.getEmail_id());
		

	}

}
