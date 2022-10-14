package PublishEvent_Approver;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class publish_Event_Page extends Logins{
@BeforeTest
public void filter() throws Exception {
//Verify Selected Date Related Event Display Or Not On Page
	Thread.sleep(1000);
	super.connection();
	super.Login2();
	 //Click On Approval Event Page 
	 Thread.sleep(3000);
	 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	 //Click On Publish Event Page
	 Thread.sleep(1000);
	 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
	 //Click On Publish Page 
	 Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-publish-event/div/mat-tab-group/mat-tab-header/div/div/div/div[2]")).click();
	Thread.sleep(1000);
    //Click on  Event Start Date dropdown
	Thread.sleep(2000);
	d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-7']")).click();
	//Select Date 
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@aria-label=\"6 October 2022\"]")).click();
	//Click On Event End Date Dropdown
	Thread.sleep(1000);
	d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-18']")).click();
	  //Select End Date
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@aria-label=\"18 October 2022\"]")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class=\"mat-focus-indicator btn-gray mat-stroked-button mat-button-base\"]")).click();	
//Verify Searched Event Id Related Event Display Or Not  
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-10")).sendKeys("EVT-20221006-1");
	//Click On Apply Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class=\"mat-focus-indicator btn-gray mat-stroked-button mat-button-base\"]")).click();
}
@Test
public void Details() throws Exception {
	//Verify Correct Details  Display Or Not On Publish Event Page After Publish Event
    //click On Event Id 
	  Thread.sleep(2000);
	  d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-publish-event/div/mat-tab-group/div/mat-tab-body[2]/div/table/tbody/tr[1]/td[2]/a")).click();	
}
}
