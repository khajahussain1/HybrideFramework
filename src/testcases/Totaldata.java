package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Totaldata {
	
  @Test
  public void khaja() throws IOException 
  {
	  String path = System.getProperty("user.dir")+"/src/testData/TestData.xlsx";
	  File f=new File(path);
	  FileInputStream fi=new FileInputStream(f);
	  XSSFWorkbook wb=new XSSFWorkbook(fi);
	  XSSFSheet s=wb.getSheet("Sheet1");
	  
	  int totalrows = s.getPhysicalNumberOfRows();
	  int totalcolms = s.getRow(0).getLastCellNum();
	  System.out.println(totalrows);
	  System.out.println(totalcolms);
	  
	  
	  for (int i = 0; i < totalrows; i++) 
	  {
		for (int j = 0; j < totalcolms; j++) 
		{
			String celldata = s.getRow(i).getCell(j).getStringCellValue();
			System.out.print(celldata+": ");
			
		}
		System.out.println();
	}
  }
  
  
}
