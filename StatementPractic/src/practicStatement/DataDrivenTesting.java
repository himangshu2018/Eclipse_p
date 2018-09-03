package practicStatement;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDrivenTesting {

	public static void main(String[] args) throws Exception    {
		
		File f=new File("‪C:\\Users\\himesh\\Desktop\\BI.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		String abc=s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(abc);
		fis.close();
	 
	}
}
