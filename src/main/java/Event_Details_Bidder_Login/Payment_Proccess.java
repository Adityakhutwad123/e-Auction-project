package Event_Details_Bidder_Login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class Payment_Proccess extends Logins{
	@Test(priority=1)
	public void Event_Details_Buy_Tender() throws Exception {
		//Verify Correct Total Amount Display Or Not On Page 	
		       super.connection();
		         super.Login9();
				Thread.sleep(1000);
				//Click On Event Details Page
				Thread.sleep(1000);
				d.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/span[2]")).click();
				//click On Buy Tender
				Thread.sleep(1000);
				d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[5]/td[9]/button/span[1]/span")).click();
	}
@Test(priority=2)
public void BuyTender() throws Exception {
//Verify Correct Information display Or Not In By Tender 
	//Click On Pay Now Button
		Thread.sleep(5000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-eauction-event/div/mat-stepper/div[2]/div[2]/form/div[3]/button[2]/span[1]")).click();
   //Click On Confirmation Message 
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn bg-success text-white submit mb-2 mat-stroked-button mat-button-base ng-star-inserted']")).click();
// Verify Entry Add Or Not In Account Details Page After Buy Tender
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a/span[2]")).click();
		
}
@Test(priority=3)
public void Event_Details_EMD() throws Exception {
//Verify Correct details display Or Not On Event Details Page
	 super.connection();
     super.Login9();
	Thread.sleep(1000);
	//Click On Event Details Page
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/span[2]")).click();
	//Click On PayEMD
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[5]/td[9]/button/span[1]/span")).click();
     
	
}
@Test(priority=4)
public void Pay_EMD() throws Exception {
//Verify Pay EMD Process
	Thread.sleep(1000);
	//Click On PayNow Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn-main ms-3 px-3 mat-stroked-button mat-button-base ng-tns-c220-35 ng-star-inserted']")).click();
	//Click On Confirmation Message
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn bg-success text-white submit mb-2 mat-stroked-button mat-button-base ng-star-inserted']")).click();
//Verify Entry Add Or Not In Account Details 
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a/span[2]")).click();

}
@Test(priority=5)
public void Bidding() throws Exception {
//Verify Correct Details Display Or Not On Bidding Page
	//Click On Event Details Page
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/a/span[2]")).click();
		//Click On Bidding Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-event-details/div/div[2]/table/tbody/tr[5]/td[9]/button/span[1]/span")).click();
}
@Test(priority=6)
public void Live_Bidding() throws Exception {
//Verify Event ID Bind Or Not In Event ID Dropdown in Live Bidding Page
	//Click On Live Bidding And Auction
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span[2]")).click();
	//Click On Event ID Drop Down 
	Thread.sleep(1000);
	d.findElement(By.id("mat-select-value-9")).click();
}

}
