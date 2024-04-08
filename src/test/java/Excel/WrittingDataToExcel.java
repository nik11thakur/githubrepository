package Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataToExcel {
public static void main(String[] args) throws IOException, InterruptedException {
	
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir") +"\\ExcelFile\\Writting.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	//XSSFRow rows=sheet.createRow(0);
	
//	rows.createCell(0).setCellValue("Welcome to");
//	rows.createCell(1).setCellValue("Java");
//	rows.createCell(2).setCellValue("Automation");
//	
//	XSSFRow rows1=sheet.createRow(1);
//	rows1.createCell(0).setCellValue("First");
//	rows1.createCell(1).setCellValue("Manual Testing");
//	rows1.createCell(2).setCellValue("is Done.");
//	workbook.write(file);
//	
	
	Scanner sc=new Scanner(System.in);
//	int row=3;
//	int cell=2;
	System.out.println("Enter the no of rows: ");
	int row=sc.nextInt();
	System.out.println("Enter the no  of cell: ");
	int cell=sc.nextInt();
	for(int i=0;i<row;i++) {
		XSSFRow Cellvalue=sheet.createRow(i);
	
		for(int j=0;j<cell;j++) {
			
			System.out.print("Enter the value: ");
			
			String value=sc.nextLine();
			
			Cellvalue.createCell(j).setCellValue(value);
		}
		//System.out.println();
		}
	sc.close();
	workbook.write(file);
	workbook.close();
	file.close();
	
	
}
}
