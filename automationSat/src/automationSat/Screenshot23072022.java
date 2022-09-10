package automationSat;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot23072022 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		Date timestamp = new Date();
		String newtmestamp=timestamp.toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		
		File file = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("./ScreenShot_Folder/"+ newtmestamp + ".png"));

		

	}

}


//FileUtils.copyFile(file, new File("./ScreenShot_Folder/Test1_Login.png"));
