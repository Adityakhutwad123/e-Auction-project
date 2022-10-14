package UserRegister_Admin;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class Block extends Logins{
@Test
public void Block_Unblock() throws Exception {
//Verify User Is Block/Unblock or  Not After Click Block Unblock button
	super.connection();
	super.Login(); 
	//Click On Master
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	//Click On User Register
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
	//Click On Block/Unblock Button 
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/mat-icon/mat-slide-toggle/label/span[1]/span/span[1]")).click();
	//Click  On Confirm Message 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
	//Click On Block/Unblock Button 
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/mat-icon/mat-slide-toggle/label/span[1]/span/span[1]")).click();
	//Click  On Confirm Message 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
	
}
@Test
public void login() throws Exception {
//Verify User Is Able Or For Login After Blocked By Admin
	     //Click On Block/Unblock Button 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/mat-icon/mat-slide-toggle/label/span[1]/span/span[1]")).click();
		//Click  On Confirm Message 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
		//Click On URL
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		//Enter User Name
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("Rohit");
		//Enter Password
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("Rohit@123");
		//Enter Captcha
		 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
		 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
		//Click On Login
		 Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
//2]Verify User Is Able Or Not Loin Again After Unblock By Admin
		//Login With Admin
		d.get("https://eauction.mahamining.com/#/login");
		super.Login();
		//Click On Master
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On User Register
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
		//Click On Block/Unblock Button 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/mat-icon/mat-slide-toggle/label/span[1]/span/span[1]")).click();
		//Click  On Confirm Message 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]/span[1]")).click();
		//Click On URL
				Thread.sleep(1000);
				d.get("https://eauction.mahamining.com/#/login");
				//Enter User Name
				Thread.sleep(1000);
				d.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("Rohit");
				//Enter Password
				Thread.sleep(1000);
				d.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("Rohit@123");
				//Enter Captcha
				 String Captcha1=JOptionPane.showInputDialog("Enter Your Captcha");
				 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha1);
				//Click On Login
				 Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
}
}
