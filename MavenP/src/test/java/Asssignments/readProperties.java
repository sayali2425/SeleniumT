package Asssignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class readProperties {
  @Test
  public void f() throws Exception {
	  
	  Properties prop=new Properties();
	  
	  FileInputStream fip=new FileInputStream("C:\\Users\\SAYALI MHATRE\\git\\SeleniumT\\MavenP\\src\\test\\java\\Asssignments\\config.properties");
	  
	  prop.load(fip);
	  
	  System.out.println("Broser :" +prop.getProperty("browser"));
	  System.out.println("Url :" +prop.getProperty("url"));
	  System.out.println("Username :" +prop.getProperty("username"));
	  System.out.println("Password :" +prop.getProperty("password"));
	  
  }
}
