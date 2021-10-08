package Asssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class AccountCreateWithGoogle {
	
	static WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  driver.get("https://accounts.google.com/signup");
	  
	  driver.findElement(By.id("firstName")).sendKeys("albetros");
	  String fname= driver.findElement(By.id("firstName")).getAttribute("value");
	  System.out.println("First NAme :" +fname);
	 
	  driver.findElement(By.id("lastName")).sendKeys("anoi");
	  String lname= driver.findElement(By.id("lastName")).getAttribute("value");
	  System.out.println("Last NAme :" +lname);
	
	  driver.findElement(By.id("username")).sendKeys("albetrosanoi53");
	  String uname= driver.findElement(By.id("username")).getAttribute("data-initial-value");
	  System.out.println("Username :" +uname);
	 
	  driver.findElement(By.name("Passwd")).sendKeys("aLbetro$@123");
	  String pass=driver.findElement(By.name("Passwd")).getAttribute("data-initial-value");
	  System.out.println("Password :" +pass);
	
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("aLbetro$@123");
	  String cnpass=driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).getAttribute("data-initial-value");
	  System.out.println("Confirm Password :" +cnpass);
	  
	  driver.findElement(By.id("i3")).click();
	  
	  driver.findElement(By.id("accountDetailsNext")).click();
	  
	  driver.findElement(By.id("phoneNumberId")).sendKeys("8983752649");
	  String MNo=driver.findElement(By.id("phoneNumberId")).getAttribute("value");
	  System.out.println("Mobile NO: "+MNo);
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
	  String otp=driver.findElement(By.xpath("//*[@id=\"code\"]")).getAttribute("data-initial-value");
	  System.out.println("One Time Pass : " +otp);
	  
	  Thread.sleep(40000);
	 
	  driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/button")).click();
	  
	  driver.findElement(By.id("day")).sendKeys("11");
	  String Day=driver.findElement(By.id("day")).getAttribute("data-initial-value");
	  System.out.println("Day :" +Day
			  );
	  Select month=new Select(driver.findElement(By.id("month")));
	  
	  month.selectByVisibleText("May");
	 
	  driver.findElement(By.id("year")).sendKeys("1996");
	  String Year=driver.findElement(By.id("year")).getAttribute("data-initial-value");
	  System.out.println("year :"+Year);
	  
	  Select gender=new Select(driver.findElement(By.id("gender")));
	  gender.selectByVisibleText("Female");
	  
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
	  
	  String txt=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/c-wiz/div/div[3]/div/div/header/h1")).getText();
	  System.out.println(txt);
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
