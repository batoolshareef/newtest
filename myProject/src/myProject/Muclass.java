package myProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Muclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		
		List <WebElement> items= driver.findElements(By.cssSelector(".container td:nth-of-type(3)"));
		int sum=0;
	for (int i=0; i<items.size(); i++) {
		//System.out.println(items.get(i).getText());
		sum = sum+Integer.parseInt(items.get(i).getText());
	//	System.out.println(sum);
	}
	
	driver.findElement(By.id("total")).getText().split(":")[1].trim();
	
	}

}