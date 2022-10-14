package Bidder_Registration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Admin.Logins;

public class Bidder_Registration_Individual extends Logins {
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
		//Enter Bidder Name 
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-13")).sendKeys("Navin"); 
		//Enter Mobile No
		Thread.sleep(1000);
		d.findElement(By.id("mat-input-3")).sendKeys("7058942513"); 
		//Click On District Dropdown 
		Thread.sleep(1000); 
		d.findElement(By.xpath( "/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[3]/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span" )).click(); 
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
		//Select Designation Thread.sleep(1000);
		d.findElement(By.id("mat-select-value-3")).click(); 
		Thread.sleep(1000);
		d.findElement(By.xpath("//mat-option[@id=\"mat-option-41\"]")).click(); 
		}
		 
	@Test (priority=2)
	public void Upload_document() throws Exception { 
		//click On Upload PAN Document 
		Thread.sleep(1000); 
		d.findElement(By.xpath( "/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[7]/div/table/tbody/tr[1]/td[3]/span/button")).click(); 
		//Enter Aadhar No 
		Thread.sleep(5000);
		d.findElement(By.id("mat-input-14")).sendKeys("879876574674"); 
		//UploadAadhar Document 
		Thread.sleep(1000);   
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[2]/form/div[7]/div/table/tbody/tr[2]/td[3]/span/button/span[1]/label/span" )).click(); 
		//Scroll Down
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,400)");
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
