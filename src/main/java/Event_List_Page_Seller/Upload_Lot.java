package Event_List_Page_Seller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Upload_Lot extends Logins {
@BeforeTest
public void Before_Lot() throws Exception {
	super.connection();
	super.Login3();
//Click On Event List
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
}
@Test
public void Add_Upload() throws Exception {
//Verify Added Lot Display Or Not in Table on Upload Page 
	//Click On Upload Lots Button
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[10]/div/button[1]")).click();
	//Click On Select Lot Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-lots-upload/div/div/div/div[3]/div[5]/div/div/div[2]/button/span[1]")).click();
	//Select Lot
	Thread.sleep(2000);
	d.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']")).click();
	//Click On Apply Lot Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mb-2 me-0 mat-raised-button mat-button-base'][1]")).click();
	//Scroll Down Until Subit Button Not Found
	Thread.sleep(1000);
	WebElement w=d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main ms-2 mat-raised-button mat-button-base']"));
	JavascriptExecutor s1=(JavascriptExecutor) d;
	s1.executeScript("arguments[0].scrollIntoView()",w);
	//Enter Remark
	Thread.sleep(1000);
	d.findElement(By.xpath("//textarea[@maxlength='300']")).sendKeys("Remark");
	//Click On Upload Document 
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-upload pe-3 me-2 mat-raised-button mat-button-base ng-star-inserted']")).click();
	//Click On Add Lots Button
	Thread.sleep(5000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator px-2 mat-stroked-button mat-button-base']")).click();
}
@Test(priority=1)
public void Update_Lot() throws Exception {
	//Verify Updated MinBid Increment Display Or Not With Update
	//Click On Edit Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/header/app-navbar/header/nav/div/div/div[1]/button/span[1]/mat-icon")).click();
	//Update Min Bid Increment
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-15")).clear();
	d.findElement(By.id("mat-input-15")).sendKeys("1000");
	//Click On Update Lot Button
	Thread.sleep(1000);
   d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-lots-upload/div/div/div/div[3]/form/div[7]/div[2]/button")).click();

}
@Test(priority=2)

public void Upload_Lot() throws Exception {
	//Verify Added Lot Display or Not in Event Details Page
	//Click On Save Button
	Thread.sleep(2000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main ms-2 mat-raised-button mat-button-base']")).click();
}

}
