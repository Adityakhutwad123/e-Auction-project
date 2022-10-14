package Event_Approval_Page_Approver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class Status extends Logins{
public void Approve() throws Exception {
//1]Verify Status of Event change Or Not When Approver Approve Event 
	//Login With Approver
	super.connection();
	super.Login2();
	 super.Login2();
       //Click On Approval Event Page 
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		 //Click On  Approve Event  page
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
	//Click On Event ID
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
   //Click On Approve Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-deatils/div/div[3]/button[2]/span[1]")).click();
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-97")).sendKeys("Approver Event");
	//Click On Yes Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
//Verify Event Display Or Not In Publish Event Page After Approve By Approver
	//Click On Publish Event Page 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
}
@Test
public void Reject() throws Exception {
	//2]Verify Status of Event change Or Not When Approver Reject  Event 
			//Login With Approver
			super.Login2();
			//Click On Event ID
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
		   //Click On Reject  Button
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-deatils/div/div[3]/button[1]/span[1]")).click();
			//Enter Remark
			Thread.sleep(1000);
			d.findElement(By.id("mat-input-100")).sendKeys("Reject Event");
			//Click On Yes Button
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
  //Verify Event Display Or Not In Publish Event Page When Approver Reject Event
			//Click On Publish Event Page 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
}
@Test
public void button() throws InterruptedException {
//Verify Approve/Reject Butto Button Is Visible Or Not After Approve /Reject Event by Approver
	 //Click On  Approve Event  page
	 Thread.sleep(1000);
	 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
//Click On Event ID
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
	
}
}
