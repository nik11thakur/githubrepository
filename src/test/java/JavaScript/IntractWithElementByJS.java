package JavaScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
public class IntractWithElementByJS {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	
    JavascriptExecutor js=driver;
    
    WebElement inputbox=driver.findElement(By.id("name"));
    //js.executeAsyncScript("argument[0].setAttribute('value','nikhil')", inputbox);
    js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
    
    WebElement inputbox1=driver.findElement(By.id("email"));
    js.executeScript("arguments[0].setAttribute('value','abc@gmai.com')", inputbox1);
    
    WebElement male=driver.findElement(By.id("male"));
    js.executeScript("arguments[0].click()", male);
    
    WebElement chkbx=driver.findElement(By.id("sunday"));
    js.executeScript("arguments[0].click()", chkbx);
    Thread.sleep(5000);
    WebElement btn=driver.findElement(By.name("Submit"));
    js.executeScript("arguments[0].click()", btn);
    
        //dropdown
//    WebElement dd=driver.findElement(By.xpath("//select[@id='country']"));
//    js.executeScript("arguments[0].click()", dd);
//    
//    String optionvalue="germany";
//    String script="arguments[0].click()",value=+ optionvalue +;;
    
    
}
}
