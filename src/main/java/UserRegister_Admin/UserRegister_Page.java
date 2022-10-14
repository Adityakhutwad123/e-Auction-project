package UserRegister_Admin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Admin.Logins;

public class UserRegister_Page extends Logins {
	@Test
	public void User_List() throws Exception {
//2]Verify Searched State Related user Display Or Not In Table 
		super.connection();
		super.Login();
		//Click On Master
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On User Register
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[2]/a/span")).click();
		//Click On State Dropdown
				Thread.sleep(1000);
				d.findElement(By.xpath("//mat-select[@id='mat-select-8']")).click();
				//Select State Madhya Pradesh
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[4]/span")).click();
				//Click On Apply
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button")).click();
		//Click On State Dropdown
		Thread.sleep(1000);
		d.findElement(By.xpath("//mat-select[@id='mat-select-8']")).click();
		//Select State Maharashtra
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[2]/span")).click();
		//Click On Apply
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button")).click();
//2]Verify Searched Division Related User  Display Or not In Table 
		//Click On Division drop down
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
		//Select Division As Kokan
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[4]/span")).click();
		//Click On Apply 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button")).click();
		//Click On Division drop down
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
		//Select Division As Amratvati
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[2]/span")).click();
		//Click On Apply 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button")).click();
//3]Verify Searched District Related User Display Or Not in Table 
		//Click On District Dropdown
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
		//Select District
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[2]/span")).click();
		//Click on Apply
	    Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button")).click();
		//Click On District Dropdown
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
				//Select District
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[3]/span")).click();
				//Click on Apply
			    Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button")).click();
//4]Verify Searched Taluka Related User  Display Or Not In Table 
				//Click On Taluka Drop down
				Thread.sleep(1000);
				d.findElement(By.id("mat-select-14")).click();
				//Select Taluka as achalpur
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[2]/span")).click();
				//Click on Apply
			    Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button")).click();
				//Click On Taluka Drop down
				Thread.sleep(1000);
				d.findElement(By.id("mat-select-14")).click();
				//Select Taluka amravati
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[3]/span")).click();
				//Click on Apply
			    Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button/span[1]")).click();
//5]Verify Searched Named Related Result Display Or Not In Table 
				Thread.sleep(1000);
				//Enter Name In Searched Field
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Aditya");
				//Click on Apply
			    Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button/span[1]")).click();
//6]Verify Searched Mobile No Related Result display Or Not In Table 
				Thread.sleep(1000);
				//Enter Name In Searched Field
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[5]/mat-form-field/div/div[1]/div[3]/input")).clear();
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("8600631070");
				//Click on Apply
			    Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-registration/div/div[2]/div/div/form/div/div[6]/button/span[1]")).click();
				
	}

}
