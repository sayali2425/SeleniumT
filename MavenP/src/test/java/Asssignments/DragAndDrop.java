package Asssignments;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DragAndDrop {

	public WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYALI MHATRE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		 driver.get("https://jqueryui.com/droppable/");
		 Thread.sleep(500);
		 
		  
		  Actions act=new Actions(driver);
		  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		  
		  WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		  WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		  
		  act.dragAndDrop(from, to).build().perform();
		 
		  Thread.sleep(500);
		  String txt=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
		  System.out.println(txt);
		
		  
	}

}
