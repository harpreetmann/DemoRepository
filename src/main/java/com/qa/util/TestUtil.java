package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;

public class TestUtil extends TestBase{

	
	public static long implicit_wait =20;
	public static long page_load_timeout=10;
	public static String  test_data_sheetpath="C:\\Users\\HMann\\FreeCRMTest\\src\\main\\java\\com\\qa\\testdata\\Test1.xlsx";
	static XSSFWorkbook wb = null;
	static XSSFSheet sheet1=null;
	
	public static Object[][] getTestData(String sheetname)
	{
		
		try {
			FileInputStream file = new FileInputStream(test_data_sheetpath);
			 wb = new XSSFWorkbook(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet1 = wb.getSheet(sheetname);
	//	int rowcount = sheet1.getLastRowNum();
		//int cellcount = sheet1.getRow(rowcount).getLastCellNum();
		Object[][] data = new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet1.getLastRowNum();i++)
		{
			for(int j=0;j<sheet1.getRow(i).getLastCellNum();j++)
			{
				data[i][j]=sheet1.getRow(i).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
				
			return data;	
				
		}
		
				
public static void takeScreenshotAtTheEndOfTest(String filename) throws IOException
{
File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file,new File("C:\\Users\\HMann\\FreeCRMTest\\screenshot"+filename+".jpg"));
}
}
