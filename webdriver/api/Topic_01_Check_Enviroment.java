package api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_01_Check_Enviroment {
	WebDriver driver;
 @BeforeClass
 public void beforeClass() {
	 driver = new FirefoxDriver();
	 driver.get("https://www.google.com");
	  }
 //test
  @Test
  public void TC_01_Check_Empty_Email() {
  }
  @Test
  public void TC_02_Check_SpecialCharacter_Email() {
  }
  @Test
  public void TC_03_Check_Incorrect_Email() {
  }
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
