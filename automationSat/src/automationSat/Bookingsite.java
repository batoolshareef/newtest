package automationSat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookingsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/index.ar.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text()),'رحلات الطيران')]")).click();
	}

}

