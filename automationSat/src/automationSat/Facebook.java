package automationSat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("aaa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aaaa");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button._6lth")).click();
	}

}
