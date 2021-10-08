package Asssignments;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PincodeMatch {
	static WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://finkode.com/tn/chennai.html");
	  
	  String pincode1=driver.findElement(By.xpath("//*[@id=\"c760\"]/div[2]/table/tbody/tr[2]/td[3]/a")).getText();
	  
	  String pincode2=driver.findElement(By.xpath("//*[@id=\"c760\"]/div[2]/table/tbody/tr[3]/td[3]/a")).getText();
	  
	  Assert.assertNotSame(pincode1,pincode2,"Pincodes Are Not Same");
	  
	  Assert.assertEquals(pincode1, pincode2,"Pincodes are Unique");
	  
	  
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
