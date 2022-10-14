package Admin;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BidderList_Update extends Logins{
	@Test
	public void Update() throws Exception {
//Verify Updated Information display Or not With Update After Updated Bidder
	     //Login With Admin
	    super.connection();
	     super.Login();
	   //click On  Master
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
			//Click On Page Bidder List
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[3]/a/span")).click();
			//Click On edit Button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[3]/div/table/tbody/tr[1]/td[8]/div/button[1]/span[1]/mat-icon")).click();	
		    //Update Name
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@id='mat-input-16']")).clear();
		    d.findElement(By.xpath("//input[@id='mat-input-16']")).sendKeys("Rushikesh");
		    //Update Mobile No
		    Thread.sleep(2000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[2]/div[2]/div/div[2]/mat-form-field/div/div[1]/div[3]/input")).clear();
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[2]/div[2]/div/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("9145393411");
		   //Update District 
		    Thread.sleep(1000);
		    d.findElement(By.id("mat-select-value-13")).click();
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[28]/span")).click();
		    //Update Email Id
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[3]/div[2]/div/div[2]/mat-form-field/div/div[1]/div[3]/input")).clear();
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[3]/div[2]/div/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("rushi123@gmail.com");
		    //Update Address
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[4]/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/textarea")).clear();
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[4]/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/textarea")).sendKeys("solapur");
		    //Update Pincode
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@id='mat-input-9']")).clear();
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys("123456");
		    //Update Designation
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[5]/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[7]/span")).click();
	}
	@Test(priority=5)
	public void Update_Document() throws Exception {
		//Update PAN No
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//input[@id='mat-input-10']")).clear();
	    d.findElement(By.xpath("//input[@id='mat-input-10']")).sendKeys("BFDAD1234k");
	    //Update  Document 
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[7]/div/table/tbody/tr[1]/td[3]/span/button/span[1]/label/span")).click();
	    //Update Aadhar No 
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@id='mat-input-17']")).clear();
	    d.findElement(By.xpath("//input[@id='mat-input-17']")).sendKeys("456789012300");
	    //Update GST
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//input[@id='mat-input-11']")).clear();
	    d.findElement(By.xpath("//input[@id='mat-input-11']")).sendKeys("28ABCFM8330M1ZT");
	   //Click On Update Button
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[8]/div/div/button[2]/span[1]")).click();
	  //Click On Edit button
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[3]/div/table/tbody/tr[1]/td[8]/div/button[1]/span[1]/mat-icon")).click();
	  //Click On Update Button
	    Thread.sleep(2000);
	    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-bidder-registration/mat-card/div/div/form/div[8]/div/div/button[2]")).click();
	}
	@Test(priority=6)
	public void updated() throws InterruptedException{
//Verify Updated Data Display Or not On Bidder Registration Page When search By Updated PAN No
		//Logout As Admin
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/header/app-navbar/header/nav/div/div/div[2]/nav/div/ul/li[2]")).click();
		//Click On Logout
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/header/app-navbar/header/nav/div/div/div[2]/nav/div/ul/li[2]/ul/li[4]/a")).click();
		//Click On Confirmation Message
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
		//Click On Login
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/app-w-header/header/nav/div/div/button")).click();
		//Click on Bidder Registration
				d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[2]/button[1]")).click();
				// Search By PAN no
				// Enter PAN No. In PAN No. Field
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[1]/form/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("BFDAD1234k");
				// Click On Search Button
				Thread.sleep(2000);
				d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[1]/form/div/div[1]/div/div[2]/button/span[1]")).click();
//Verify Bidder Information Display Or not When Search Bidder Old PAN No
				Thread.sleep(1000);
				//Enter Old PAN No
				d.findElement(By.id("mat-input-20")).clear();
				d.findElement(By.id("mat-input-20")).sendKeys("BFDAD1234l");
				// Click On Search Button
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[1]/form/div/div[1]/div/div[2]/button/span[1]")).click();
//Verify Updated Information display Or Not in Bidder Login
				//Click On Login
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/app-w-header/header/nav/div/div/button/span[1]")).click();
				Thread.sleep(1000);
				//Enter User Name
				Thread.sleep(1000);
				d.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("");
				//Enter Password
				Thread.sleep(1000);
				d.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("");
				//Enter Captcha
				 String Captcha1=JOptionPane.showInputDialog("Enter Your Captcha");
				 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha1);
				//Click On Login
				d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();			
	}
}
