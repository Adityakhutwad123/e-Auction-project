package Event_List_Page_Seller;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Create_Event extends Logins{

	@BeforeTest
	public void connect_Event() throws Exception {
		super.connection();
		super.Login3();
		 //Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
	}
	@Test
	public void Added_Event() throws Exception {
		//Click On Create Event Page
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main w-auto mat-raised-button mat-button-base mat-add ng-star-inserted']")).click();
		//Enter Event Title
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("Automation Event Test");
		//Click On  Event Type
		Thread.sleep(2000);
		d.findElement(By.id("mat-select-value-5")).click();
		//Select Event Type
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-8")).click();
		//Enter Event Fee
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-7")).sendKeys("1000");
		//Upload Document
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[@class='d-flex justify-content-start']")).click();
		//Enter Description
		Thread.sleep(5000);
		d.findElement(By.id("mat-input-8")).sendKeys("Event For Automation Test");
		//Select Eligible Document 
		//Select Aadhar
		Thread.sleep(1000);
		d.findElement(By.id("mat-checkbox-1")).click();
		///Select PAN
		Thread.sleep(1000);
		d.findElement(By.id("mat-checkbox-4")).click();
		//Click On Create Event Button 
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base']")).click();
		//Click On Confirmation Message
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-success-dialog/div/div/div/div/div/div[2]/div[3]/div/button")).click();

	}
}
