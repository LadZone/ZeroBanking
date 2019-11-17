package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AccountSummaryPage;
import Pages.LoginPage;
import Pages.PayBills;
import Pages.WelcomePage;

public class TestCase_login {
	public WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	AccountSummaryPage asp;
	PayBills pb;
	
	
	@BeforeMethod
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		 	driver=new ChromeDriver();
		 	
		 	wp = new WelcomePage(driver);
			lp = new LoginPage(driver);
			pb = new PayBills(driver);
			//asp = new AccountSummaryPage(driver);
		 	
		 	
			driver.get("http://zero.webappsecurity.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			
		
	}
	@Test
	public void login() {
		
		
		
		String name = "Alex";
		String address = "31 asdfghjkl";
		String account = "12345678";
		String details = "qwertyuiop";
		
		wp.clickSignInbtn();
		lp.dologin("username","password");
		//asp.title();
		  String  expectedTitle = driver.getTitle();
		 String  actualTitle= "Zero - Account Summary";
		 
		Assert.assertEquals(actualTitle, expectedTitle);
		pb.clickPayBill();
		pb.dodetails(name, address, account, details);
		pb.verfTxt();
		
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		 driver.quit();
		  		
		  }
		
	}


