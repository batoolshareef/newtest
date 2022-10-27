import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.out.println("My Name Is: Batool AlShareef");
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver2 = new ChromeDriver();
		driver.manage().window().maximize();

//		driver2.get("https://www.google.com/");
//		Thread.sleep(3000);

		driver.get("https://web.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("batoolalshareef@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("_9npi")).sendKeys("BB123456");
		driver.get("https://www.linkedin.com//");
		Thread.sleep(3000);
		driver.navigate().back();
	}

}
