package the_test_of_google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Box_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		// to print the first result
		WebElement result = driver.findElement(By.className("DKV0Md"));
		System.out.println("The First Result is: " + result.getText());

		List<WebElement> listResult1 = driver.findElements(By.className("DKV0Md"));
		// to print the Count of results as class name DKV0Md
		System.out.println("The Count of Results as class name DKV0Md is: " + listResult1.size());

//		 to print the names of results as class name DKV0Md
		for (int i = 0; i < listResult1.size(); i++) {
			System.out.println(listResult1.get(i).getText());
		}

//		this solve with changing the class name section (LC20lb_MBeuO_DKV0Md)
		List<WebElement> listResult2 = driver.findElements(By.className("MBeuO"));
//		// to print the Count of results as class name MBeuO
		System.out.println("The Count of Results as class name MBeuO is: " + listResult2.size());
//
//		// to print the names of results as class name MBeuO
		for (int i = 0; i < listResult2.size(); i++) {
			System.out.println(listResult2.get(i).getText());
		}

		List<WebElement> listResult3 = driver.findElements(By.className("LC20lb"));
//		// to print the Count of results as class name LC20lb
		System.out.println("The Count of Results as class name LC20lb is: " + listResult3.size());
//
//		// to print the names of results as class name LC20lb
		for (int i = 0; i < listResult3.size(); i++) {
			System.out.println(listResult3.get(i).getText());
		}
	}

}
