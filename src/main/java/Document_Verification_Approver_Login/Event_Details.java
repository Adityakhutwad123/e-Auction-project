package Document_Verification_Approver_Login;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Event_Details extends Logins{
@BeforeTest
public void EventDetails() throws Exception {
//Verify Correct Details  Display Or Not On Event Details Page
	super.connection();
	super.Login2();
	 //Click On Approve Event
    Thread.sleep(4000);
    d.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span[2]")).click();
    //Click On Document Verification Page
    Thread.sleep(1000);
    d.findElement(By.xpath("//*[@id=\"submenu1\"]/li[3]/a/span")).click();
    //Click On Event ID
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
}
@Test
public void Approve_Document() throws Exception {
//Verify Status Of Document After Approve By Approver
	//Click On Downward Arrow
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[1]/td[5]/button/span[1]/mat-icon")).click();
    //Click On Approve Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td[8]/div/button[2]/span[1]/mat-icon")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-7")).sendKeys("Approve Document ");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
	 //Click On Approve Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr[2]/td[8]/div/button[2]/span[1]/mat-icon")).click();
		//Enter Remark
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-7")).sendKeys("Approve Document ");
		//Click On Yes Button
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
}
@Test
public void Verify_Status() throws Exception {
//Verify Status   Of Document When Approve Reject One Document And Approve one Document 
	//Click On Downward Arrow
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[3]/td[5]/button/span[1]/mat-icon")).click();
	    //Click On Approve Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[4]/td/div/div/table/tbody/tr[1]/td[8]/div/button[2]/span[1]/mat-icon")).click();
		//Enter Remark
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-7")).sendKeys("Approve Document ");
		//Click On Yes Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
		 //Click On Reject Button
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[4]/td/div/div/table/tbody/tr[2]/td[8]/div/button[1]")).click();
			//Enter Remark
			Thread.sleep(1000);
			d.findElement(By.id("mat-input-8")).sendKeys(" reject Document ");
			//Click On Yes Button
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
}
@Test
public void Verify_Status1() throws Exception {
//Verify Status   Of Document When Approve Reject both  Document  
	//Click On Downward Arrow
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[5]/td[5]/button/span[1]/mat-icon")).click();
	    //Click On Reject  Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[6]/td/div/div/table/tbody/tr[1]/td[8]/div/button[1]/span[1]/mat-icon")).click();
		//Enter Remark
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-7")).sendKeys("Reject  Document ");
		//Click On Yes Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
		//Click On Downward Arrow
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[5]/td[5]/button/span[1]/mat-icon")).click();
		 //Click On Reject Button
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-view-document/div/div[3]/table/tbody/tr[6]/td/div/div/table/tbody/tr[2]/td[8]/div/button[1]/span[1]/mat-icon")).click();
			//Enter Remark
			Thread.sleep(1000);
			d.findElement(By.id("mat-input-7")).sendKeys("reject Document");
			//Click On Yes Button
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
}
}
