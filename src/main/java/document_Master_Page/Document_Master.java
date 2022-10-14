package document_Master_Page;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Document_Master extends Logins {
@Test(priority=1)
public void Add_document() throws Exception {
//Verify Added Document Display Or Not In  Table
	Thread.sleep(1000);
	super.connection();
	super.Login2();
	//Click On Seller
	Thread.sleep(3000);
	 d.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a/span[2]")).click();
	 //Click On Document Master
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//*[@id=\"submenu2\"]/li[3]/a/span")).click();
	 //Enter Document Name 
	 Thread.sleep(1000);
	 d.findElement(By.id("mat-input-4")).sendKeys("LC");
	 //Click On Submit Button
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base']")).click();
//Verify Duplicate Document Name Add Or Not In Table
	 //Enter Document Name 
	 Thread.sleep(1000);
	 d.findElement(By.id("mat-input-4")).sendKeys("LC");
	 //Click On Submit Button
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base']")).click();
//Verify Added Document Display Or Not in event Creation Page
	 Thread.sleep(1000);
	 //Login With Seller
	 Thread.sleep(1000);
	 d.get("https://eauction.mahamining.com/#/login");
      super.Login3();
      //Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
	  //Click On Create Event Page
	      Thread.sleep(1000);
		  d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main w-auto mat-raised-button mat-button-base mat-add ng-star-inserted']")).click();
//Verify Added Document Display Or Not in event Which Is Already Created but not send for Approval
			 Thread.sleep(1000);
			 //Click On Cross button
			 Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-auction-screen/div/div/div/div/div[1]/div/div[2]/button/span[1]/i")).click();
			  //Click On Edit button
			      Thread.sleep(1000);
				  d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[10]/div/button[2]/span[1]/mat-icon")).click();
}
@Test(priority=2)
public void Update() throws Exception {
//Verify Updated Document Display Or Not With Update in table 
	 d.get("https://eauction.mahamining.com/#/login");
     super.Login2();
   //Click On Seller
 	Thread.sleep(3000);
 	 d.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a/span[2]")).click();
 	 //Click On Document Master
 	 Thread.sleep(1000);
 	 d.findElement(By.xpath("//*[@id=\"submenu2\"]/li[3]/a/span")).click();
 	 //Click On Edit
	Thread.sleep(2000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-documents-master/div/table/tbody/tr[1]/td[4]/div/button[1]/span[1]/mat-icon")).click();
	//Update Document Name 
	Thread.sleep(1000);
	 d.findElement(By.xpath("//input[@placeholder='Document Name']")).clear();
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//input[@data-placeholder='Document Name']")).sendKeys("Testing Document");
	// Click On Update button
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base']")).click();
//Verify Updated Document Display Or Not In with Update in Seller Login Create Event page
	 Thread.sleep(1000);
	 d.get("https://eauction.mahamining.com/#/login");
      super.Login3();
      //Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
	  //Click On Create Event Page
	      Thread.sleep(1000);
		  d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main w-auto mat-raised-button mat-button-base mat-add ng-star-inserted']")).click();
//Verify Added Document Display Or Not in event Which Is Already Created but not send for Approval
			 Thread.sleep(1000);
			 //Login With Seller
			 Thread.sleep(2000);
			 //Click On Cancel button
			   d.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-auction-screen/div/div/div/div/div[1]/div/div[2]/button/span[1]/i")).click();
			  //Click On Edit button
			      Thread.sleep(1000);
				  d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[10]/div/button[2]/span[1]/mat-icon")).click();
}
}
