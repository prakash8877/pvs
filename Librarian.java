package mini;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util .Date; 
public class Librarian {

	public static void main(String[] args) throws ParseException {
	
			System.out.println("welcome to library management System!");
			String username,password ;
			Scanner as = new Scanner(System.in);
			 System.out.println("Enter username: ");
				username = as.nextLine();

			 System.out.println("Enter the password:");	
			 password = as.nextLine();

			 
			  if(username.equals("prakash") && password.equals("pvs"))
					  {
				        System.out.println("Authentication sucessfull");
				        
					  }
			  else
			  {
				  System.out.println("Authentication fails");
				  return;
			  }
			  ArrayList a1 = new ArrayList();
			  System.out.println("enter the  bookname");
			    String bname = as.nextLine();
			    a1.add("bname");
			    a1.add("bname2");
			    a1.add("bname3");
			  ArrayList a2 = new ArrayList();
			  System.out.println("enter the authorname");
			      String Aname = as.nextLine();
			       a2.add("Aname");
			       a2.add("Aname1");
			        a2.add("Aname2");
			  ArrayList a3 = new ArrayList();
			  System.out.println("enter the bookid");
			   int bookid = as.nextInt();
			  int bookid2 = as.nextInt();
			  int bookid3 = as.nextInt();
			    a3.add(bookid);
			     a3.add(bookid2);
			   a3.add(bookid3);
			  ArrayList a4 = new ArrayList();
			  Scanner ss = new Scanner(System.in);
			  System.out.println("studentname");
			  String name = ss.nextLine();
			     a4.add("name");
			   a4.add("name");
			  ArrayList a5 = new ArrayList();
			 System.out.println("rollno");
			  int rollno = ss.nextInt();
			   a5.add(rollno);
			    a5.add(rollno);
			    System.out.println("updatebook");
			  Scanner cs = new Scanner(System.in);
		      int vb = cs.nextInt();
		      String ds = cs.next();
		    		  a1.set(vb,ds);
		        System.out.println(a1);
		        Scanner remove = new Scanner(System.in);
		        System.out.println("remove book");
		        int de = as.nextInt();
		        a1.remove(de);
		         System.out.println(a1);
			  System.out.println("login library");
			  
			  
			   String susername ,spassword;
			  System.out.println("enter the susername");
			  susername = as.next();
			  System.out.println("enter the spassword");
			  spassword = as.next();
			  
			  if(susername.equals("student") && spassword.equals("library"))
			  {
		        System.out.println(" student login sucessfully");
		        
			  }
	  else
	  {
		  System.out.println("Authentication fails");
		  return;
	  }
			  
			 System.out.println("issue details"); 
			System.out.println("enter the issuebookid");
		     int bid = as.nextInt();
			System.out.println("enter the srollno");
			int rno = as.nextInt();
			if((bid == 01 && rno == 106))
			   {
				   System.out.println("issuebook sucessfully");
			   }
	 else
			   {
				   System.out.println("issuefails");
				   return;
			   }
			    
			   System.out.println("issuebookid");
			   int bid1 =as.nextInt();
			   System.out.println("return bookid");
				  Scanner sc = new Scanner (System.in);
int rid = sc.nextInt();
          if(bid1== 01 && rid == 01) {
        	  System.out.println("return sucessfully");
          }
          else
          {
        	  System.out.println("retrun fails");
        	  
          }
          
        	  System.out.println("logout");	
		String logout = as.nextLine();
		System.out.println("THANKYOU");
	
	}

}		  
			  
	
		      
				

	


