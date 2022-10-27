import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Signup_Screen_Class {

	public static void main(String[] args) throws InterruptedException {

		String testEmail = "batoolalshareef@gmail.com";
		String testPass = "bb@123456";

		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(testEmail);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(testPass);
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

}
