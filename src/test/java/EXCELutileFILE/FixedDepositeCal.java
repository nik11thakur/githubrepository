package EXCELutileFILE;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class FixedDepositeCal {
public static void main(String[] args) throws IOException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	String file=System.getProperty("user.dir")+"\\ExcelFile\\ExcelUtile.xlsx";
	int rows=ExcelUtils.getRowCount(file,"Sheet1");//no. of rows from Excel file
	
	//read the data from Excel
	for(int i=1;i<=rows;i++) {
		String princ=ExcelUtils.getCellData(file, "Sheet1", i, 0);
		String RateOfInterest=ExcelUtils.getCellData(file, "Sheet1", i, 1);
		String Period=ExcelUtils.getCellData(file, "Sheet1", i, 2);
		String Period1=ExcelUtils.getCellData(file, "Sheet1", i, 3);
		String Frequency=ExcelUtils.getCellData(file, "Sheet1", i, 4);
		String MaturityValue=ExcelUtils.getCellData(file, "Sheet1", i, 5);
	    
		//pass the data to application
		Thread.sleep(3000);
		driver.findElement(By.id("principal")).sendKeys(princ);
	    driver.findElement(By.name("interest")).sendKeys(RateOfInterest);
	    driver.findElement(By.name("tenure")).sendKeys(Period);
	    Select predrp=new Select(driver.findElement(By.name("tenurePeriod")));
		predrp.selectByVisibleText(Period1);
		Select fredrp=new Select(driver.findElement(By.name("frequency"))); 
		fredrp.selectByVisibleText(Frequency);
	    
	    //click on calculate button
		//driver.findElement(By.xpath("//*[@href=\"javascript:void(0);\"]")).click();	    
		JavascriptExecutor js=driver;
		WebElement cal_btn=driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
		js.executeScript("arguments[0].click()",cal_btn);
	    String act_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
	    
	    //changing value to double
	    if(Double.parseDouble(MaturityValue)==Double.parseDouble(act_mvalue)) {
	    	System.out.println("Test Passed");
	    	
	    	ExcelUtils.setCellData(file,"Sheet1", i, 7, "Passed");
	    	ExcelUtils.fillGreenColor(file, "Sheet1", i,7);
	    }else {
	    	ExcelUtils.setCellData(file, "Sheet1", i, 7, "Failed");
	    	ExcelUtils.fillRedColor(file, "Sheet1", i,7);
	    }
	    //driver.findElement(By.xpath("//img[@class='PL5']")).click();
	    WebElement clear_btn=driver.findElement(By.xpath("//img[@class='PL5']"));
	    js.executeScript("arguments[0].click()",clear_btn);
	    
	}
	
	//pass the data to application
	
	
	//validation and write the data to table
	
	//https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator
	
}
}
