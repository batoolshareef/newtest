package automationSat;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sixteenthjuly {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		Date stamptime = new Date();
		System.out.println(stamptime);
		
		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File(".//screenshots//"+"pic.png"));
	}

}
