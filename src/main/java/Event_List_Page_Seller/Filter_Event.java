package Event_List_Page_Seller;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Filter_Event extends Create_Event{
	
	@BeforeTest
public void filter() throws Exception {
	//Verify Selected Date Related Event Display Or Not In  Table
	 super.connection();
	 super.Login3();
	 //Click On Event List
	 Thread.sleep(3000);
	 d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
	 //Click On Date Dropdown
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//button[@tabindex='0']")).click();
	 //Click On Start  Date 
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//button[@aria-label='2 September 2022']")).click();
	 //Click On END Date
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//button[@aria-label='16 September 2022']")).click();
	 //Click On Apply Button
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
	//Verify Selected Status Related Event Display Or Not In Table 
	 //Click On Status Dropdown
	 Thread.sleep(1000);
	 d.findElement(By.id("mat-select-value-1")).click();
	 //Select Status As Approve
	 Thread.sleep(1000);
	 d.findElement(By.id("mat-option-1")).click();
	 //Click On Apply Button
	 Thread.sleep(1000);
	 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
	//Click On Status Dropdown
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-select-value-1")).click();
		 //Select Status As Pending
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-option-2")).click();
		 //Click On Apply Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
   //Click On Status Dropdown
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-select-value-1")).click();
		 //Select Status As Reject
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-option-3")).click();
		 //Click On Apply Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();
		 //Click On Status Dropdown
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-select-value-1")).click();
 //Select Status As Alll
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-option-0")).click();
		 //Click On Apply Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();		 
//Verify Entered  Event Name Related Result Display Or Not In Field
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-input-5")).sendKeys("Event Demo");
 //Click On Apply Button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-gray bg-transparent border rounded ms-1 mat-stroked-button mat-button-base']")).click();				 
}
	public void Added_Event_table() throws Exception {
		//Verify Added Event Display Or Not In Table
		Thread.sleep(1000);
		super.Added_Event();
	}

}
