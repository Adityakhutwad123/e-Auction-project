package Admin;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bidder_List extends Logins {
	@Test(priority=1)
	public void Block_Unblock() throws Exception{
		super.connection();
		super.Login();
	}
	@Test(priority=2)
	public void Block_Unblock1() throws Exception {
//Verify User is Block Or Not After Blocked User
	    //click On  Master
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On Page Bidder List
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[3]/a/span")).click();
		//Click On Block/Unblock Button 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[3]/div/table/tbody/tr[1]/td[8]/div/mat-icon/mat-slide-toggle/label/span[1]/span")).click();
		//Click On Confirmation Message 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
//Verify User is UnBlock Or Not After UnBlocked User
		//Click On Block/Unblock Button 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[3]/div/table/tbody/tr[1]/td[8]/div/mat-icon/mat-slide-toggle/label/span[1]/span")).click();
		//Click On Confirmation Message 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
	}
	@Test(priority=3)
	public void Login_User() throws Exception {
//Verify User Able Or not For Login After Blocked User 
		Thread.sleep(1000);
		//Click On Page Bidder List
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[3]/a/span")).click();
		//Click On Block/Unblock Button 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[3]/div/table/tbody/tr[1]/td[8]/div/mat-icon/mat-slide-toggle/label/span[1]/span")).click();
		//Click On Confirmation Message 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
		//login With Blocked User
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		//Enter User Name
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("");
		//Enter Password
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("");
		//Enter Captcha
		 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
		 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
		//Click On Login
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
//Verify user is able Or Not for Login After Unblock
		d.get("https://eauction.mahamining.com/#/login");
		//Login With Admin
		Thread.sleep(1000);
		super.Login();
		//click On  Master
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On Page Bidder List
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[3]/a/span")).click();
		//Unblock the User
		//Click On Block/Unblock Button 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[3]/div/table/tbody/tr[1]/td[8]/div/mat-icon/mat-slide-toggle/label/span[1]/span")).click();
		//Click On Confirmation Message 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
		//login With Blocked User
				Thread.sleep(1000);
				d.get("https://eauction.mahamining.com/#/login");
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
	@Test(priority=7)
	public void delete() throws Exception {
//Verify Deleted Record Display Or Not In Table After Deleted
		  d.get("https://eauction.mahamining.com/#/login");
		  super.Login();
		    //click On  Master
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
			//Click On Page Bidder List
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[3]/a/span")).click();
		  //Click On delete Button
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-bidder-list/div/div[3]/div/table/tbody/tr[1]/td[8]/div/button[2]/span[1]")).click();
	    //Click On Confirmation Message 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
//Verify Bidder Is Able Or Not For Register again Same PAN No After Deleted From Table 
			d.get("https://eauction.mahamining.com/#/login");
			d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[2]/button[1]")).click();
			// Search By PAN no
			// Enter PAN No. In PAN No. Field
			Thread.sleep(1000);
			d.findElement(By.id("mat-input-20")).sendKeys("BFDAD1234k");
			// Click On Search Button
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-bidder-registration/mat-card/div[2]/div[1]/form/div/div[1]/div/div[2]/button/span[1]")).click();
	}
	
}
