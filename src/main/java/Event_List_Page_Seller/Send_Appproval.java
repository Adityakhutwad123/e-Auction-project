package Event_List_Page_Seller;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Send_Appproval extends Logins {
	@BeforeTest
public void Connect_For_Approval() throws Exception {
      super.connection();
      super.Login3();
      //Click On Event List
      Thread.sleep(1000);
 	  d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
      //Click On Event Id 
 	  Thread.sleep(1000);
 	 d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
 	 
}
	@Test
public void Approver_Login_Same_Level() throws Exception {
	//Verify Sent Event Display Or Not In Approver Login When Event Is Send For Approval
	  //Click  On Send For Approval Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-deatils/div/div[3]/button/span[1]")).click();
	//Click On Confirmation Message
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
	//Login With Approver
	Thread.sleep(1000);
	d.get("https://eauction.mahamining.com/#/login");
	super.Login2();
	//Click On Event Approve
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	//Click On Approve Event
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
	//Verify Correct Details Display Or Not In Approval Login
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]")).click();
}
	@Test(priority=1)
	public void Approver_Login_Different_District() throws Exception {
		//Verify Sent Event Display Or Not For Approval Login When Approver Level Is Different
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		super.Login4();
		//Click On Event Approve
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On Approve Event
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
	}
	@Test(priority=2)
	public void Approver_Login_State() throws Exception
	{
		//Verify Sent Event Display Or Not For Approval Login When Approver Level Is Different
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		super.Login5();
		//Click On Event Approve
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On Approve Event
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
		
	}
	@Test(priority=3)
	public void Different_District_Seller() throws Exception {
		//Verify Event Display Or Not For Different Seller With Same District
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		super.Login6();
		 //Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();

	}
	@Test(priority=4)
	public void Same_District_Seller() throws Exception {
		//Verify Event Display Or Not For Different Seller With Same District
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		super.Login6();
		 //Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
	}
	@Test(priority=5)
	public void Diff_level_Seller() throws Exception {
		//Verify Event Display Or Not For Different Seller With Same District
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		super.Login7();
		 //Click On Event List
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
	}
	@Test(priority=6)
	public void status() throws Exception {
	//Verify Status After Approve By Approver
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
         super.Login2();
     	//Click On Event Approve
 		Thread.sleep(1000);
 		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
 		//Click On Approve Event
 		Thread.sleep(1000);
 		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
 		//Click On Event Details
 		Thread.sleep(1000);
 		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]")).click();
       //Click On Approve Button
 		Thread.sleep(1000);
 		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base ng-star-inserted']")).click();
 		//Enter Remark
 		Thread.sleep(1000);
 		d.findElement(By.id("mat-input-24")).sendKeys("Approve");
 		//Click On Yes
 		Thread.sleep(1000);
 		//d.findElement(By.xpath("//*[@id=\"mat-dialog-2\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
 		Thread.sleep(1000);
 		//Login With Seller
 	   d.get("https://eauction.mahamining.com/#/login");
 	   super.Login3();
 	   
 		}
	@Test(priority=7)
	public void status1() throws Exception {
	//Verify Status After Reject By Approver
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
         super.Login2();
     	//Click On Event Approve
 		Thread.sleep(1000);
 		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
 		//Click On Approve Event
 		Thread.sleep(1000);
 		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
 		//Click On Event Details
 		Thread.sleep(1000);
 		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]")).click();
       //Click On Reject Button
 		Thread.sleep(1000);
 		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main me-1 mat-raised-button mat-button-base ng-star-inserted']")).click();
 		Thread.sleep(1000);
 		//Enter Remark
 		Thread.sleep(1000);
 		d.findElement(By.id("mat-input-19")).sendKeys("Reject");
 		//Click On Yes
 		Thread.sleep(2000);
 		d.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
 		//Login With Seller
 	   d.get("https://eauction.mahamining.com/#/login");
 	   super.Login3();
 	   
 		}
	
	
	
	
}
