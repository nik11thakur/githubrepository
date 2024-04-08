package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcelFile {
public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\ExcelFile\\LANG.xlsx");
	 XSSFWorkbook workbook= new XSSFWorkbook(file);
	 XSSFSheet sheet=workbook.getSheet("Sheet1");
	  int rows=sheet.getLastRowNum();
	  int col=sheet.getRow(0).getLastCellNum();
	  
	  for(int i=0;i<rows;i++) {
		  XSSFRow r=sheet.getRow(i);
		  for(int j=0;j<col;j++) {
			  String c=r.getCell(j).toString();
			  System.out.print(c+"  ");
		  }
		  System.out.println();
	  }
	  workbook.close();
	  file.close();
	
	
	
	
	
}
}
