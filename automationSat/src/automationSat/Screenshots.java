package automationSat;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
	}


	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
		
}
