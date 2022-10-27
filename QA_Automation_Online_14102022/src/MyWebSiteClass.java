import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWebSiteClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		;
		driver.get("http://127.0.0.1:5500/index.html");
		Thread.sleep(3000);

		// to get the text label
		driver.findElement(By.id("label_1")).getText();

		// to print the label text by id
		System.out.println(driver.findElement(By.id("label_1")).getText());

		// to print the label text in upper case
		System.out.println(driver.findElement(By.id("label_1")).getText().toUpperCase());

		// to print the length of label text
		System.out.println(driver.findElement(By.id("label_1")).getText().length());

		// to send values in website of email $ password
		driver.findElement(By.id("email")).sendKeys("batoolalshareef@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("password")).sendKeys("22255ss");
		Thread.sleep(3000);

		driver.findElement(By.id("date")).sendKeys("23/05/1982");
		Thread.sleep(3000);

		driver.findElement(By.id("mobile")).sendKeys("00962796244658");
		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();
	}

}
