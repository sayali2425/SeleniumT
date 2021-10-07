package Asssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class google {
	
	static WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  
	 // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenuim");
	  
	  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	  
	  List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
	  System.out.println("Size" + list.size());
	  
	  for(int i=0;i<list.size();i++)
	  {
		  //System.out.println(list.get(i).getText());
		  if(list.get(i).getText().contains("selenium download"))
		  {
			  list.get(i).click();
			  break;
		  }
	  }
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYALI MHATRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
