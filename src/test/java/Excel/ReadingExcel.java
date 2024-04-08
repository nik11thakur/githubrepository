package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\ExcelFile");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet");
	int rows=sheet.getLastRowNum();
	int col=sheet.getRow(1).getLastCellNum();
	System.out.println(rows);
	System.out.println(col);
	for(int r=0;r<rows;r++) {
		XSSFRow currentRow=sheet.getRow(r);
		for(int c=0;c<col;c++) {
//			XSSFCell cellvalue=currentRow.getCell(c);
//			String cell=cellvalue.toString();
//			
			String cellvalue=currentRow.getCell(c).toString();
			System.out.print(cellvalue+"    ");
		}
		System.out.println();
	}
	workbook.close();
	file.close();





}
}
