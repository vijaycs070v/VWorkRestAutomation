package com.vwork.datahandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *Reading data required two type of code. Single time run and multiple time run.
 *The code which will be executed only once we have kept those code in constructor. And the code which
 *will run multiple time we have kept in separate method.
 *
 */
public class ExcelReader implements IDataReader {
	XSSFSheet sheet=null;
	HashMap<String, Integer> columnIndex=new HashMap<String, Integer>();
	int rownum=0;
	
	public ExcelReader(File file, String scenario)
	{
		try (FileInputStream fis=new FileInputStream(file);XSSFWorkbook wb=new XSSFWorkbook(fis))
		{			
		    sheet=wb.getSheetAt(0);
			for(int i=0;i<=sheet.getLastRowNum();i++)
			{
				if(sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(scenario))
					rownum=i;
			}
			for(int i=0;i<sheet.getRow(0).getLastCellNum();i++)
			{
				columnIndex.put(sheet.getRow(0).getCell(i).getStringCellValue(), i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@Override
	public String readData(String key) 
	{		
		return sheet.getRow(rownum).getCell(columnIndex.get(key)).getStringCellValue();
		
		  
		
	}

}
