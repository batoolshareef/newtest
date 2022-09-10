package automationSat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abcit_channel {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.youtube.com/c/rame4saqqa");
			Thread.sleep(2000);
		
			driver.findElement(By.cssSelector(".style-scope.ytd-button-renderer.style-destructive.size-default")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".style-scope.ytd-button-renderer.style-blue-text.size-default")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("identifier")).sendKeys("batoolalshareef@gmail.com");
			Thread.sleep(2000);
		
		}

		}
