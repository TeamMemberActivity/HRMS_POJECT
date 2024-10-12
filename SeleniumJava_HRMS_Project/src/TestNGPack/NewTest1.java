package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest1 {
	//instance variable
	
		WebDriver driver;
		

  @Test
  public void verifyTitleOfWebpage() {
	 String  title = driver.getTitle();
	 Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
  }
  
  @BeforeClass
  public void openBrowser() {
		driver = new FirefoxDriver();//here driver is called object reference variable
		
		//Navigate the app URL
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

  }

  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }

}
