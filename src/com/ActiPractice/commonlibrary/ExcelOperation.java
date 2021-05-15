package com.ActiPractice.commonlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation
{
	public static String excelReadData(String sheetname,int rownum,int cellnum)
	{
		try
		{
		FileInputStream fis = new FileInputStream("./TestData/userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		String data = w1.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static void excelWriteData(String sheetname,int rownum,int cellnum,String actRes)
	{
		try
		{
			FileInputStream fis = new FileInputStream("./TestData/userdata.xlsx");
			Workbook w1 = WorkbookFactory.create(fis);
			w1.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(actRes);
			FileOutputStream fos = new FileOutputStream("./TestData/userdata.xlsx");
			w1.write(fos);
		}
		catch(Exception e)
		{
			
		}
	}
}
