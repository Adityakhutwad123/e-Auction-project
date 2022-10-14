package Event_List_Page_Seller;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class Update_Event extends Logins {
	
	@Test(priority=1)
	public void connection() throws Exception {
		
		//Make Connection
		Thread.sleep(1000);
	    super.connection();
	    super.Login3();
	    //Click On Event List 
	    Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]")).click();
		//Click On Edit Button
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[10]/div/button[2]/span[1]")).click();
			   
	}
	
	@Test(priority=2)
public void Update() throws Exception {
	//Verify Updated Data Display Or Not with Update
   //Update Event Title
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-6")).clear();
	d.findElement(By.id("mat-input-6")).sendKeys("Automation Event Test 1");
	//Update Event type 
	Thread.sleep(2000);
	d.findElement(By.id("mat-select-value-5")).click();
	Thread.sleep(1000);
	d.findElement(By.id("mat-option-9")).click();
	//Update Event Fee
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-7")).clear();
	d.findElement(By.id("mat-input-7")).sendKeys("2000");
	//Update Description
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-8")).clear();
	d.findElement(By.id("mat-input-8")).sendKeys("2000");
	//Update Eligible Document 
	Thread.sleep(1000);
	d.findElement(By.id("mat-checkbox-2")).click();
	//Click On Update Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main mat-raised-button mat-button-base']")).click();
	//Click On Edit Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[10]/div/button[2]/span[1]")).click();
}

@Test(priority=3)
public void Updated_EDetails() throws Exception {
	//Verify Updated Details Display Or Not With Update InEvent details Page
	    //click On Cross
	   Thread.sleep(2000);
	   d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-auction-screen/div/div/div/div/div[1]/div/div[2]/button/span[1]/i")).click();
	   //Click On Event Details(Event ID)
	   Thread.sleep(1000);
	   d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-list/div/table/tbody/tr[1]/td[2]/a")).click();
	 
	}
}
