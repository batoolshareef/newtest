package bookingWebsite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BookingWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");

		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]")).click();

		driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[1]/td[7]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[2]"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		
		 String error_msg= driver.findElement(By.xpath("//*[@id=\"destination__error\"]/div")).getText();
		 
		 String ExpectedMsg= "are you stupid";
		 
		 System.out.println(error_msg);
		 
		Assert.assertEquals(error_msg, ExpectedMsg);

	}

}
