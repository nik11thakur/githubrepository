package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
//    //code for minimum slider element
//	WebElement e1=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
//    System.out.println(e1.getLocation());//value for the web element
//    
//    Actions act=new Actions(driver);
//    act.dragAndDropBy(e1, 100, 0).perform();
//    System.out.println("After enter value:- "+e1.getLocation());
//    
//    //maximum slider element
//    WebElement e2=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
//    System.out.println(e2.getLocation());
//    Actions act1=new Actions(driver);
//    act1.dragAndDropBy(e2, -200, 0).perform();
//    System.out.println("After value:- "+e2.getLocation());
    driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
    WebElement el=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
    Actions act=new Actions(driver);
    act.dragAndDropBy(el, 100, 0).perform();
    

}
}
