package SeleniumConclusion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WRITTINGeXCeL {
public static void main(String[] args) throws IOException {
	//File created
	FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\ExcelFile\\Book2.xlsx");
	//creating workbook
	XSSFWorkbook workbook=new XSSFWorkbook();
	//create Sheet
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	//Creating rows 
	XSSFRow rows=sheet.createRow(0);
	//creating cell and Entering data in cell
	rows.createCell(0).setCellValue("Welcome");
	rows.createCell(1).setCellValue("to");
	rows.createCell(2).setCellValue("Automation");
	workbook.write(file);
	
	
	
	
	
	
}
}
