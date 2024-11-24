import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("q")).sendKeys("QSpiders");
		Thread.sleep(4000);
		List<WebElement> allitem=driver.findElements(By.xpath("(//ul[@class='sublist firstLevel'])[1]/li[contains(text(), '')]"));
		
		Thread.sleep(3000);
		int count=allitem.size();
		
		for(int i=0;i<count;i++) {
			WebElement element=allitem.get(i);
			System.out.println(element.getText());
		}
		
		
		driver.quit();
	}
}
