package document_Master_Page;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;
import Event_List_Page_Seller.Create_Event;

public class Delete_Document extends Logins{
	@BeforeTest
public void delete() throws Exception {
//Verify Deleted Document Remove Or Not From Table
	super.connection();
	 super.Login2();
	//Click On Seller
		//Thread.sleep(3000);
		//d.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a/span[2]")).click();
		 //Click On Document Master
		// Thread.sleep(1000);
	   //  d.findElement(By.xpath("//*[@id=\"submenu2\"]/li[3]/a/span")).click();
		 //Click On Delete button
		// Thread.sleep(1000);
		// d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-documents-master/div/table/tbody/tr[4]/td[4]/div/button[2]/span[1]/mat-icon")).click();
	    //Click On Confirmation Message
		//  Thread.sleep(2000);
		//  d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
}
	@Test
	public void Seller_Login() throws Exception {
/*//Verify Deleted Document Remove Or Not From Seller Login After Delete Document
		Thread.sleep(1000);
		 d.get("https://eauction.mahamining.com/#/login");
		 super.Login3();
		  //Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
	  //Click On Create Event Page
	      Thread.sleep(1000);
		  d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main w-auto mat-raised-button mat-button-base mat-add ng-star-inserted']")).click();
//Verify Deleted Document Remove Or Not in event Which Is Already Created but not send for Approval
			 Thread.sleep(1000);
			 //Click On Cross button
			 Thread.sleep(2000);
			  d.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-auction-screen/div/div/div/div/div[1]/div/div[2]/button/span[1]/i")).click();
			  //Click On Edit button
			   Thread.sleep(1000);
			   d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[10]/div/button[2]/span[1]/mat-icon")).click();
//Verify Document Delete Or Not From Seller Login After Used In Event*/
			   //Login with seller
			   d.get("https://eauction.mahamining.com/#/login");
			   super.Login3();
				 //Click On Event List
				 Thread.sleep(3000);
				 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
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
			   //Login with Approver
			   d.get("https://eauction.mahamining.com/#/login");
			   super.Login2();
			 //Click On Seller
				Thread.sleep(3000);
				 d.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a/span[2]")).click();
				 //Click On Document Master
				 Thread.sleep(1000);
				 d.findElement(By.xpath("//*[@id=\"submenu2\"]/li[3]/a/span")).click();
				 //Click On Delete button
				 Thread.sleep(1000);
				 d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-documents-master/div/table/tbody/tr[4]/td[4]/div/button[2]/span[1]/mat-icon")).click();
	}
}
