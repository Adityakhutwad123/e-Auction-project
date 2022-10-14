package UserRegister_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Add_User extends Logins{
	@BeforeTest
	public void connect() throws Exception {
		super.connection();
		super.Login();
		 //Click On Master
	     Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	     //Click On User Register
	    Thread.sleep(1000);
	     d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
	}
	
@Test(priority=4)
public void Add_User() throws Exception {
//Verify Added User Display Or not In Table
			//Click On Add User  Button
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[1]/div[2]/button/span[1]")).click();
			//Select Project 
			Thread.sleep(1000);
			d.findElement(By.xpath("//mat-select[@id='mat-select-16']")).click();
			//click On  project
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[1]/span")).click();
			//Click on User Type
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			//Select User Type 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[3]/span")).click();
			//Click On  SubUser Type Dropdown
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			//select User Type
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[5]/span")).click();
			//Click On  Role Type Drop Down 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			//Select Role Type 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[3]/span")).click();
			//Click On Division
			Thread.sleep(1000);
			d.findElement(By.id("mat-select-value-29")).click();
			//Select Division
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[7]/span")).click();
			//Click On District dropdown
			Thread.sleep(1000);
			d.findElement(By.xpath("//div[@id='mat-select-value-31']")).click();
			//Select District
			Thread.sleep(1000);
			d.findElement(By.xpath("//mat-option[@id='mat-option-885']")).click();
			//Select Taluka
			Thread.sleep(1000);
			d.findElement(By.xpath("//mat-select[@id='mat-select-32']")).click();
			Thread.sleep(1000);
			d.findElement(By.xpath("//mat-option[@id='mat-option-892']")).click();
			//Enter Name 
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("Navin");
			//Enter Mobile No
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("8600631070");
			//Enter User Name
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@id='mat-input-8']")).sendKeys("Navin");
			//Select Designation
			Thread.sleep(1000);
			d.findElement(By.xpath("//mat-select[@id='mat-select-26']")).click();
			Thread.sleep(1000);
			d.findElement(By.xpath("//mat-option[@id='mat-option-820']")).click();
			//Enter Address
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@id='mat-input-10']")).sendKeys("Solapur");
			//Click On Submit
			Thread.sleep(1000);
			d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base']")).click();
			//Click On Confirmation Message 
			Thread.sleep(3000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-success-dialog/div/div/div/div/div/div[2]/div[3]/div/button/span[1]")).click();
}
}

