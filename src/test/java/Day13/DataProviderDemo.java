package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	ChromeDriver driver;
	@Test(priority=1)
	void setup() {
	driver=new ChromeDriver();
	}
@Test(dataProvider="dp",priority=2)
void TestLogin(String email,String passwd) {
	driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(passwd);
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	
	String exp="nopCommerce demo store";
	String act=driver.getTitle();
	Assert.assertEquals(exp,act);
}
   @Test(priority=3)
    void tearup() {
	   driver.close();
   }
	
	@DataProvider(name="dp")
	String[][]loginData(){
		String data[][]= {{"abc@gmail.com","test12"},{"david@gmail.com","test123"},{"john1@gmail.com","hello"}};
		return data;
	}
}
/*import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {

ChromeDriver driver;
@Test(priority=1)
void setup()
{
driver = new ChromeDriver();
}

@Test(dataProvider="dp", priority=2)
void login(String email,String passwd)
{
driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
driver.findElement(By.id("Email")).sendKeys(email);
driver.findElement(By.id("Password")).sendKeys(passwd);
driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

String exp = "nopCommerce demo store";
String act = driver.getTitle();

Assert.assertEquals(exp, act);
}

@Test (priority=3)
void tearup()
{
driver.close();
}

@DataProvider(name="dp")
String[][] logindata()
{
String Data[][]= { {"abc@gmail.com","test"},
{"david@gmail.com","test123"},
{"cv@gmail.com","test1"}
};

return Data;
}

}
*/
