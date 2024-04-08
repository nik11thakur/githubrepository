package SeleniumConclusion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class READINGexcelFile {
public static void main(String[] args) throws IOException {
	FileInputStream file= new FileInputStream(System.getProperty("user.dir") + "\\ExcelFile\\Book1.xlsx");
	//Workbook
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	//Sheet
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	int rows=sheet.getLastRowNum();
	int col=sheet.getRow(0).getLastCellNum();
	System.out.println("No. of rows: "+rows);
	System.out.println("No. of Column: "+col);
	
	//Reading data from 
	for(int i=0;i<rows;i++) //rows
		{
		//getting value of row one by one
		XSSFRow currentRow=sheet.getRow(i);
		for(int j=0;j<col;j++) //column
			{
			String cellvalue=currentRow.getCell(j).toString();
			System.out.print(cellvalue+"  ");
		}
		System.out.println();
	}
	
}
}
