package SwagLabSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SwagLabSiteLogin {
	WebDriver driver;

	@Test(priority = 1)
	public void navigate() {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}

	@Test(priority = 2)
	public void credntials() {

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

	}

	@Test(priority = 3)
	public void close() {
		 driver.quit();
	}
}
