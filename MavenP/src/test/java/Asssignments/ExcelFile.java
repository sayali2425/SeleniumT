package Asssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;

public class ExcelFile {
	
  @Test
  public void readData() throws Exception {
	  
	  FileInputStream fip=new FileInputStream("C:\\Users\\SAYALI MHATRE\\Music\\Selenium\\data.xlsx");
	  
	  XSSFWorkbook xbook=new XSSFWorkbook(fip);
	  
	  XSSFSheet xsheet=xbook.getSheet("Sheet1");
	  
	  int rowcount=xsheet.getLastRowNum();
	 
	  
	  for(int i=0;i<=rowcount;i++)
	  {
		 
			  XSSFCell result=xsheet.getRow(i).getCell(0);
			  System.out.println("Data at " +i+ " is " +result);
		  }
		
		 
	 
	
	  
  }
 
}
