package Event_Details_Bidder_Login;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Event_Details extends Logins {
@Test(priority=0)
public void ViewDetails() throws Exception {
//Verify Correct Event Details Display Or  Not On Event Details Page
	Thread.sleep(1000);
	super.connection();
	super.Login9();
	//Click On Event Details Page
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/span[2]")).click();
	//Click On View Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[1]/td[8]/button")).click();
	//Click On Cross Button
	Thread.sleep(3000);
	d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-details/div/div/div/div/div[1]/div/div[2]/button/span[1]/i")).click();
//Verify Uploaded Document Display Or Not To The Approver
	//Click On Upload document Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[5]/td[9]/button/span[1]/span")).click();
	//Click On Upload Button
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-eauction-event/div/mat-stepper/div[2]/div[1]/form/div[1]/table/tbody/tr[1]/td[4]/button")).click();
	//Click on Upload button
	Thread.sleep(6000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-eauction-event/div/mat-stepper/div[2]/div[1]/form/div[1]/table/tbody/tr[2]/td[4]/button/span[1]/label/span")).click();
	//Click On Submit button
	Thread.sleep(6000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-stroked-button mat-button-base ng-tns-c220-23 ng-star-inserted']")).click();
	//Login With Approver
	Thread.sleep(1000);
	d.get("https://eauction.mahamining.com/#/login");
	super.Login2();
	 //Click On Approve Event
    Thread.sleep(4000);
    d.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span[2]")).click();
    //Click On Document Verification Page
    Thread.sleep(1000);
    d.findElement(By.xpath("//*[@id=\"submenu1\"]/li[3]/a/span")).click();
    //Click On Event ID
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[2]/td[2]/a")).click();
	//Click On Downward Arrow
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[1]/td[5]/button/span[1]/mat-icon")).click();
}
@Test(priority=1)
public void Status() throws Exception {
//Verify Status Of Event Document After Approve/Reject By Approver
	Thread.sleep(100);
	//Click On Approve button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[8]/div/button[2]")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-12")).sendKeys("Approver");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
	//Click  on Downward Arrow
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[1]/td[5]/button/span[1]/mat-icon")).click();
	//click On Approve button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[8]/div/button[2]/span[1]/mat-icon")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-12")).sendKeys("Approver");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
	//Login With Bidder
	d.get("https://eauction.mahamining.com/#/login");
	super.Login9();
	//Click On Event Details Page
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/span[2]")).click();
	//Click On Upload document Button
	    Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[5]/td[9]/button/span[1]/span")).click();	
}
@Test
public void Reject() throws Exception {
//Verify Status In   Event Details When Approver Reject  Document
	Thread.sleep(1000);
	Thread.sleep(100);
	//Click On Reject  button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[4]/td/div/div/table/tbody/tr[1]/td[8]/div/button[1]")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-67")).sendKeys("Reject");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
	//Click  on Downward Arrow
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[1]/td[5]/button/span[1]/mat-icon")).click();                                                                                                                                                           
	//click On Reject button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[8]/div/button[2]/span[1]/mat-icon")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-12")).sendKeys("Reject");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
	//Login With Bidder
	d.get("https://eauction.mahamining.com/#/login");
	super.Login9();
	//Click On Event Details Page
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/span[2]")).click();
	//Click On Upload document Button
	    Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[5]/td[9]/button/span[1]/span")).click();	
}
@Test
public void Reject_Approve() throws Exception {
//Verify Status In   Event Details When Approver Reject  Document
	Thread.sleep(1000);
	Thread.sleep(100);
	//Click On Reject  button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[4]/td/div/div/table/tbody/tr[1]/td[8]/div/button[1]")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-67")).sendKeys("Reject");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
	//Click  on Downward Arrow
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[1]/td[5]/button/span[1]/mat-icon")).click();                                                                                                                                                           
	//click On Approve  button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[4]/td/div/div/table/tbody/tr[2]/td[8]/div/button[2]/span[1]/mat-icon")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-68")).sendKeys("Reject");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"mat-dialog-4\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
	//Login With Bidder
	d.get("https://eauction.mahamining.com/#/login");
	super.Login9();
	//Click On Event Details Page
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/span[2]")).click();
	//Click On Upload document Button
	    Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[5]/td[9]/button/span[1]/span")).click();	
}

}
