package UserRegister_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Delete extends Add_User{
  @BeforeTest
  public void deleteUser() throws Exception {
//Verify Deleted User  Remove Or Not From Table 
	  super.connection();
	  super.Login();
	  //Click On Master
		Thread.sleep(2000);
        d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On User Register
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
		//Click On Delete Button
		Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/button[2]/span[1]")).click();
		//Click On Confirmation Message
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
		super.Add_User();
  }
  @Test(priority=1)
  public void Registration() throws Exception {
	//Verify User Is Able Or Not For Registration With Same Mobile No After Delete the User
	  Thread.sleep(1000);
       //Click On Delete
       Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/button[2]/span[1]/mat-icon")).click();
       //click On Confirmation Message
       Thread.sleep(1000);
       d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']"));
       Thread.sleep(1000);
       //Register Again
       Thread.sleep(1000);
       super.Add_User();
  }
  @Test(priority=2)
 public void Loginn() throws Exception {
//Verify User is able Or Not For Login After delete User
	  //Fetch URL
	  d.get("https://eauction.mahamining.com/#/login");
	  //Enter User Name
	  Thread.sleep(1000);
	  d.findElement(By.id("mat-input-1")).sendKeys("Navin");
	  //Click On Generate Password
	  Thread.sleep(1000);
	  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[2]/button[2]")).click();
	  //Enter Mobile No
	  Thread.sleep(1000);
	  d.findElement(By.id("mat-input-15")).click();
	  //Click On send SMS Button
	  Thread.sleep(1000);
	  d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-main align-items-center mt-2 mat-stroked-button mat-button-base']")).click();
	  //Click On  
	  
}
}
