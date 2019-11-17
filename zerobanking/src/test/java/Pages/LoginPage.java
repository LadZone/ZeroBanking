package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="user_login")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(name="submit")
	public WebElement submit;
	
	//Create method
	
	public void dologin (String  usernameTxt, String passwordTxt ) {
		
		username.sendKeys(usernameTxt);
		password.sendKeys(passwordTxt);
		submit.click();
		
		
		
	}
	

}
