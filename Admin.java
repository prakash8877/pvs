package mini;
import java .util.Scanner;
import java.awt.List;
import java.util.ArrayList; 
public class Admin {

	public static void main(String[] args) {
		System.out.println("welcome to admin!");
		String username,password ;
		Scanner as = new Scanner(System.in);
		 System.out.println("Enter username: ");
			username = as.nextLine();

		 System.out.println("Enter the password:");	
		 password = as.nextLine();

		 
		  if(username.equals("muraai") && password.equals("user"))
				  {
			        System.out.println("Authentication sucessfull");
			        
				  }
		  else
		  {
			  System.out.println("Authentication fails");
		  }
		  
		  ArrayList a1 = new ArrayList();
		  System.out.println("enter the name");
		  String name = as.nextLine();
		  a1.add("name");
		  System.out.println("age");
		  int age = as.nextInt();
		  a1.add(age);
	      System.out.println("mobileNo");
           double mobileNo = as.nextDouble();
	      a1.add(mobileNo);
	      System.out.println("salary");
	      int salary = as.nextInt();
	      a1.add(salary);
	      System.out.println(a1);
	      System.out.println("update");
	      int vb = as.nextInt();
	      int ds = as.nextInt();
	    		  a1.set(vb,ds);
	        System.out.println(a1);
	        System.out.println("remove");
	        int de = as.nextInt();
	        a1.remove(de);
	         System.out.println(a1);
	         System.out.println(" admin logout");
	         String logout = as.next();
	         System.out.println("THANK YOU");
		  
		  
		  

		

	}
}

