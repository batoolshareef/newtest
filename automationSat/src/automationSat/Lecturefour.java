package automationSat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecturefour {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://stage.dadan.io/signin");
		driver.get("https://www.facebook.com"); 
//		driver.findElement(By.linkText("Forgot password?")).getText();
//		driver.findElement(By.linkText("Forgot password?")).click();
//		driver.findElement(By.tagName("input")).sendKeys("input");

//	List<WebElement> a =driver.findElements(By.tagName("input"));
//	
//	for(int i=0; i<a.size();i++) {
//	a.get(i).sendKeys("hi");
//	
//		}
	
//	driver.findElement(By.cssSelector("input.form-control")).sendKeys("batoolalshareef@gmail.com");

	Thread.sleep(5000);
//	driver.findElement(By.xpath("//input[@placeholder='yourname@yourmail.com']")).sendKeys("hi kefkom");
//	driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("hi kefkom");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test");	
	
	
	}
}

