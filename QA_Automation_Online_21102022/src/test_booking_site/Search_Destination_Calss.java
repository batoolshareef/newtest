package test_booking_site;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Destination_Calss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.booking.com");
		Thread.sleep(3000);

		// To scroll down the website
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);

		// To Select Destination search bar
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[1]/div/div")).click();
		Thread.sleep(3000);

		// To select the city amman
		driver.findElement(
				By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[1]/div/div/div[2]/ul/li[3]/div"))
				.click();
		Thread.sleep(3000);

//To select the Check in & out bar
		driver.findElement(By.xpath("//button[@class='d47738b911 fe211c0731 d67d113bc3']")).click();
		Thread.sleep(3000);
// To select the check in date
		driver.findElement(By.xpath("//span[@aria-label='1 November 2022']//span")).click();
		Thread.sleep(3000);

		// To select the check out date
		driver.findElement(By.xpath("//span[@aria-label='17 November 2022']//span")).click();
		Thread.sleep(3000);

		// To select the adult bar
		driver.findElement(By.xpath("//div[@class='ef737e9709']")).click();
		Thread.sleep(3000);

//To select the number of adult
		driver.findElement(By.xpath(
				"//button[@class='fc63351294 a822bdf511 e3c025e003 fa565176a8 f7db01295e e1b7cfea84 cd7aa7c891']//span[@class='b6dc9a9e69 e25355d3ee']//*[name()='svg']"))
				.click();
		Thread.sleep(3000);

		// To select done button
		driver.findElement(
				By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[3]/div/div/div/button")).click();
		Thread.sleep(3000);

		// to press search button
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/div/form/div[1]/div[4]/button")).click();
		Thread.sleep(3000);

	}

}
