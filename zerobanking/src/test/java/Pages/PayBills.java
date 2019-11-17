package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PayBills {
	WebDriver driver;
	
	public PayBills(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Pay Bills")
	public WebElement PayBills;
	
	@FindBy(xpath="//*[@id=\"tabs\"]/ul/li[2]/a")
	public WebElement add;
	
	@FindBy(id="np_new_payee_name")
	public WebElement payeeName;
	
	
	@FindBy(id="np_new_payee_address")
	public WebElement peyeeAddress;
	
	@FindBy(id="np_new_payee_account")
	public WebElement payeeAccount;
	
	@FindBy(id="np_new_payee_details")
	public WebElement payeeDetails;
	
	@FindBy(id="add_new_payee")
	public WebElement AddBtn;
	
	@FindBy(id="alert_content")
	public WebElement veftxt;
	
	
	public void clickPayBill()
	{
		PayBills.click();
		add.click();
	}

public void dodetails (String  name, String address, String account, String details ) {
		
	payeeName.sendKeys(name);
	peyeeAddress.sendKeys(address);
	payeeAccount.sendKeys(account);
	payeeDetails.sendKeys(details);
	AddBtn.click();
		
		
	}
	public void verfTxt() {
		String text=veftxt.getText();
		String expectedText = "The new payee Alex was successfully created.";
		Assert.assertEquals(text,driver.findElement(By.id("alert_content")).getText());
		
	}
	

}
