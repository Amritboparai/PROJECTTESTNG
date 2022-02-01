package testlayer1;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demobase.Basedemoblaze;
import pompack.Signup;
import testdata12.EXCELSHEET;

public class LOGINTEST extends Basedemoblaze {
	Signup demo;
	Signup blaze;
	public LOGINTEST() {
		
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
	 initiate();
	 screenshots("signup1234");
	 
	  demo= new Signup(driver);
	  blaze=new Signup(driver);
	}
	 @Test(priority =1)
	 public void Title() {
	
		String actual =demo.verify();
		 Assert.assertEquals(actual, "STORE");
		
	 }	 
	 @DataProvider
	 public Object[][] Details(){
		 Object result[][]=EXCELSHEET.readdata("Sheet1");
		return result;
		 
	 }
		 @Test(priority=2,dataProvider="Details")
		 public void signup(String Name,String Pass) throws InterruptedException {
			 demo.signclk();
			Thread.sleep(5000);
			 demo.typeusername(Name);
			 //Thread.sleep(3000);
			 demo.typepassword(Pass);
			 Thread.sleep(4000);
			 demo.signupbutton();
			 screenshots("nameandpass");
			 Thread.sleep(3000);
			
			 Alert alert=driver.switchTo().alert();
			 
			 alert.accept();
			
				 
				 
		 }			 
	 
@AfterMethod
public void close() {
	driver.close();
}




@Test (priority=3)
public void login() throws InterruptedException {
	blaze.presslogin();
	Thread.sleep(3000);
	blaze.typeusername1(prop.getProperty("NAME"));
	blaze.typepassword1(prop.getProperty("PASS"));
	Thread.sleep(4000);
	blaze.clickbtn();
	Thread.sleep(2000);
	 //Alert alert1 =driver.switchTo().alert();
		//alert1.accept();
		//Thread.sleep(3000);
		blaze.laptopoption();
		Thread.sleep(3000);
		blaze.laptopname();
		Thread.sleep(4000);
		blaze.addtocart();
		Thread.sleep(3000);
	Alert alert2 =driver.switchTo().alert();
	alert2.accept();
	blaze.clkcart();
	Thread.sleep(7000);
	//blaze.verifycart();
	Assert.assertEquals(blaze.verifycart(), true);	
		
}




	
	
}


