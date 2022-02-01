package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demobase.Basedemoblaze;

public class Signup extends Basedemoblaze{
	
	@FindBy(id="signin2")
	WebElement signup;
	
	@FindBy(id="sign-username")
	WebElement Username;
	@FindBy(id="sign-password")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	WebElement sigupbutton;
	
	
	@FindBy(id="login2")
	WebElement presslogin;
	
	
	@FindBy(id="loginusername")
	WebElement USERNAME;
	@FindBy(id="loginpassword")
	WebElement PASSWORD;
	@FindBy(css="#logInModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")
	WebElement loginbutton;
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	WebElement laptopopt;
	@FindBy(className="hrefch")
	WebElement namelaptop;
	@FindBy(css="#tbodyid > div.row > div > a")
	WebElement addcart;
	@FindBy(id="cartur")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"tbodyid\"]/tr/td[1]/img")
	WebElement verify;
	
	
	
	
	
	
	
	
	
	
	public Signup(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void signclk() {
		signup.click();
	}
	
	
	public void typeusername(String username) {
		
		Username.sendKeys(username);
	}
		
		
public void typepassword(String password) {
		
		Password.sendKeys(password);
	}

	public void signupbutton() {
		sigupbutton.click();
	}
	public void presslogin() {
		presslogin.click();
	}
	
	
	public void typeusername1(String NAME) {
		
		USERNAME.sendKeys(NAME);
	}
		
		
public void typepassword1(String PASS) {
		
		PASSWORD.sendKeys(PASS);
	}

	public void clickbtn() {
		loginbutton.click();
	}
	public void laptopoption() {
		laptopopt.click();
	}
	public void laptopname() {
		namelaptop.click();
	}
	public void addtocart() {
		addcart.click();}
	public void clkcart() {
			cart.click();}
	public boolean verifycart() {
		return verify.isDisplayed();
			
		}
	
	
	
	
	
	
	
	
	
	
	
	public String verify()	{
		return driver.getTitle();
		
	}
		
	
	
}
