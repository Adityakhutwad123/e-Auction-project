package Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bidder_Add extends Logins {
@BeforeTest
public void Before_Add() throws Exception {
	super.connection();
	super.Login();
	
}
@Test
public void Add_Bidder() throws Exception {
	//Verify Bidder Add Or Not In  Table After Added From Add Option
	//Click On Master
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	//Click On Bidder List
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[3]/a/span")).click();
	//Click On Add Bidder 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[1]/div[2]/button/span[1]")).click();
	//Enter Bidder Name 
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='mat-input-16']")).sendKeys("Rushi");
	//Enter Mobile No
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("9145393410");
	//Select District
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[3]/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	 Thread.sleep(2000);
	 d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[27]/span")).click();
	 //Enter Email Id
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("rushi@gmail.com");
	 //Enter Address
	 Thread.sleep(2000);
	 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[4]/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/textarea")).sendKeys("Bhor");
	 //Enter Pin code
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys("412213");
	 //Select Designation
	 Thread.sleep(2000);
	 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[5]/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	 Thread.sleep(2000);
	 d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[5]/span")).click();
	 //Enter PAN No
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//input[@id='mat-input-10']")).sendKeys("BFDAD1234l");
	 //Upload Document 
	 Thread.sleep(1000);
	 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[7]/div/table/tbody/tr[1]/td[3]/span/button/span[1]/label/span")).click();
	//Enter Aadhar No
	 Thread.sleep(5000);
	 d.findElement(By.xpath("//input[@id='mat-input-17']")).sendKeys("456789012345");
	 //Upload Document 
	 Thread.sleep(1000);
	 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[7]/div/table/tbody/tr[2]/td[3]/span/button")).click();
	 //Enter GST No
	 Thread.sleep(5000);
	 d.findElement(By.xpath("//input[@id='mat-input-11']")).sendKeys("28ABCFM8335M1ZT");
	 //Click On Upload Document
	 Thread.sleep(1000);
	 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[7]/div/table/tbody/tr[3]/td[3]/span/button/span[1]/label/span")).click();
	 //Click On Submit 
	 Thread.sleep(5000);
	 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[8]/div/div/button[2]/span[1]")).click();
	 //Click On Confirmation Message 
	 Thread.sleep(4000);
	 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-success-dialog/div/div/div/div/div/div[2]/div[3]/div/button")).click();
}

}
