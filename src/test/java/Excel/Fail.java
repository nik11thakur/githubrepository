package Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fail {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	driver.findElement(By.id("principal")).sendKeys("abcd");
	
	
}
}
