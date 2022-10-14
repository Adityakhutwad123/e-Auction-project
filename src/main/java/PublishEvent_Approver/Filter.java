package PublishEvent_Approver;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Filter extends Logins{
	@BeforeTest
public void filter_Event() throws Exception {
//Verify Filtered Related Event Display Or Not On Page 
		super.connection();
		super.Login2();
			//Click On Approval Event Page 
			 Thread.sleep(3000);
			 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
			 //Click On Publish Event Page
			 Thread.sleep(1000);
			 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
			 //Click On Date Dropdown
			 Thread.sleep(2000);
			 d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-publish-event/div/div[2]/form/div/div[2]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
			 //Select Date
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@aria-label='20 October 2022']")).click();
			 //Click On Apply button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray mat-stroked-button mat-button-base']")).click();
//Verify Searched Event Id Related Pages Display Or Not On Page 
		//Enter Event Id
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-input-6")).sendKeys("EVT-20221004-1");
			 //Click On Apply button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray mat-stroked-button mat-button-base']")).click();
			 
}
	@Test(priority=1)
	public void Event() throws Exception {
//Verify Event Add Or Not In Publish Event Page After Approve By Approver
        //Click On Approver Event Page 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
	    //Click On Event ID
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
	   //Click On Approve Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-deatils/div/div[3]/button[2]/span[1]")).click();
		//Enter Remark
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-9")).sendKeys("Approver Event");
		//Click On Yes Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
		//Click On Publish Event Page
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
	
	}
	@Test(priority=2)
	public void Details() throws Exception {
//Verify Correct Details Display Or  Not on Page 
		Thread.sleep(1000);
		//click On Event Id 
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-publish-event/div/mat-tab-group/div/mat-tab-body[1]/div/table/tbody/tr[1]/td[2]/a")).click();
	}
}
