package Asssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class size {
	static WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("https://www.zlti.com");
	  
	  Dimension d1=new Dimension(600,600);
	  
	 driver.manage().window().setSize(d1);
	  
	 // Thread.sleep(2000);
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYALI MHATRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
