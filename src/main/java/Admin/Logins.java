package Admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logins {
public   WebDriver d;
File f;
FileInputStream fis;
XSSFWorkbook w;
XSSFSheet s;
XSSFRow r;
XSSFCell c;
int ro,co;

public void connection() throws Exception {
	System.setProperty("webdriver.chrome.driver","Z:\\Chrome Driver\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://eauction.mahamining.com/#/login");
	f= new File("Z:\\e-Auction Logins.xlsx");
	fis= new FileInputStream(f);
    w= new XSSFWorkbook(fis);
}
public void Login() throws Exception {
	System.out.println("run Login");
//Login With Admin
	s=w.getSheet("Sheet1");
for(ro=0;ro<8;ro++) {
	 if(ro==0) {
		  r=s.getRow(ro); 
	  for(co=0;co<2;co++) 		
	  { 			
		  c=r.getCell(co); 
		if(co==0) {
		  String Username1=c.getStringCellValue();
	  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
	  Thread.sleep(2000);
		}
		else {}
		if(co==1) {
			String Password=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Password);
			  Thread.sleep(2000);
		}
			 
    }
	//Enter Your Captcha
		 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
	//Click On Login
	d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();  
}	
}
}
public void Login2() throws Exception {
	s=w.getSheet("sheet1");
	for(ro=0;ro<8;ro++) {
	if(ro==1) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String password=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(password);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();

	 }
		}
	
}
public void Login3() throws Exception {
	s=w.getSheet("sheet1");
	for(ro=0;ro<8;ro++) {
	if(ro==2) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String Username2=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Username2);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
	 }
	
	}
	
}
public void Login4() throws Exception
{
//Satara District Approver
	s=w.getSheet("sheet1");
	for(ro=0;ro<8;ro++) {
	if(ro==3) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String Username2=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Username2);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
	 }
	
	}

}
public void Login5() throws Exception
{
//State Level Approver
	s=w.getSheet("sheet1");
	for(ro=0;ro<8;ro++) {
	if(ro==4) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String Username2=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Username2);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
	 }
	
	}

}
public void Login6() throws Exception
{
//State Level Approver
	s=w.getSheet("sheet1");
	for(ro=0;ro<8;ro++) {
	if(ro==5) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String Username2=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Username2);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
	 }
	
	}

}
public void Login7() throws Exception
{
//Diff District Seller 
	s=w.getSheet("sheet1");
	for(ro=0;ro<8;ro++) {
	if(ro==6) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String Username2=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Username2);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
	 }
	
	}

}
public void Login8() throws Exception
{
//Same Level Seller 
	s=w.getSheet("sheet1");
	for(ro=0;ro<8;ro++) {
	if(ro==7) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String Username2=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Username2);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
	 }
	
	}

}
public void Login9() throws Exception
{
//Same Level Seller 
	s=w.getSheet("sheet1");
	for(ro=0;ro<9;ro++) {
	if(ro==8) {
		  r=s.getRow(ro); 
		  for(co=0;co<2;co++) 		
		  { 			
			  c=r.getCell(co); 
			if(co==0) {
			  String Username1=c.getStringCellValue();
		  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(Username1);
		  Thread.sleep(2000);
			}
			else {}
			if(co==1) {
				String Username2=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Username2);
				  Thread.sleep(2000);
			}
				 
	    }
		//Enter Captcha
			 String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Captcha);
			//Click On Login
			 d.findElement(By.xpath("/html/body/app-root/app-web-layout/div/div/div/app-login/div[3]/div[2]/form/div[3]/button/span[1]")).click();
	 }
	
	}

}
}