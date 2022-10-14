package Admin;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Page_List extends Logins {
@BeforeTest
public void LoginWithSubAdmin() throws Exception {
	super.connection();
	super.Login();
}
/*@Test
public void Add_Page() throws Exception {
	//Click On Master
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
	//Click On Page List
	Thread.sleep(1000);
	d.findElement(By.xpath("//span[@class=\"d-none d-sm-inline ng-tns-c193-4\"]")).click();
	//Click On Add Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//button[@class=\"mat-focus-indicator lh-2 btn-primary px-1 pe-3 w-auto mat-raised-button mat-button-base mat-add\"]")).click();
	//Click On  Page Type Dropdown
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	//Select Page Type As Inside Module
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[1]/span")).click();
	//Enter Page Name 
	Thread.sleep(1000);
	d.findElement(By.xpath("//input[@data-placeholder=\"Page Name \"]")).sendKeys("Testingg Page");
	//Enter Page URL
    Thread.sleep(1000);
    d.findElement(By.xpath("//input[@data-placeholder=\"Page url \"]")).sendKeys("http//TestPagee");
    //Enter Menu Icon
    Thread.sleep(1000);
    d.findElement(By.id("mat-input-8")).sendKeys("Master");
    //Click On Submit button
    Thread.sleep(1000);
    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]")).click();
}*/
@Test(priority=1)
public void Verify_PageType() throws Exception {
	
//Verify Page Add Or not inside Module
	//Click On Master
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/a/span[2]")).click();
		//Click On Page List
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[@class=\"d-none d-sm-inline ng-tns-c193-4\"]")).click();
		//Click On Add Button
			Thread.sleep(3000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/div[1]/div[2]/button")).click();
			//Click On  Page Type Dropdown
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			//Select Page Type As Inside Module
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[1]/span")).click();
			//Enter Page Name 
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@data-placeholder=\"Page Name \"]")).sendKeys("Tee Page");
			//Enter Page URL
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@data-placeholder=\"Page url \"]")).sendKeys("http//TestPageee");
		    //Enter Menu Icon
		    Thread.sleep(2000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Master");
		    //Click On Submit button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]")).click();
		   //Click On User Right Access
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[1]/a/span[2]")).click();
		   //Click On Next Arrow
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/mat-paginator/div/div/div[2]/button[4]/span[1]")).click();
		    //Select Access
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/table/tbody/tr[2]/td[6]/mat-checkbox/label/span[1]")).click();
		    //Click On Submit Button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[3]/button[2]/span[1]")).click();
		    //click On Page List
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
//Verify Page Add Or Not In Show In side Bar
		    Thread.sleep(1000);
		  //Click On Add Button
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/div[1]/div[2]/button/span[1]")).click();
			//Click On  Page Type Dropdown
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			//Select Page Type As Show In Side Bar
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[2]/span")).click();
			//Enter Page Name 
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@data-placeholder=\"Page Name \"]")).sendKeys("Testerr Page3");
			//Enter Page URL
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@data-placeholder=\"Page url \"]")).sendKeys("http//TestPageee");
		    //Enter Menu Icon
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Master");
		    //Click On Submit button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]")).click();
		  //Click On User Right Access
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[1]/a/span[2]")).click();
		   //Click On Next Arrow
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/mat-paginator/div/div/div[2]/button[4]/span[1]")).click();
		    //Select Access
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/table/tbody/tr[3]/td[6]/mat-checkbox/label/span[1]")).click();
		    //Click On Submit Button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[3]/button[2]/span[1]")).click();
		    //click On Page List
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
//Verify Page Add Or Not In Show In Inside Module
		    Thread.sleep(1000);
		  //Click On Add Button
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/div[1]/div[2]/button/span[1]")).click();
			//Click On  Page Type Dropdown
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			//Select Page Type As Show Inside Module
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[3]/span")).click();
			//Click On Module Name Drop Down 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).click();
			//Select Module 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/mat-option[2]/span")).click();
			//Enter Page Name 
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Testerrr Page");
			//Enter Page URL
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@data-placeholder=\"Page url \"]")).sendKeys("http//TestPageeee");
		    //Enter Menu Icon
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Master");
		    //Click On Submit button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]")).click();
		  //Click On User Right Access
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[1]/a/span[2]")).click();
		   //Click On Next Arrow
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/mat-paginator/div/div/div[2]/button[4]/span[1]")).click();
		    //Select Access
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/table/tbody/tr[4]/td[6]/mat-checkbox/label/span[1]")).click();
		    //Click On Submit Button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-user-right-access/div/div/div/div[3]/button[2]/span[1]")).click();	
}
@Test(priority=2)
public void update() throws InterruptedException {
//1]Verify Updated Page Name Display Or Not With Update
	//Click On Page List 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/app-sidebar/nav/div/div[3]/div/ul/li[2]/ul/li[1]/a/span")).click();
   //Click On Next Page Arrow
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/mat-paginator/div/div/div[2]/button[4]/span[1]")).click();
   //Click On Edit Button
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/table/tbody/tr[2]/td[5]/button[1]/span[1]/mat-icon")).click();
  //Update Page Name 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).clear();
    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Tee Page Name ");
  //Click On Update Button
    Thread.sleep(1000);
    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]/span[1]")).click();
//2]Verify Updated Page Url Display Or  Not With Update
      //Click On Edit Button
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/table/tbody/tr[2]/td[5]/button[1]/span[1]/mat-icon")).click();
	   //Update Page URL
	    Thread.sleep(1000);
	    d.findElement(By.id("mat-input-26")).clear();
	    d.findElement(By.id("mat-input-26")).sendKeys("http//TestPageee Url");
	   //Click On Update Button
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]/span[1]")).click();
//3]Verify Updated Page Type Related page Display Or Not in Module Or Side Bar 
	    //Click On Edit Button
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/table/tbody/tr[2]/td[5]/button[1]/span[1]/mat-icon")).click();   
	    //Click On Page type Dropdown
	     Thread.sleep(2000);
	     d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
	    //Select Page Type as show in side bar
	     Thread.sleep(2000);
	     d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[2]/span")).click();
	     //Click On Update Button
	     Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]/span[1]")).click();
        //B} //Click On Edit Button
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/table/tbody/tr[2]/td[5]/button[1]/span[1]/mat-icon")).click();   
		    //Click On Page type Dropdown
		     Thread.sleep(2000);
		     d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
		    //Select Page Type as show in Inside Module 
		     Thread.sleep(2000);
		     d.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[3]/span")).click();
		     //Click On Module Name 
		     Thread.sleep(1000);
		     d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).click();
		     //Select Module
		     Thread.sleep(1000);
		     d.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/mat-option[2]/span")).click();
		     //Click On Update Button
		     Thread.sleep(1000);
			 d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-page-add/div/div/div/div/div[2]/div/div/form/div[3]/div/div/button[2]/span[1]")).click();   
}
@Test(priority=3)
public void Delete() throws Exception {
//Verify Deleted Record Remove Or Not From Table 
	    //Click On Delete Button
	    Thread.sleep(2000);
	    d.findElement(By.xpath("/html/body/app-root/app-partial-layout/div/div/div/main/div/div/app-page-list/div/table/tbody/tr[2]/td[5]/button[2]/span[1]")).click();
	    //Click on Confirmation Message 
	    Thread.sleep(1000);
	    d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-dialog/div/div/div/div/div[2]/div[3]/div/button[2]")).click();
	    //Some Test Cases Remaining
}
@AfterTest
public void closeconnction() {
	d.close();
}
}
