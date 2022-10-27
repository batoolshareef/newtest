package swagLanProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabSite {
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1:5500/index.html");

}
