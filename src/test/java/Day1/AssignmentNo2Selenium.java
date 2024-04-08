package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNo2Selenium {
public static void main(String[] args) {
//	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://testautomationpractice.blogspot.com/");
//	//Radio button
//	driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
//	//Checkbox
//	List<WebElement> checkbox=driver.findElements(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]//div"));
//	for(int i=0;i<checkbox.size();i++) {
//		String day=checkbox.get(i).getText();
//		if(day.equals("Monday")) {
//			checkbox.get(i).click();
//			break;
//		}
//	}
//	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://www.amazon.in");
//	driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
//	String title=driver.getTitle();
//	System.out.println(title);
//	if(title.contains("About Amazon India")) {
//		System.out.println("New Page is open");
//	}else {
//		System.out.println("New page fail to open");
//	}
//	ChromeDriver driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states");
//    WebElement ct=driver.findElement(By.xpath("//select[@id='country-list']"));
//    Select drp=new Select(ct);
//    drp.selectByVisibleText("India");
//    String country=drp.getFirstSelectedOption().getText();
//    System.out.println("Selected Country: - "+country);
//    WebElement st=driver.findElement(By.xpath("//select[@id='state-list']"));
//    Select sd=new Select(st);
//	sd.selectByVisibleText("Delhi");
//	String state=sd.getFirstSelectedOption().getText();
//	System.out.println("Selected State: - "+state);

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("Java");
	List <WebElement> list  = driver.findElements( By.xpath("//[@class=\"sa_drw\"]/child::"));
	 for(int i=0;i<list.size();i++){
		 System.out.println(list.get(i).getText());

        	if(list.get(i).getText().equals("selenium tutorial")) {
        	list.get(i).click();
        	break;
        	}
     }


}
}




//List<WebElement> radiobtn=driver.findElements(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]//div"));