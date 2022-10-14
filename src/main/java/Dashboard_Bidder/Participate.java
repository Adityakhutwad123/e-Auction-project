package Dashboard_Bidder;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Admin.Logins;

public class Participate extends Logins{
@Test(priority=1)
public void Detail() throws Exception {
//Verify Correct Details Display or Not on Page
	super.connection();
	super.Login9();
	Thread.sleep(2000);
     //Click On View details
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-home/div/div[2]/div/table/tbody/tr[1]/td[9]/div/button[1]/span[1]/mat-icon")).click();
	//Click on cross button
	Thread.sleep(2000);
	d.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-details/div/div/div/div/div[1]/div/div[2]/button/span[1]/i")).click();
	String p=d.getWindowHandle();
//Verify Correct Document Display Or Not After Click On Download Document
	Thread.sleep(1000);
	d.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate mt-1 ng-tns-c218-6 material-icons mat-icon-no-color']")).click();
	Set<String> s=d.getWindowHandles();
	Iterator <String> i=s.iterator();
	boolean c=i.hasNext();
	if(!p.equals(c)) {
		d.switchTo().window(p);
	}
//Verify Correct Plot Details Display Or Not In View plot Details Page
	Thread.sleep(1000);
	//Click On Downward Arrow
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-home/div/div[2]/div/table/tbody/tr[1]/td[9]/div/button[3]/span[1]/mat-icon")).click();
	//Click On View Details 
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-home/div/div[2]/div/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[11]/div/button/span[1]/mat-icon")).click();
}
@Test(priority=2)
public void participate() throws Exception {
	/*//Verify Event Display Or Not In Event Details Page After Bidder Participate In  Event 
	//Click on Cross Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-auction-plot-profile/div/div/div[1]/div[2]/button")).click();
	//Click On Checkbox
	Thread.sleep(1000);
	d.findElement(By.id("mat-checkbox-2")).click();
	//Click On Participate Button
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"content\"]/div/main/div/div/app-home/div/div[1]/button")).click();
//Verify checkbox is Clickable or Not
	//Click On Dashboard
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"menu\"]/li[1]/a/span[2]")).click();*/
	//check Selected or Not
	//Click on Cross Button
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-auction-plot-profile/div/div/div[1]/div[2]/button")).click();
	Thread.sleep(1000);
	WebElement w=d.findElement(By.id("mat-checkbox-1"));
    Boolean result=w.isSelected();
    System.out.println(result);
 //Verify Title of Window
    
String  Actual=d.getTitle();
String Ex="Dashboard";
Assert.assertEquals(Actual, Ex);
if(Actual.equals(Ex)) {
	System.out.println("true");
}
}
}
