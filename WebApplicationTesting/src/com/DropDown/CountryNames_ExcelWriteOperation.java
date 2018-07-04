package com.DropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountryNames_ExcelWriteOperation {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countryNames=country.findElements(By.tagName("option"));

		System.out.println(countryNames.size());
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\NaliniTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
				
		for(int k=0;k<countryNames.size();k++)
		{
			String countryName=countryNames.get(k).getText();
			System.out.println(countryName);
			
			Row r=sheet.createRow(k);
			Cell c=r.createCell(0);
			c.setCellValue(countryName);
			
			FileOutputStream file1= new FileOutputStream("C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\NaliniTestData.xlsx");
			workBook.write(file1);
		}
		
		driver.close();


	}

}
