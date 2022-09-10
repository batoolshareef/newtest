package automationSat;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrays {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
//		
//	//Static
//		int [] numbers = new int [10];
//		numbers[0]=9;
//		numbers[1]=8;
//		numbers[2]=7;
//		numbers[3]=6;
//		numbers[4]=5;
//		numbers[5]=4;
//		numbers[6]=3;
//		numbers[7]=2;
//		numbers[8]=1;
//		numbers[9]=0;
//		
//		System.out.println(numbers[9]);
//	
//	//Dynamic
//		String [] namesOfStudents = {"aa","bb","cc","dd","ee"};
//		
//		System.out.println(namesOfStudents[0]);
//		System.out.println(namesOfStudents.length);		
//		
//	//ArrayList
//		
//		ArrayList <String> std = new ArrayList();
//		std.add("aya");
//		std.add("haneen");
//		std.add("batool");
//		std.add("husam");
//		std.add("laith");
//		std.add("khaled");
//		
//		System.out.println(std.get(3));
//		System.out.println(std.size());
//	//	System.out.println(std.lastIndexOf(std));
		
		
		
		List<WebElement> options = driver.findElements(By.className("op"));
		for (int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
	
	}

}
