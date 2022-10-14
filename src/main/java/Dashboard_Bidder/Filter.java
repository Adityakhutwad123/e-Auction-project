package Dashboard_Bidder;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class Filter extends Logins{
	@Test(priority=1)
	public void Date_Ralted() throws Exception {
//Verify selected Date Related Event Display Or Not In Table
		Thread.sleep(1000);
		super.connection();
		super.Login9();
	//Click On Date Drop Down
		Thread.sleep(2000);
		d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-7']")).click();
		//Select Start Date
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@aria-label='10 October 2022']")).click();
		//Select To End Date
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@aria-label='28 October 2022']")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	}
@Test(priority=2)
public void filter() throws Exception {
//Verify Filter Event Level Related Event Display Or Not In Table
	Thread.sleep(2000);
	//Click On Event Level Dropdown
	d.findElement(By.id("mat-select-value-1")).click();
	//Select Event Level as State
	Thread.sleep(1000);
	d.findElement(By.id("mat-option-1")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Click On Event Level Dropdown
	d.findElement(By.id("mat-select-value-1")).click();
	//Select Event Level as District
	Thread.sleep(1000);
	d.findElement(By.id("mat-option-2")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Click On Event Level Dropdown
	d.findElement(By.id("mat-select-value-1")).click();
	//Select Event Level as SDO
	Thread.sleep(1000);
	d.findElement(By.id("mat-option-3")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Click On Event Level Dropdown
    d.findElement(By.id("mat-select-value-1")).click();
	//Select Event Level as Tehsil
	Thread.sleep(1000);
	d.findElement(By.id("mat-option-4")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Click On Event Level Dropdown
    d.findElement(By.id("mat-select-value-1")).click();
	//Select Event Level as All
	Thread.sleep(1000);
	d.findElement(By.id("mat-option-0")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
//Verify  Selected District  Related result Display Or Not In Table 
	//Click On District Dropdown
	Thread.sleep(1000);
	d.findElement(By.id("mat-select-value-3")).click();
	//Select District as Ahmdnagar
	Thread.sleep(2000);
	d.findElement(By.id("mat-option-6")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Click On District Dropdown
		Thread.sleep(1000);
		d.findElement(By.id("mat-select-value-3")).click();
		//Select District as beed
		Thread.sleep(2000);
		d.findElement(By.id("mat-option-10")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
//Verify Selected Mineral Related Event Display Or Not In Table 
		//click On Mineral Dropdown
		Thread.sleep(1000);
		d.findElement(By.id("mat-select-value-5")).click();
		//Select Mineral
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-43")).click();
		//Click On Apply button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
		 //click On Mineral Dropdown
		 Thread.sleep(1000);
		d.findElement(By.id("mat-select-value-5")).click();
		//Select Mineral
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-46")).click();
		//Click On Apply button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();		
//Verify Entered Event Name Related Event Display Or Not  in Table 
		 //enter Event Name
		 Thread.sleep(1000);
		 d.findElement(By.id("mat-input-4")).sendKeys("Event For Test");
		//Click On Apply button
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
}
@Test(priority=3)
public void Upcoming_Teender() throws Exception {
	//Click On Upcoming Tender
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-home/div/div[1]/a[2]")).click();
	//Click On Date Drop Down
	Thread.sleep(2000);
	d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-7']")).click();
	//Select Start Date
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@aria-label='10 October 2022']")).click();
	//Select To End Date
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@aria-label='28 October 2022']")).click();
	//Click On Apply button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Click On Event Level Dropdown
		d.findElement(By.id("mat-select-value-1")).click();
		//Select Event Level as State
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-1")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
		//Click On Event Level Dropdown
		d.findElement(By.id("mat-select-value-1")).click();
		//Select Event Level as District
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-2")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
		//Click On Event Level Dropdown
		d.findElement(By.id("mat-select-value-1")).click();
		//Select Event Level as SDO
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-3")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
		//Click On Event Level Dropdown
	    d.findElement(By.id("mat-select-value-1")).click();
		//Select Event Level as Tehsil
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-4")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
		//Click On Event Level Dropdown
	    d.findElement(By.id("mat-select-value-1")).click();
		//Select Event Level as All
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-0")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Verify  Selected District  Related result Display Or Not In Table 
		//Click On District Dropdown
		Thread.sleep(1000);
		d.findElement(By.id("mat-select-value-3")).click();
		//Select District as Ahmdnagar
		Thread.sleep(2000);
		d.findElement(By.id("mat-option-6")).click();
		//Click On Apply button
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
		//Click On District Dropdown
			Thread.sleep(1000);
			d.findElement(By.id("mat-select-value-3")).click();
			//Select District as beed
			Thread.sleep(2000);
			d.findElement(By.id("mat-option-10")).click();
			//Click On Apply button
			Thread.sleep(1000);
			d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
	//Verify Selected Mineral Related Event Display Or Not In Table 
			//click On Mineral Dropdown
			Thread.sleep(1000);
			d.findElement(By.id("mat-select-value-5")).click();
			//Select Mineral
			Thread.sleep(1000);
			d.findElement(By.id("mat-option-43")).click();
			//Click On Apply button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
			 //click On Mineral Dropdown
			 Thread.sleep(1000);
			d.findElement(By.id("mat-select-value-5")).click();
			//Select Mineral
			Thread.sleep(1000);
			d.findElement(By.id("mat-option-46")).click();
			//Click On Apply button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();		
	//Verify Entered Event Name Related Event Display Or Not  in Table 
			 //enter Event Name
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-input-4")).clear();
			 Thread.sleep(1000);
			 d.findElement(By.id("mat-input-4")).sendKeys("Event For Test");
			//Click On Apply button
			 Thread.sleep(1000);
			 d.findElement(By.xpath("//button[@class='mat-focus-indicator btn btn-gray ng-tns-c218-6 mat-button mat-button-base']")).click();
			 
}

}
