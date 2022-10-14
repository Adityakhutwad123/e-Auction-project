package Bidder_Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Bidder_Registration_Organization extends Logins {
	@BeforeTest
	public void before_Registration() throws Exception {
		super.connection();
		//Click on Bidder Registration
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[2]/button[1]")).click();
		// Search By PAN no
		// Enter PAN No. In PAN No. Field
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-20")).sendKeys("absde1234f");
		// Click On Search Button
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[1]/form/div/div[1]/div/div[2]/button/span[1]")).click();

	}

	@Test(priority=1)
	public void Search_PAN() throws Exception {
		Thread.sleep(1000);
		//Enter Bidder Details 
		//Select Organization Type
		Thread.sleep(1000);
		d.findElement(By.id("mat-radio-2")).click();
		//Enter Bidder Name 
		Thread.sleep(2000);
		d.findElement(By.id("mat-input-22")).sendKeys("Bhairvanath Industry"); 
		//Enter Mobile No
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-3")).sendKeys("7058942513"); 
		//Click On District Dropdown 
		Thread.sleep(1000); 
		d.findElement(By.id( "mat-select-0" )).click(); 
		//Select District 
		Thread.sleep(1000); 
		d.findElement(By.xpath( "/html/body/div[4]/div[2]/div/div/div/mat-option[33]/span")).click(); //Enter
		//Email Address 
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-4")).sendKeys("navin@gmail.com");
		//Enter  Address 
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-5")).sendKeys("Solapur"); 
		//Enter Pin code
		Thread.sleep(1000); d.findElement(By.id("mat-input-6")).sendKeys("123445");
		//Enter Contact Person Name
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-23")).sendKeys("Rohit");
		//Click On Organization Type Dropdown
		Thread.sleep(1000);
		d.findElement(By.id("mat-select-value-5")).click();
		//Select Organization Type
		Thread.sleep(1000);
		d.findElement(By.id("mat-option-47")).click();
		//Enter Contact Person Mobile No 
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-24")).sendKeys("6554789654");
		}
		 
	@Test (priority=2)
	public void Upload_document() throws Exception { 
		//click On Upload PAN Document 
		Thread.sleep(1000); 
		d.findElement(By.xpath( "/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[7]/div/table/tbody/tr[1]/td[3]/span/button")).click(); 
		//Scroll Down
				Thread.sleep(2000);
				WebElement w=d.findElement(By.id("mat-input-19"));
				JavascriptExecutor js = (JavascriptExecutor) d;
				js.executeScript("arguments[0].scrollIntoView(true);",w);
		//Enter GST No Field
		Thread.sleep(2000);
		d.findElement(By.id("mat-input-8")).sendKeys("27ABCFM8335M1ZT"); 
		//Upload GST  Document 
		Thread.sleep(1000);   
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[7]/div/table/tbody/tr[2]/td[3]/span/button/span[1]/label/span" )).click();
	    //Enter Incorporation No
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-9")).sendKeys("L17110MH1973PLC019786");
		//Select Incorporation Date 
		Thread.sleep(6000);
		d.findElement(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c51-13']")).click();
		//Select Incorporation Date 
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@aria-label='2 October 2022']")).click();
		//Upload Incorporation Document 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[7]/div/table/tbody/tr[4]/td[3]/span/button/span[1]/label/span")).click();
		//Enter Shop Act No
		Thread.sleep(6000);
		d.findElement(By.id("mat-input-36")).sendKeys("334343432232323");
		//Upload Document 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[7]/div/table/tbody/tr[4]/td[3]/span/button/span[1]/label/span")).click();
		// Enter GST No
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-8")).sendKeys("27ABCFM8335M1ZT");
		// Upload GST Document
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[7]/div/table/tbody/tr[3]/td[3]/span/button/span[1]/label/span")).click();
	}

	@Test(priority=3)
	public void Account_Details() throws Exception {
		// Enter Account Holder Name
		Thread.sleep(4000);
		d.findElement(By.xpath("//*[@id=\"mat-input-15\"]")).sendKeys("Navin Boddul");
		// Enter Account No
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"mat-input-16\"]")).sendKeys("654789654");
		//Enter Bank Name
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"mat-input-17\"]")).sendKeys("Bank Of Maharashtra");
		//Enter IFSC Code
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"mat-input-18\"]")).sendKeys("MAHB0000001");
		//Enter Branch Name 
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"mat-input-19\"]")).sendKeys("Bank Of Maharashtra");
		//click On Send OTP Button
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[10]/div[2]/div/div[2]/div/button/span[1]")).click();
		//Enter OTP
	
		//Click On Submit Button
		Thread.sleep(6000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[11]/div/div/button[2]/span[1]")).click();
		System.out.println("Bidder Register Successfully");
		 }


}
