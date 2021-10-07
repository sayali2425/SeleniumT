package Asssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class scrolling {
	static WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,400)");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYALI MHATRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
