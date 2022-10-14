package Practice;

import java.util.Scanner;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.testng.annotations.Test;

public class Scanerclass {
	 String UserName1="Aditya";
	 String Passward1="Adity@123";
@Test
public void Employee_Login() {
	
	Scanner c=new Scanner(System.in);
	System.out.println("Enter Your Name");
	String Name=c.next();
	System.out.println("My Name is" +" "+Name);
	System.out.println("Enter Your Designation");
	String Designation=c.next();
	System.out.println("My designation is" +" "+Designation);
	System.out.println("Enter Your EMP ID" );
	int EMPID=c.nextInt();
	System.out.println("My EMpId is" +" "+EMPID);
    System.out.println("Enter Your Monthly Sallary");
    float Sallary=c.nextFloat();
    float CTC=Sallary*12;
   System.out.println("Your Yearly CTC Is"  +" " +CTC );
   String Fresher="fresher";
   String Experianced="Experianced";
   System.out.println("Enter Your Emp Type");
   String Type=c.next();
   if(Type.equals(Fresher) ) {
	   System.out.println("WelCome");
	    System.out.println("Set Your Password");
	    String Password=c.next();
   }
   else {
	   System.out.println("Oh! Are You Experianced person");
	   System.out.println("Sign Up");
	   System.out.println("Enter Your User Name");
	   String UserName=c.next();
	   System.out.println("Enter Your User Name");
	   String Password=c.next();
	   if(UserName.equals(UserName1)&& Password.equals(Passward1)) {
		   System.out.println("Welcome");
	   }
	   else {
		   System.out.println("Eneter Your Correct Credentials");
	   }	     
   }
}
}
