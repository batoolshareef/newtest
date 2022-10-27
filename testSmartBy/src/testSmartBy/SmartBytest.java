package testSmartBy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBytest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smartbuy-me.com/smartbuystore/en");
		
		//1. count all links in smartBy website	
	System.out.println(	driver.findElements(By.tagName("a")).size());
	
	//2. count links in center footer using class name 
	
//	WebElement cntrfooter= driver.findElement(By.cssSelector(".center-footer"));
//	
//	System.out.println(	cntrfooter.findElements(By.tagName("a")).size());
//		
//	//3.open tabs
//	
//	for (int i=0; i<cntrfooter.findElements(By.tagName("a")).size();i++) {
//		Thread.sleep(300);
//		String opentab=Keys.chord(Keys.CONTROL, Keys.ENTER);
//		cntrfooter.findElements(By.tagName("a")).get(i).sendKeys(opentab);
//	}
//	
//	//4.name of tabs
//	Set<String> hlinks=driver.getWindowHandles();
//	Iterator<String> tabname=hlinks.iterator();
//	
//	while(tabname.hasNext()) {
//		driver.switchTo().window(tabname.next());
//		System.out.println(driver.getTitle());
//	}
	
	////------------------copy right footer
	
//WebElement cpyrfooter= driver.findElement(By.cssSelector(".col-md-12.sectioncopytow"));
//	
//	System.out.println(	cpyrfooter.findElements(By.tagName("a")).size());
//		
//	//3.open tabs
//	
//	for (int i=0; i<cpyrfooter.findElements(By.tagName("a")).size();i++) {
//		Thread.sleep(300);
//		String opentab=Keys.chord(Keys.CONTROL, Keys.ENTER);
//		cpyrfooter.findElements(By.tagName("a")).get(i).sendKeys(opentab);
//	}
////	
////	//4.name of tabs
//	Set<String> hlinks=driver.getWindowHandles();
//	Iterator<String> tabname=hlinks.iterator();
//	
//	while(tabname.hasNext()) {
//		driver.switchTo().window(tabname.next());
//		System.out.println(driver.getTitle());
//	}
	

	///header           top-footer_desktop
	
//WebElement header= driver.findElement(By.cssSelector(".top-footer_desktop"));
//	
//	System.out.println(header.findElements(By.tagName("a")).size());
//		
//	//3.open tabs
//	
//	for (int i=0; i<header.findElements(By.tagName("a")).size();i++) {
//		Thread.sleep(300);
//		String opentab=Keys.chord(Keys.CONTROL, Keys.ENTER);
//		header.findElements(By.tagName("a")).get(i).sendKeys(opentab);
//	}
////	
////	//4.name of tabs
//	Set<String> hlinks=driver.getWindowHandles();
//	Iterator<String> tabname=hlinks.iterator();
//	
//	while(tabname.hasNext()) {
//		driver.switchTo().window(tabname.next());
//		System.out.println(driver.getTitle());
//	}

	
	}

}