package Asssignments;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class SwitchToNewTab {
	static WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	  
	  driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[2]/a")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[2]/a")).click();
	  
	  Select field=new Select(driver.findElement(By.id("search_type")));
	  Thread.sleep(2000);
	  field.selectByVisibleText("First Name");
	  
	  driver.findElement(By.id("search_patient")).click();
	  
	  String expText="- -, Rahmawati";
	  String actTxt=driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[39]/td[2]/a")).getText();
	  
	   Assert.assertEquals(expText, actTxt);
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYALI MHATRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
