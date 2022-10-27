package linksInSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLinksClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//hello
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	//1.count all links in page	
		System.out.println(driver.findElements(By.tagName("a")).size());
		//List mytag=driver.findElements(By.tagName("a")).size();
	
	//2- count all links in footer the myfooter is a mini driver
		WebElement myfooter= driver.findElement(By.id("pageFooter"));
		System.out.println(myfooter.findElements(By.tagName("a")).size());
		
//3-count the item in the latest footer
		WebElement mynewfooter= driver.findElement(By.id("pageFooterChildren"));
		System.out.println(mynewfooter.findElements(By.tagName("a")).size());
		
	//6- get the title of each tab
		Set<String> mytabs=driver.getWindowHandles();
		Iterator<String> tabView = mytabs.iterator();
		while (tabView.hasNext()) {
			driver.switchTo().window(tabView.next());
			System.out.println(driver.getTitle());
		}
		
	
	}

}
