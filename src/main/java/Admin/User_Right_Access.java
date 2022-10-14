package Admin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class User_Right_Access extends Logins {
@BeforeTest
public void LoginWithSubadminn() throws Exception {
	super.connection();
	super.Login();
}
/*@Test
public void UserType() throws Exception {
//1]Verify Project Drop Down clickable Or Not
	Thread.sleep(5000);
	//d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
	//Verify User Type Drop Down Clickable Or Not
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
//2]Verify Selected User Type Related Access Display Or Not In Table 
	//Click On Admin
	 Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[1]/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
		Thread.sleep(1000);
		//Click On Apply Button
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button/span[1]")).click();
		
3]Verify Selected User Type Related Access Display Or Not In Table
		//Click On User Type Drop Down
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
		//Click On Bidder 
		Thread.sleep(5000);
		d.findElement(By.xpath("//mat-option[@id=\"mat-option-2\"]")).click();

//4]Verify Selected User Type Related Access Display Or Not In Table
				//Click On User Type Drop Down
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
		      //Click On Event User
				Thread.sleep(5000);
				d.findElement(By.xpath("//*[@id=\"mat-option-3\"]")).click();
}*/
@Test
public void SubUser_Type() throws Exception {
	//1]Verify Selected SubUser_Type Related Record display Or Not In Table 
	//Click On SubUserType Drop Down
	Thread.sleep(5000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
	//Select SubUser Type Call Center
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[1]/span")).click();
	//Click on Apply Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button/span[1]")).click();
	//Click On SubUserType Drop Down
	Thread.sleep(5000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
	//Select SubUser Type District Executive 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[2]/span")).click();
	//Click on Apply Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button/span[1]")).click();
	//2]Verify SubUser Type Related Record Display Or Not in Table When User Type Is Event User
	//click On User Type Drop down
	Thread.sleep(2000);
	d.findElement(By.xpath("//div[@id='mat-select-value-3']")).click();
	//Select User Type
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[3]/span")).click();
	//Click On SubUser Type drop Down
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	//Select SubUser Type As State
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[1]/span")).click();
	//Click On Apply Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button")).click();
	//Click On SubUser Type drop Down
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	//Select SubUser Type As District
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[2]/span")).click();
	//Click On Apply Button
	   Thread.sleep(1000);
	   d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button")).click();
	   //Click On SubUser Type drop Down
	     Thread.sleep(1000);
	     d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	   //Select SubUser Type As SDO
	     Thread.sleep(2000);
	   d.findElement(By.xpath("//*[@id=\"mat-option-10\"]/span")).click();
	   //Click On Apply Button
	   Thread.sleep(1000);
	   d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button")).click();
	 //Click On SubUser Type drop Down
	     Thread.sleep(1000);
	     d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	   //Select SubUser Type As Tehsil
	     Thread.sleep(2000);
	   d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[4]/span")).click();
	   //Click On Apply Button
	   Thread.sleep(1000);
	   d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button")).click();
}
@Test(priority=1)
public void Role_Type() throws Exception {
	  //click On User Type Drop down
    Thread.sleep(2000);
    d.findElement(By.xpath("//div[@id='mat-select-value-3']")).click();
    //Select User Type
    Thread.sleep(1000);
    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[3]/span")).click();
    //Click On  Role Type Dropdown
    Thread.sleep(1000);
    d.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c65-13 ng-star-inserted']")).click();
    //Select  On Role Type Approver
    Thread.sleep(1000);
    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[1]/span")).click();
    //Click On Apply Button 
    Thread.sleep(1000);
    d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    //Click On  Role Type Dropdown
    Thread.sleep(5000);
    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
    //Select  On Role Type Seller
    Thread.sleep(1000);
    d.findElement(By.xpath("//mat-option[@id=\"mat-option-22\"]")).click();
    //Click On Apply Button 
    Thread.sleep(1000);
    d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
  //Click On  Role Type Dropdown
    Thread.sleep(5000);
    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
    //Select  On Role Type 
    Thread.sleep(1000);
    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[3]/span")).click();
    //Click On Apply Button 
    Thread.sleep(1000);
    d.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
/*@Test
public void Role_Type1() throws Exception {
	  Thread.sleep(5000);
//Click On Role Type Drop Down
	  d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
      //Select Role
	  Thread.sleep(1000);
	  d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option/span")).click();
	  //Click on Apply Button 
	  Thread.sleep(1000);
	  d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button")).click();
	  
}*/
/*@Test
public void pageName() throws Exception {
	//Verify Searched Page Name Display Or Not 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Documents Verification");
	//Click On Apply Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[2]/div/div/form/div/div[6]/button/span[1]")).click();
}*/

}
