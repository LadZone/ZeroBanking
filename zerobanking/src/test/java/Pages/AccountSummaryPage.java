package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.TestCase_login;


 
public class AccountSummaryPage {
	
	
 	
	
	 WebDriver driver;
	public AccountSummaryPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(tagName="title")
	public WebElement title1;
	
	 public String  expectedTitle = driver.getTitle();
	 public String  actualTitle= "Zero - Account Summary";
	// assertEquals(expectedTitle,actualTitle);

	 
	//Create method 
	
	public void title() {
		assertEquals(expectedTitle,actualTitle);
	}
}
