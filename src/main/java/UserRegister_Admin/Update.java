package UserRegister_Admin;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class Update extends Logins{
	@Test(priority=1)
public void update() throws Exception {
	super.connection();
	super.Login();
//Verify Updated Information Display or Not With Update
////Click On Master
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	//Click On User Register
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
	//click Edit Button
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/button[1]/span[1]/mat-icon")).click();
	//Update User Type
	//Click On User Type Drop down
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
   //Select User Type
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[4]/span")).click();
  //Update User Role 
	//Click On User Role Drop down
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
   //Select User Role 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[4]/span")).click();
   //Update Division
	//Click On Division  Drop down
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	//Select Division
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[4]/span")).click();
   //Update District 
	//Click On District Drop down
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[7]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
    //select District 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[5]/span")).click();
  //Update SDO
	//Click On SDO Drop down
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div[8]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	//Select SDO 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[3]/span")).click();
//Update Name 
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-6")).clear();
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-6")).sendKeys("Rohittt");
//Update Mobile No
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-7")).clear();
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-7")).sendKeys("8600631001");
//Update UserName
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-8")).clear();
	d.findElement(By.id("mat-input-8")).sendKeys("Rohittt");
//Update Designation
	Thread.sleep(1000);
	d.findElement(By.id("mat-select-value-27")).click();
	//Select Designation
	Thread.sleep(3000);
	d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[4]/span")).click();
	//Update Email Address
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-9")).clear();

	d.findElement(By.id("mat-input-9")).sendKeys("Rohit@gmail.com");
//Update Address
	Thread.sleep(1000);
	d.findElement(By.id("mat-input-10")).clear();
	d.findElement(By.id("mat-input-10")).sendKeys("Kapurholee");
//Click On Upadate button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-user/div/div/div/div/div[2]/div/div/form/div[2]/div/div/button[2]/span[1]")).click();
//Click On Edit Button 
  Thread.sleep(1000);
  d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[3]/div/table/tbody/tr[1]/td[7]/div/button[1]/span[1]/mat-icon")).click();
}
@Test(priority=2)
public void Update_Login() throws Exception {
//Verify User Is Able or Not For Login With Updated User Name 
	Thread.sleep(1000);
	d.get("https://eauction.mahamining.com/#/login");
	//Enter User Name
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("Rohittt");
	//Enter Password
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys("Rohit@123");
	//Enter Captcha
	 String Captcha1=JOptionPane.showInputDialog("Enter Your Captcha");
	 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha1);
	//Click On Login
	 Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
//Verify User Is Able or Not For Login With Old User Name 
		Thread.sleep(1000);
		d.get("https://eauction.mahamining.com/#/login");
		//Enter User Name
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("Rohit");
		//Enter Password
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys("Rohit@123");
		//Enter Captcha
		 String Captcha2=JOptionPane.showInputDialog("Enter Your Captcha");
		 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha2);
		//Click On Login
		 Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();	
}
@Test(priority=3)
public void UserLogin() throws Exception {
//Verify Updated Data Display Or Not With Update in User Login
	Thread.sleep(1000);
   d.get("https://eauction.mahamining.com/#/login");
	//Enter User Name
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("Rohittt");
	//Enter Password
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys("Rohit@123");
	//Enter Captcha
	 String Captcha1=JOptionPane.showInputDialog("Enter Your Captcha");
	 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha1);
	//Click On Login
	 Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
    //Click On Profile 
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/header/app-navbar/header/nav/div/div/div[2]/nav/div/ul/li[2]/a")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/header/app-navbar/header/nav/div/div/div[2]/nav/div/ul/li[2]/ul/li[2]/a")).click();
}

}
