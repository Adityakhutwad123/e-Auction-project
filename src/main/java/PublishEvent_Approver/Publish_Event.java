package PublishEvent_Approver;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Publish_Event extends Logins{
	@BeforeTest
public void publish_Event() throws Exception {
//Verify Publish Event Display Or Not In Publish Event Page 
	//Login With Approver
		super.connection();
		super.Login2();
		//Click On Approval Event Page 
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	 //Click On Publish Event Page
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
	     //click On Event Id 
		 Thread.sleep(2000);
		  d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-publish-event/div/mat-tab-group/div/mat-tab-body[1]/div/table/tbody/tr[1]/td[2]/a")).click();
		 //Click On Date Dropdown
		  Thread.sleep(1000);
		  d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-online-item-details/div/form/div[1]/div[1]/div/div[1]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle")).click();
   //Select Document/Payment Start Date
		  Thread.sleep(1000);
		  d.findElement(By.xpath("//td[@aria-label='7 October 2022'][1]")).click();
		  //Click On Select Button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator ng-tns-c211-24 mat-button mat-stroked-button mat-button-base']")).click();
		  //Click On End Date Dropdown
		  Thread.sleep(2000);
		  d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-21']")).click();
		  //Select Document/Payment End Date
		  Thread.sleep(1000);
		  d.findElement(By.xpath("//td[@aria-label='10 October 2022'][1]")).click();
		  //Click On Select Button
		 Thread.sleep(2000);
		 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/ngx-mat-datetime-content/div[2]/button")).click();
   //Click On Live Bid Start Date Dropdown
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-22']")).click();
		 //Select Date 
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//td[@aria-label='11 October 2022'][1]")).click();
		  //Click On Select Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/ngx-mat-datetime-content/div[2]/button")).click();
		 //Click On Live Bid End Date Dropdown
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-23']")).click();
		 //Select Date 
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//td[@aria-label='14 October 2022'][1]")).click();
		  //Click On Select Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/ngx-mat-datetime-content/div[2]/button/span[1]/mat-icon")).click();
		 //Click On Submit button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mb-2 mat-raised-button mat-button-base']")).click();
		 //Click On Ok Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-success-dialog/div/div/div/div/div/div[2]/div[3]/div/button")).click();
}
	@Test
	public void publish_Event_Page() throws Exception {
		//Verify Event Display Or Not In Publish Event Page After publish  Event 
		//click On Publish Event Page 
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id='mat-tab-label-1-1']")).click();
		
	}
	@Test
	public void Event_Bidder() throws Exception {
//Verify Event Display Or not In Bidder Login After Publish Event
		//publish_Event();
		d.get("https://eauction.mahamining.com/#/login"); 
		//Login With Bidder 
		Thread.sleep(1000);
		super.Login9();
	}
	@Test
	public void Publish_Date() throws Exception {
		//Verify Live Bid Date And Time Display Or Not After Publish Tender By Approver
		//publish_Event();
		//Click On Approve Event
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
		//Click On Event ID
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
	}
}
