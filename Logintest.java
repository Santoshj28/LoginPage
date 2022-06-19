package i_LoginPageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import i_LoginPage.Loginpage;





public class Logintest {
	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/santo/OneDrive/Documents/downloaded%20All%20software(selenium%20&%20corejava)/3.software%20testing/2.selenium/0_javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		Loginpage lp = new Loginpage(driver);
		lp.loginToApplication("kiran@gmail.com","123456");
		
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard" );
	
}
}