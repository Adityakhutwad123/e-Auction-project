package Event_Approval_Page_Approver;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Filter_Event extends Logins{
	@BeforeTest
	public void filter() throws Exception {
		//Verify Selected Date Related Event Display Or Not In  Table
		 super.connection();
		 super.Login2();
		//Click On Approval Event Page 
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		 //Click On  Approve Event  page
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
		 //Click On Date Dropdown
		 Thread.sleep(3000);
		 d.findElement(By.xpath("//button[@tabindex='0']")).click();
		 //Click On Start  Date 
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@aria-label='2 September 2022']")).click();
		 //Click On END Date
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//button[@aria-label='16 September 2022']")).click();
		 //Click On Apply Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
		//Verify Selected Status Related Event Display Or Not In Table 
		 //Click On Status Dropdown
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-select-value-1")).click();
		 //Select Status As Approve
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-option-1")).click();
		 //Click On Apply Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
		//Click On Status Dropdown
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-select-value-1")).click();
			 //Select Status As Pending
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-option-2")).click();
			 //Click On Apply Button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
	   //Click On Status Dropdown
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-select-value-1")).click();
			 //Select Status As Reject
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-option-3")).click();
			 //Click On Apply Button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
			 //Click On Status Dropdown
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-select-value-1")).click();
	 //Select Status As Alll
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-option-0")).click();
			 //Click On Apply Button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();		 
	//Verify Entered  Event Name Related Result Display Or Not In Field
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-input-5")).sendKeys("Automation Event Test");
	 //Click On Apply Button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();				 
	}
	@Test
	public void Sent_event() throws Exception {
//Verify Event Display Or Not On Event Approve Page when Event Sent By Seller For Approve
		 d.get("https://eauction.mahamining.com/#/login");
		//Login With Seller
		Thread.sleep(1000);
		super.Login3();
		//Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
		 //Click On Event ID
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
		 //Click On Send For Approval
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
		 //Click On Confirmation Message 
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
		//Login With Approver
		 Thread.sleep(1000);
		 d.get("https://eauction.mahamining.com/#/login");
		 super.Login2();
	   //Click On Approval Event Page 
			 Thread.sleep(1000);
			 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	  //Click On  Approve Event  page
			 Thread.sleep(1000);
			 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
			 
	}
	@Test
	public void Details() throws InterruptedException {
		//Verify Correct Event Details Display Or not on Event Details Page
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
	
	}

}

