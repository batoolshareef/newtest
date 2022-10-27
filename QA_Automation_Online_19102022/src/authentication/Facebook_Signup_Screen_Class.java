package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Signup_Screen_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/index.html");
		Thread.sleep(2000);
		
		driver.findElement(By.className("js-header-login-link")).click();
		
		
		
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();

		// Strictly Typed Language like Java language
//		String myName="Batool";
//		int myAge=40;
//		double myHeight=160.2;
//		boolean iLoveBatool=true;
//		
//		System.out.println("My Name Is:"+myName+ ", My Age Is: "+ myAge+ ", My Height Is: "+myHeight+", Do You Love Batool: "+iLoveBatool);

	}

}
