package orangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.crome.ChromeDriver;

public class Day2_OpenBrowser {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getcurrentUrl());
		System.out.println(driver.getPageSource());
		
//		driver.navigate().back();
//		driver.navigate().forword();
//		driver.close();
		
		
		
	}
}











