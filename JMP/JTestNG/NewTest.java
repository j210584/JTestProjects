package JTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  obj.findElement(By.id("gsc-i-id1")).sendKeys("Test");
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jaish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.selenium.dev/download");
  }

  @AfterTest
  public void afterTest() {
	  obj.close();
  }

}
