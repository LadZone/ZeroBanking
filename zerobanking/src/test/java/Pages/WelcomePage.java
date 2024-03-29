package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	WebDriver driver;
	public WelcomePage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	
	//locate web Element
	
	@FindBy(id="signin_button")
	public WebElement singinbtn;
	
	//creating a method
	public void clickSignInbtn()
	{
		singinbtn.click();
	}

}
