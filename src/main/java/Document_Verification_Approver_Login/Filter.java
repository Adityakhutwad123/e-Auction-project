package Document_Verification_Approver_Login;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class Filter extends Logins {
@Test(priority=1)
public void Document_Verification() throws Exception {
//Verify Selected Date related Event Display Or Not On Table
     super.connection();
     super.Login2();
     //Click On Approve Event
     Thread.sleep(4000);
     d.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span[2]")).click();
     //Click On Document Verification Page
     Thread.sleep(1000);
     d.findElement(By.xpath("//*[@id=\"submenu1\"]/li[3]/a/span")).click();
     //Click on Event Creation Date Dropdown
     Thread.sleep(4000);
     d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-6']")).click();
     //Select Event Creation Date 
     Thread.sleep(1000);
     d.findElement(By.xpath("//button[@aria-label='7 October 2022']")).click();
     //Click On Apply Button
     Thread.sleep(1000);
     d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded mat-button mat-button-base']")).click();
//Verify Selected Status  Related Event Display or Not On page 
     //Click On Status Dropdown
     Thread.sleep(1000);
     d.findElement(By.id("mat-select-value-1")).click();
      //Select Status As Approve
     Thread.sleep(1000);
     d.findElement(By.id("mat-option-1")).click();
     //Click On Apply Button
     Thread.sleep(1000);
     d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded mat-button mat-button-base']")).click();
     //Click On Status Dropdown
     Thread.sleep(1000);
     d.findElement(By.id("mat-select-value-1")).click();
      //Select Status As Reject
     Thread.sleep(1000);
     d.findElement(By.id("mat-option-2")).click();
     //Click On Apply Button
     Thread.sleep(1000);
     d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded mat-button mat-button-base']")).click();
     //Click On Status Dropdown
     Thread.sleep(1000);
     d.findElement(By.id("mat-select-value-1")).click();
      //Select Status As Pending 
     Thread.sleep(1000);
     d.findElement(By.id("mat-option-3")).click();
     //Click On Apply Button
     Thread.sleep(1000);
     d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded mat-button mat-button-base']")).click();
//Verify Entered Event ID Related Event Display Or Not On table 
     Thread.sleep(1000);
     d.findElement(By.id("mat-input-6")).sendKeys("EVT-20221004-3");
     //Click On Apply Button
     Thread.sleep(1000);
     d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded mat-button mat-button-base']")).click();
}
@Test(priority=2)
public void Event() throws Exception {
//Verify Event Display Or Not On  Document Verification Page When bidder Participated In Event And Apply Document
	Thread.sleep(1000);
	d.get("https://eauction.mahamining.com/#/login");
	//Login With Bidder
	Thread.sleep(1000);
		super.Login9();
  //click On Downward Arrow 
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-home/div/div[2]/div/table/tbody/tr[1]/td[9]/div/button[3]")).click();
	//Click On Checkbox
		Thread.sleep(1000);
		d.findElement(By.id("mat-checkbox-2")).click();
    //Click On Participate button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-home/div/div[1]/button")).click();
   //Click On Upload Document  Button 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[4]/td[9]/button/span[1]")).click();
 //Click On Upload Document 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-eauction-event/div/mat-stepper/div[2]/div[1]/form/div[1]/table/tbody/tr[1]/td[4]/button")).click();
//Click On Upload Document 
		Thread.sleep(6000);
		d.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[1]/table/tbody/tr[2]/td[4]/button")).click();
//Click On Submit button
		Thread.sleep(6000);
		d.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button")).click();
		Thread.sleep(1000);
 //Login With Approver
		d.get("https://eauction.mahamining.com/#/login");	
		super.Login2();
		 //Click On Approve Event
	     Thread.sleep(4000);
	     d.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span[2]")).click();
	     //Click On Document Verification Page
	     Thread.sleep(1000);
	     d.findElement(By.xpath("//*[@id=\"submenu1\"]/li[3]/a/span")).click();
}
@Test
public void BeforeParticipate() throws Exception {
	//Verify Event Display Or Not In Document Verification Page Before Participate in Event 
	d.get("https://eauction.mahamining.com/#/login");	
	super.Login2();
	 //Click On Approve Event
     Thread.sleep(4000);
     d.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span[2]")).click();
     //Click On Document Verification Page
     Thread.sleep(1000);
     d.findElement(By.xpath("//*[@id=\"submenu1\"]/li[3]/a/span")).click();
   	
}


}
