package demobase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import blazeutility.Utils;

public class Basedemoblaze {
	
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public Basedemoblaze() {
	
		try {
			FileInputStream file=new FileInputStream("C:\\Users\\14162\\eclipse-workspace\\demoblazemanagement\\src\\test\\java\\environmentvari\\config.properties");
		prop.load(file);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
		
		@SuppressWarnings("deprecation")
		public static  void initiate (){
	String browsername=	prop.getProperty("browser");
	if (browsername.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();}
		
		else if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utils.timepage, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
		public static void screenshots(String Filename) {
		File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\14162\\eclipse-workspace\\demoblazemanagement\\src\\test\\java\\screenshot\\Screenshots"+Filename+".jpg"));
			
		}
			
			catch(IOException e) {
				e.printStackTrace();
			}
			
}
		
}
		
		
		
	

