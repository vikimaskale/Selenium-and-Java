package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.navigate().to("https://petstore.octoperf.com/");
//		driver.manage().window().maximize();
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://leetcode.com/accounts/login/");
		driver.manage().window().maximize();
		
		
		
		driver.close();
	}
}
