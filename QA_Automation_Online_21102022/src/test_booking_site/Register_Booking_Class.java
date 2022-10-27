package test_booking_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Booking_Class {

	public static void main(String[] args) throws InterruptedException {
		//String testEmail="batoolalshareef@gmail.com";
		String testEmail="batoolalshareef1982@gmail.com";
		String testPass="Batool1982";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'Register')])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(testEmail);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("new_password")).sendKeys(testPass);
		
		Thread.sleep(3000);
		driver.findElement(By.id("confirmed_password")).sendKeys(testPass);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		//We Cannot automate robot press
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//*[@id=\"ZOvfeZZDTYggjTS\"]")).click();
		

	}

}
